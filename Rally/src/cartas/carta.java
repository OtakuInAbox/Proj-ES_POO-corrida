package cartas;


public class carta {
	
	
	public static class Carta {
		final String[] TIPO = { "Negativa", "Positiva"};
		final String[] VALOR = { "1", "2", "3", "4", "5", "6"};

		final int CARTASCADATIPO = 6;

		// properties
		int cartaNao;

		// constructors
		public Carta(int valor, int tipo) {
			cartaNao = valor + tipo * CARTASCADATIPO;
		}

		public Carta(int nCarta) {
			cartaNao = nCarta;
		}

		public int getValor() {
			return cartaNao % CARTASCADATIPO;
		}

		public int getTipo() {
			return cartaNao / CARTASCADATIPO;
		}

		public String toString() {
			return VALOR[getValor()] + " of " + TIPO[getTipo()];
		}

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
