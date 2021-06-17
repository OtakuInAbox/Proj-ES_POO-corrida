package cartas;

import java.util.Random;
import cartas.carta.Carta;

public class Cartas {
	
	final int CARTASBARALHO = 12;

	// propriedades
	Carta[] cartas;
	int valido; 

	// Construtores
	public Cartas(boolean baralhoInteiro) {
		cartas = new Carta[CARTASBARALHO];
		valido = 0;

		if (baralhoInteiro)
			criarBaralho();
	}

	// Métodos
	public Carta getCartaTopo() {
		Carta tmp;

		if (valido <= 0)
			return null;
		else {
			valido--;
			tmp = cartas[valido];
			cartas[valido] = null;
			return tmp;
		}
	}

	public boolean addCartaTopo(Carta c) {
		if (valido < cartas.length) {
			cartas[valido] = c;   
			valido++;
			return true;
		}
		return false;
	}

	private void criarBaralho() {
	
		for(int i = 0; i<12;i++){
			addCartaTopo(new Carta(i));
		}
	}

	
	public void embaralhar() {
		Random rGen = new Random();  		
		 
		for (int i=0; i<cartas.length; i++) {
		    int randomPosition = rGen.nextInt(cartas.length);
		    Carta temp = cartas[i];
		    cartas[i] = cartas[randomPosition];
		    cartas[randomPosition] = temp;
		}
	}
}
