import java.util.*;

public class Rally {

	public ArrayList<Troco> trajeto;
	public ArrayList<CartaPiso> cartas;
	private int posicaoFinal;
	private int jogadorAutorizado;
	private int penalidade;
	private int maxDado;
	private int minDado;
	
	public void Jogo() {
		penalidade = 5;
		posicaoFinal = 50;
		maxDado = 6;
		minDado = 1;
	}
	
	public void Jogo(int valorPenalidade, int valorFinal, int totalJogadores, int minDadoValor, int maxDadoValor) {
		
		penalidade = valorPenalidade;
		posicaoFinal = valorFinal;
		jogadorAutorizado = totalJogadores;
		minDado = minDadoValor;
		maxDado = maxDadoValor;
		
	}
	
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
	
	public void criarNovoJogador (ArrayList<Jogador> jogadores, List<Integer> campeao) {
		
		String nomeJogador;
		Scanner input = new Scanner(System.in);
		
	}
	
	public void sairJogo() {
		
		char decisao;
		
		do {
			System.out.println("Tem a certeza que deseja sair? -- y/n :");
			Scanner source = new Scanner (System.in);
			decisao = source.nextLine().charAt(0);
			decisao = Character.toLowerCase(decisao);
			
			if (decisao == 'y') {
				System.out.println("Obrigado por jogar");
				system.exit(0);
			}
			else
				if (decisao == 'n')
					return;
				else
					System.out.println("Por favor selecione a sua resposta outra vez (y/n)");
		} while (decisao != 'n' && decisao != 'y');
	}
	
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
	
	public void jogosJogado(ArrayList<Jogador> jogadores, List<Integer> campeao) {
		
		if (jogadores.size() >= jogadorAutorizado) {
			verVencedores(jogadores, campeao);
			atualizarPosicaoJogador(jogadores, campeao);
			empateJogo(jogadores, campeao);
		}
		else
			mostrarNenhumJogador;
	}
	
	public int getJogadorAutorizado() {
		return jogadorAutorizado;
	}
	
	public int getPosicaoFinal() {
		return posicaoFinal;
	}
	
	public int getMaxDado() {
		return maxDado;
	}
	
	public int getMinDado() {
		return minDado;
	}
	
	public int getPenalidade() {
		return penalidade;
	}
	
	public void jogoNovo() {
		
		int opcaoJogador;
		ArrayList<Jogador> jogadores;
		List<Integer> campeao;
		
		jogadores = new ArrayList<Jogador>();
		campeao = new ArrayList<Integer>();
		printIntroduction();
		
		do {
			printMenu();
			Scanner console = new Scanner(System.in);
			
			While(true) {
				if (console.hasNextInt()) {
					opcaoJogador = console.nextInt();
					break;
				}
				else
					console.next();
				
				System.out.println();
				System.out.println("ERROR: Opção invalida, por favor selecione um valor entre 0 e 6");
				System.out.println();
				printMenu();
			}
			
			switch (opcaoJogador) {
			case 1:
				criarNovoJogador(jogadores, campeao); break;
				
			case 2:
				jogosJogado(jogadores, campeao); break;
				
			case 3:
				mostrarPosicaoJogadores(jogadores); break;
			
			case 4:
				ajuda(); break;
			
			case 5:
				sairJogo(); break;
				
			default:
				System.out.println("ERROR: Opção invalida, por favor selecione um valor entre 0 e 6");
			}
		}
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
	
	
	public int lanceDado() {
		Dado dado1 = new Dado(maxDado, minDado);
		int lance = dado1.getLanceResultado();
		
		return lance;
	}
	
	public void atualizarPosicaoJogador(ArrayList<Jogador> jogadores, List<Integer> campeao) {
		
		if (campeao.size() == 0) {
			for (Jogador jogador : jogadores) {
				jogador.setPosicaoInicial(jogador.getPosicaoAtual());
				int posAtual = jogador.getPosicaoAtual() + lanceDado();
				jogador.setPosicaoAtual(posAtual);
			}
		}
	}
	
	//set
	public void setJogadorAutorizado(int limiteJogador) {
		
		jogadorAutorizado = limiteJogador;
	}
	
	public void setPosicaoFinal (int posicaoVitoria) {
		
		posicaoFinal = posicaoVitoria;	
	}
	
	public void setMinDado(int minDadoNum) {
		
		minDado = minDadoNum;
	}
	
	public void setMaxDado(int maxDadoNum) {
		
		maxDado = maxDadoNum;
	}
	
	public void setPenalidade(int valorPenalidade) {
		
		penalidade = valorPenalidade;
	}
	
}
