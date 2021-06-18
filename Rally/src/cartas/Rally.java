package cartas;
import java.util.*;

/**
 * 
 * Nesta classe chamam se metodo jogo e tudo assossiado a ele como ver resultado,criar jogador e sair do jogo.
 * 
 * 
 * 
 * @author Daviw
 *
 */
public class Rally {

	public ArrayList<Troco> trajeto;
	public ArrayList<Cartas> cartas;
	private int posicaoFinal;
	private int jogadorAutorizado;
	private int penalidade;
	private int maxDado;
	private int minDado;
	/**
	 * Representa os dados iniciais do jogo
	 */
	public void Jogo() {
		penalidade = 5;
		posicaoFinal = 50;
		maxDado = 6;
		minDado = 1;
	}
	
	/**
	 * Representa a base do jogo e todos os seus argumentos
	 * 
	 * @param valorPenalidade Representa as penalidades dadas ao tempo de jogo
	 * @param valorFinal Representa o tempo final do jogador
	 * @param totalJogadores Representa o número total de jogadores
	 * @param minDadoValor Representa o valor minimo do dado
	 * @param maxDadoValor Representa o valor maximo do dado
	 */
	public void Jogo(int valorPenalidade, int valorFinal, int totalJogadores, int minDadoValor, int maxDadoValor) {
		
		penalidade = valorPenalidade;
		posicaoFinal = valorFinal;
		jogadorAutorizado = totalJogadores;
		minDado = minDadoValor;
		maxDado = maxDadoValor;
		
	}
	
	/**
	 * É um arrayList de jogadores que contem todos os jogadores 
	 * 
	 * @param jogadores Representa o elemento jogador
	 * @param campeao Representa o vencedor da corrida
	 */
	public void verResultados(ArrayList<Jogador> jogadores, List<Integer> campeao) {
		
		int escolhaJogador;
		List<Integer> atual = new ArrayList<Integer>();
		
		if (campeao.size() > 0) {
			for (Jogador jogador : jogadores) {
				atual.add(jogador.getPosicaoAtual());
			}
		if (atual.stream().anyMatch(current -> current >= posicaoFinal)) {
			System.out.println();
			System.out.println("Fim, para começar de novo selecione 1");
			
			for (Jogador jogador : jogadores) {
				
				if (atual.stream().allMatch(current -> current >= posicaoFinal)) {
					System.out.println("EMPATE");
					return;
				}
				else
					if (jogador.getPosicaoAtual() >= posicaoFinal)
						System.out.println("Vitória");
						System.out.println(jogador.getNomeJogador().toUpperCase());
			}
		}
		}
	}
	
	/**
	 * Neste metodo permite criar novos jogadores
	 * 
	 * @param jogadores Representa o jogador
	 * @param campeao Representa a list de campeao 
	 */
	public void criarNovoJogador (ArrayList<Jogador> jogadores, List<Integer> campeao) {
		
		String nomeJogador;
		Scanner input = new Scanner(System.in);
		
	}
	
	/**
	 * Permite sair do jogo
	 * 
	 */
	public void sairJogo() {
		
		char decisao;
		
		do {
			System.out.println("Tem a certeza que deseja sair? -- y/n :");
			Scanner source = new Scanner (System.in);
			decisao = source.nextLine().charAt(0);
			decisao = Character.toLowerCase(decisao);
			
			if (decisao == 'y') {
				System.out.println("Obrigado por jogar");
				System.exit(0);
			}
			else
				if (decisao == 'n')
					return;
				else
					System.out.println("Por favor selecione a sua resposta outra vez (y/n)");
		} while (decisao != 'n' && decisao != 'y');
	}
	/**
	 * Serve para o caso de empate na partida 
	 * @param jogadores Parametro que define o jodador
	 * @param campeao Parametro que define o vencedor
	 */
	public void jogoEmpate(ArrayList<Jogador> jogadores, List<Integer> campeao) {
		
		if (campeao.size() == 0) {
			for (Jogador jogador : jogadores) {
				if (!(jogador.getPosicaoAtual() >= posicaoFinal))
					return;
			}
			System.out.println();
			System.out.println("EMPATE");
			campeao.add(1);
		}
	}
	/**
	 * Seve para mostrar toda a informacao sobre as partidas em memoria
	 * @param jogadores Parametro que define os jogadores
	 * @param campeao Parametro que define o campeao
	 */
	public void jogosJogado(ArrayList<Jogador> jogadores, List<Integer> campeao) {
		
		if (jogadores.size() >= jogadorAutorizado) {
			verVencedores(jogadores, campeao);
			atualizarPosicaoJogador(jogadores, campeao);
			jogoEmpate(jogadores, campeao);
		}
		else
			mostrarNenhumJogador();
	}
	/**
	 * Obtem os jogadores autorizados
	 * @return Retorna o jogador autorizado
	 */
	public int getJogadorAutorizado() {
		return jogadorAutorizado;
	}
	/**
	 * Obtem a posicao final
	 * @return Retorna a posicao final
	 */
	public int getPosicaoFinal() {
		return posicaoFinal;
	}
	/**
	 * Obtem o maximo do dado
	 * @return Retorna o valor maximo do valor
	 */
	public int getMaxDado() {
		return maxDado;
	}
	
	/**
	 *Obtem o minimo do dado
	 * @return Retorna o valor minimo do valor
	 */
	public int getMinDado() {
		return minDado;
	}
	
	/**
	 * Obtem a penalizacao
	 * @return Retorna a penalidade
	 */
	public int getPenalidade() {
		return penalidade;
	}
	 /**
	  * Cria todos os apetos de uma partida
	  */
	public void jogoNovo() {
		
		int opcaoJogador;
		ArrayList<Jogador> jogadores;
		List<Integer> campeao;
		
		jogadores = new ArrayList<Jogador>();
		campeao = new ArrayList<Integer>();
		introducao();
		
		do {
			menu();
			Scanner console = new Scanner(System.in);
			
			while (true) {
				if (console.hasNextInt()) {
					opcaoJogador = console.nextInt();
					break;
				}
				else
					console.next();
				
				System.out.println();
				System.out.println("ERROR: Opção invalida, por favor selecione um valor entre 0 e 6");
				System.out.println();
				menu();
			}
			
			switch (opcaoJogador) {
			case 1:
				criarNovoJogador(jogadores, campeao); 
				break;
				
			case 2:
				jogosJogado(jogadores, campeao); 
				break;
				
			case 3:
				mostrarPosicaoJogador(jogadores); 
				break;
			
			case 4:
				ajuda(); 
				break;
			
			case 5:
				sairJogo(); 
				break;
				
			default:
				System.out.println("ERROR: Opção invalida, por favor selecione um valor entre 0 e 6");
			}
		}while(true);
	}
	
	public void jogadoresPenalidade(ArrayList<Jogador> jogadores, List<Integer> campeao) {
		
		if (campeao.size() == 0) {
			for (Jogador jogador : jogadores) {
				int posicaoTemp = penalidade(jogador.getPosicaoAtual());
				
				if (posicaoTemp != jogador.getPosicaoAtual()) {
					System.out.println(jogador.getNomeJogador() + "rolou um" + jogador.getResultadoLance() + "Movendo de " + jogador.getPosicaoInicial() + " para " + jogador.getPosicaoAtual());
					System.out.println("==================================================");
					jogador.setPosicaoAtual(posicaoTemp);
				}
				else {
					System.out.println(jogador.getNomeJogador() + " rolou " + jogador.getResultadoLance() + " movendo de " + jogador.getPosicaoInicial() + " para " + jogador.getPosicaoAtual());
					System.out.println("=================================================");
				}
			}
		}
	}
	
	/**
	 * Serve como menu de ajuda ao player 
	 */
	public void ajuda() {
		System.out.println();
		System.out.println(":::::::::::::::::::::::::::::Ajuda com o jogo::::::::::::::::::::::::::::::::::::");
		System.out.println("Descrição:");
		System.out.println("Isto é um jogo simples de tabuleiro de uma corrida de rally, em que diversos jogadores");
		System.out.println("etc.");
		System.out.println("Como jogar:");
		System.out.println("1. etc.");
		System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
	}
	
	/**
	 * Serve como menu de introducao ao player
	 */
	public void introducao() {
		System.out.println();
		System.out.println(":::::::::::::::::::::::::::::Bem vindo!::::::::::::::::::::::::::::::::::::");
		System.out.println("Isto é um jogo de rally simples em que um certo nº de jogadores jogam em ");
		System.out.println("diversos turnos lançando dados e tirando cartas até um deles chegar a meta");
		System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
	}
	
	/**
	 * Serve como menu principal 
	 */
	public void menu() {
		System.out.println();
		System.out.println(":::::::::::::::::::::::::::::Bem vindo!::::::::::::::::::::::::::::::::::::");
		System.out.println("(1) Iniciar/Recomeçar o jogo \n (2) Jogar 1 ronda \n (3) Mostrar posicao dos jogadores \n (4) Mostrar ajuda \n (5) Sair");
		System.out.println("diversos turnos lançando dados e tirando cartas até um deles chegar a meta");
		System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
	}
	
	/**
	 * Serve como lancamento do dado
	 * @return Retorna a lancamento
	 */
	public int lanceDado() {
		Dado dado1 = new Dado(maxDado, minDado);
		int lance = dado1.getLanceResultado();
		
		return lance;
	}
	
	/**
	 * Atualiza a posicao do jogador dentro do troco
	 * @param jogadores Parametro que representa o jogador
	 * @param campeao Parametro que define o campeao
	 */
	public void atualizarPosicaoJogador(ArrayList<Jogador> jogadores, List<Integer> campeao) {
		
		if (campeao.size() == 0) {
			for (Jogador jogador : jogadores) {
				jogador.setPosicaoInicial(jogador.getPosicaoAtual());
				int posAtual = jogador.getPosicaoAtual() + lanceDado();
				jogador.setPosicaoAtual(posAtual);
			}
		}
	}
	
	/**
	 * Serve para ver quem é o vencedor da partida 
	 * @param jogadores Parametro de jogador
	 * @param campeao Prametro de quem e o campeao
	 */
	public void verVencedores(ArrayList<Jogador> jogadores, List<Integer> campeao) {
		int escolhaJogador;
		
		List<Integer> currents = new ArrayList<Integer>();
		
		if(campeao.size() > 0) {
			
			for(Jogador jogador : jogadores) {
				currents.add(jogador.getPosicaoAtual());
			}
		if(currents.stream().anyMatch(current -> current >= posicaoFinal)) {
			
			System.out.println();
			System.out.println("Fim do jogo. Tem que começar um novo jogo selecionando 1");
			
			for (Jogador jogador : jogadores) {
				if (currents.stream().allMatch(current -> current >= posicaoFinal)) {
					System.out.println("EMPATE");
					return;
				}
				else
					if(jogador.getPosicaoAtual() >= posicaoFinal)
						System.out.println("Vitória para " + jogador.getNomeJogador().toUpperCase());
			}
			return;
		}
		}
	}
	
	/**
	 * Serve para quando existe a falta de insercao de jogadores 
	 */
	public void mostrarNenhumJogador() {
		System.out.println();
		System.out.println("ERROR: Não foram criados jogadores");
	}
	
	/**
	 * Serve para mostrar a posicao do jogador
	 * @param jogadores Represenat o jogador
	 */
	public void mostrarPosicaoJogador(ArrayList<Jogador> jogadores) {
		if (jogadores.size() >= jogadorAutorizado) {
			for(Jogador jogador : jogadores) {
				System.out.println();
				System.out.println("\tJogador " + jogador.getNomeJogador() + " Esta na posição " + jogador.getPosicaoAtual());
			}
		}
		else
			mostrarNenhumJogador();
	}
	
	/**
	 * Mostra as penalisacoes 
	 * @param posicao Representa a posicao do jogador
	 * @return Retorna a nova posicao do jogador
	 */
	public int penalidade(int posicao) {
		for(int ponto = 11; ponto < posicaoFinal; ponto += 11) {
			if(posicao == ponto)
				posicao = posicao - penalidade;
		}
		return posicao;
	}
	
	/**
	 *Seve para por o jogador
	 * @param limiteJogador Serve como limite
	 */
	public void setJogadorAutorizado(int limiteJogador) {
		
		jogadorAutorizado = limiteJogador;
	}
	
	/**
	 * Obtem a posicao final
	 * @param posicaoVitoria Representa a meta 
	 */
	public void setPosicaoFinal (int posicaoVitoria) {
		
		posicaoFinal = posicaoVitoria;	
	}
	
	/**
	 * Serve para modificar o minimo do dado 
	 * @param minDadoNum Representa a quantiade minima do dado 
	 */
	public void setMinDado(int minDadoNum) {
		
		minDado = minDadoNum;
	}
	
	/**
	 *Serve para modificar o maximo do dado 
	 * @param maxDadoNum Representa a quantiade maxima do dado 
	 * 
	 */
	public void setMaxDado(int maxDadoNum) {
		
		maxDado = maxDadoNum;
	}
	/**
	 * Serve para modificar a penalidade
	 *  
	 * @param valorPenalidade Representa a penalidade
	 */
	public void setPenalidade(int valorPenalidade) {
		
		penalidade = valorPenalidade;
	}
	
}
