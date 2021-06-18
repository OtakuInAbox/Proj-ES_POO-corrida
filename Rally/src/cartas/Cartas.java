package cartas;

import java.util.Random;
import cartas.carta.Carta;
/**
 * Representa o baralho de cartas
 * @author Daviw
 *
 */
public class Cartas {
	
	final int CARTASBARALHO = 12;

	// propriedades
	Carta[] cartas;
	int valido; 

	// Construtores
	/**
	 * Construtor do baralho
	 * @param baralhoInteiro Representa o baralho
	 */
	public Cartas(boolean baralhoInteiro) {
		cartas = new Carta[CARTASBARALHO];
		valido = 0;

		if (baralhoInteiro)
			criarBaralho();
	}

	// Métodos
	/**
	 * Este metodo permite obter a carta do topo
	 * @return Retorna a primeira carta do baralho
	 */
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
     /**
      * Adicona uma carta ao topo
      * @param c Representa a carta
      * @return Adiciona uma carta ao topo em caso de verdade
      */
	public boolean addCartaTopo(Carta c) {
		if (valido < cartas.length) {
			cartas[valido] = c;   
			valido++;
			return true;
		}
		return false;
	}
  
	/**
	 * Permite a criacao do baralho
	 */
	private void criarBaralho() {
	
		for(int i = 0; i<12;i++){
			addCartaTopo(new Carta(i));
		}
	}

	/**
	 * Faz o embaralhar 
	 */
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
