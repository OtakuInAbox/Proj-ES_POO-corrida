package cartas;
/**
 * Representa o troço da corrida
 * @author Daviw
 *
 */

public class Troco {

	//Atributos
	protected int distancia;
	protected int tempoMedio;
	protected boolean fim;
	protected int inicio;
	
	//Acessores
	/**
	 * Obtem a distancia do troco 
	 * @return Retorna a distancia
	 */
	public int getDistancia() {
		return distancia;
	}
	/**
	 * Obtem o tempo medio 
	 * @return Retorna o tempo medio
	 */
	public int getTempoMedio() {
		return tempoMedio;
	}
	
	/**
	 * Representa o fim do troco
	 * @return Retorna o fim da pista
	 */
	public boolean isFim() {
		return fim;
	}
	
	/**
	 * Indica o inicio da pista 
	 * @return Retorna o inicio da pista
	 */
	public int getInicio() {
		return inicio;
	}
	
	//Contrustores
	/**
	 * Construtor default
	 */
	public Troco() {
		
	}
	
	/**
	 * Construtor com argumentos
	 * @param distancia Indica a distancia 
	 * @param tempoMedio Indica o tempo medio
	 * @param inicio Indica o inicio 
	 * @param fim   Indica o fim
	 */
	public Troco(int distancia, int tempoMedio, int inicio, boolean fim) {
		super();
		this.distancia = distancia;
		this.tempoMedio = tempoMedio;
		this.inicio= inicio;
		this.fim = fim;
	}
	

	
	
	
}
