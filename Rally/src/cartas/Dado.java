package cartas;
import java.util.Random;
/**
 * Representa o dado de jogo
 * @author Daviw
 *
 */

public class Dado {
	
	private int maxDadoValor;
	private int minDadoValor;
	
	/**
	 * Construtor default
	 * @param minDado 
	 * @param maxDado 
	 */
	public Dado(int maxDado, int minDado) {
		
		maxDadoValor = 6;
		minDadoValor = 1;
	}
	
	/**
	 * Serve para obter o resultado do lancamento dos dados
	 * @return Retorna o valor do lancamento
	 */
	public int getLanceResultado() {
		
		Random dado = new Random();
		int lance = dado.nextInt((maxDadoValor - minDadoValor) + 1) + minDadoValor;
		
		return lance;
		
	}

}
