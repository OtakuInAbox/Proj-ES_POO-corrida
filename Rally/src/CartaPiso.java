
public abstract class CartaPiso {

	protected double tempo;
	
	private String nome;
	private int efeito;
	
	public CartaPiso (String nome, int efeito) {
		this.nome = nome;
		this.efeito = efeito;
	}
	
	public String getNome() {
		return nome;
	}
	
	public int getEfeito() {
		return efeito;
	}
	
	public abstract int aplicarEfeito(); 
	
}
