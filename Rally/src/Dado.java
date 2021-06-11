import java.util.Random;

public class Dado {
	
	private int maxDadoValor;
	private int minDadoValor;
	
	public Dado() {
		
		maxDadoValor = 6;
		minDadoValor = 1;
	}
	
	public int getLanceResultado() {
		
		Random dado = new Random();
		int lance = dado.nextInt((maxDadoValor - minDadoValor) + 1) + minDadoValor;
		
		return lance;
		
	}

}
