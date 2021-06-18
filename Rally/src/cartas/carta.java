package cartas;
/**
 * Representa a carta
 * @author Daviw
 *
 */

public class carta {
	
	public static class Carta {
		final String[] TIPO = { "Negativa", "Positiva"};
		final String[] VALOR = { "1", "2", "3", "4", "5", "6"};

		final int CARTASCADATIPO = 6;

		// propriedades
		int cartaNao;

		// construtor
		/**
		 * Representa o construtor da classe
		 * @param valor Tem o valor da carta
		 * @param tipo Representa o tipo de carta
		 */
		public Carta(int valor, int tipo) {
			cartaNao = valor + tipo * CARTASCADATIPO;
		}
     
		/**
		 * Representa a carta
		 * @param nCarta
		 */
		public Carta(int nCarta) {
			cartaNao = nCarta;
		}

		/**
		 * Obtem o valor da carta
		 * @return Retrona o valora da carta
		 */
		public int getValor() {
			return cartaNao % CARTASCADATIPO;
		}

		/*
		 * Serve para obter o tipo de carta
		 */
		public int getTipo() {
			return cartaNao / CARTASCADATIPO;
		}

		public String toString() {
			return VALOR[getValor()] + " of " + TIPO[getTipo()];
		}

		/**
		 * Serve para verificar se as cartas sao iguiais
		 * @param c Cartas
		 * @return Retorna um valor de true ou false dependendo se e ou nao igual
		 */
		public boolean iguais(Carta c) {
			boolean res;
			if (getValor() == c.getValor() && getTipo() == c.getTipo()) {
				res = true;
			} else
				res = false;
			return res;
		}


		public int compareTo(Carta c) {
			if(getValor()==c.getValor())
				return 0;
			else if (getValor()>c.getValor())
				return 1;
			else 
				return 2;
		}
	}
}
