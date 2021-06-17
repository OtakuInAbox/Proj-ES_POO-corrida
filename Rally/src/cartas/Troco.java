package cartas;

public class Troco {
	//Atributos
		protected int distancia;
		protected int tempoMedio;
		protected boolean fim;
		protected int inicio;
		
		//Acessores
		public int getDistancia() {
			return distancia;
		}
		public int getTempoMedio() {
			return tempoMedio;
		}
		
		
		public boolean isFim() {
			return fim;
		}
		
		public int getInicio() {
			return inicio;
		}
		
		//Contrustores
		public Troco() {
			
		}
		
		public Troco(int distancia, int tempoMedio, int inicio, boolean fim) {
			super();
			this.distancia = distancia;
			this.tempoMedio = tempoMedio;
			this.inicio= inicio;
			this.fim = fim;
		}

}
