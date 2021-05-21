
public class Carro extends Cartas{

	//Atributos
	protected int suspensao;
	protected int travoes;
	protected int pneus;
	
	//Acessores
	public int getSuspensao() {
		return suspensao;
	}
	public int getTravoes() {
		return travoes;
	}
	public int getPneus() {
		return pneus;
	}
	
	//Contrutores
	public Carro(){
		
	}
	public Carro(int suspensao, int travoes, int pneus) {
		super();
		this.suspensao = suspensao;
		this.travoes = travoes;
		this.pneus = pneus;
	}
	
	public void andar() {
		
	}
}
