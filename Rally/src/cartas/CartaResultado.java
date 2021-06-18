package cartas;

import java.util.ArrayList;
/**
 * Obtem o resulatdo das cartas
 * @author Daviw
 *
 */
public class CartaResultado {
	
	// propriedades
	int[] resultados;

	// construtor
	/**
	 * Serve como construtor
	 * @param nJogadores Representa o jogador
	 */
	public CartaResultado(int nJogadores) {
		resultados = new int[nJogadores];

		for (int i = 0; i < resultados.length; i++)
				resultados[i] = 0;
	}

	// metodos
	/**
	 * Obtem a pontuacao do jogo
	 * @param jogadorNao Prametro que representa o jogador
	 * @return Retorna o resultado
	 */
	public int getScore(int jogadorNao) {
		return resultados[jogadorNao];
	}

	/**
	 * Atualiza os dados do jogador
	 * @param jogadorNao representa o joagdor
	 * @param quantidade A quantiade a adicionar
	 */
	public void update(int jogadorNao, int quantidade) {
		resultados[jogadorNao] += quantidade;
	}

	public String toString() {
		String s;
		s = "\n" + "_____________\n" + "\nPlayer\tScore\n" + "_____________\n";

		for (int jogadorNao = 0; jogadorNao < resultados.length; jogadorNao++) {
			s = s + (jogadorNao+1) + "\t" + resultados[jogadorNao] + "\n";
		}

		s += "_____________\n";
		return s;
	}

	/**
	 * Obtem o vencedor da partida
	 * @return Retorna o vencedor
	 */
	public int[] getVencedores() {
		
		int resultadoMax = 0;
		int[] vencedores;
		ArrayList<Integer> vencer = new ArrayList<Integer>();
		for (int i = 0; i < resultados.length; i++) {
			if (resultados[i] > resultadoMax) {
				resultadoMax = resultados[i];
			}
			
		}
		
		for (int j = 0; j < resultados.length; j++) {
			if (resultadoMax == resultados[j]) {
				vencer.add(j);
			}
		}

		vencedores = new int[vencer.size()];
		for (int i = 0; i < vencedores.length; i++) {
			vencedores[i] = vencer.get(i);
		}

		return vencedores;

	}
}
