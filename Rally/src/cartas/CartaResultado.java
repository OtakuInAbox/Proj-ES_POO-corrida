package cartas;

import java.util.ArrayList;

public class CartaResultado {
	
	// properties
	int[] resultados;

	// constructors
	public CartaResultado(int nJogadores) {
		resultados = new int[nJogadores];

		for (int i = 0; i < resultados.length; i++)
				resultados[i] = 0;
	}

	// methods
	public int getScore(int jogadorNao) {
		return resultados[jogadorNao];
	}

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
