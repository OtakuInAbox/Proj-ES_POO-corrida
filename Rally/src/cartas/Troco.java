package cartas;
/**
 * Esta classe referece ao troco da pista
 * 
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
		 * Serve para obter a distancia
		 * @return Retorna a distancia
		 */
		public int getDistancia() {
			return distancia;
		}
		/**
		 * Serve para obter o tempo medio
		 * @return Retorna a disrancia
		 */
		public int getTempoMedio() {
			return tempoMedio;
		}
		
		/**
		 * Define o fim 
		 * @return Retorna o fim
		 */
		public boolean isFim() {
			return fim;
		}
		
		/**
		 * Define o inicio 
		 * @return Retorna o inicio 
		 */
		public int getInicio() {
			return inicio;
		}
		
		//Contrustores
		public Troco() {
			
		}
		/**
		 * Inicializa o metodo troço
		 * 
		 * @param distancia Parametro que define a distancia
		 * @param tempoMedio Parametro que define o tempo medio
		 * @param inicio Parametro que define o inicio 
		 * @param fim Parametro que define o inicio
		 */
		public Troco(int distancia, int tempoMedio, int inicio, boolean fim) {
			super();
			this.distancia = distancia;
			this.tempoMedio = tempoMedio;
			this.inicio= inicio;
			this.fim = fim;
		}

}
