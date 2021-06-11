
public class Jogador {

	public String nome;
	public int posicaoAtual;
	public int posicaoInicial;
	
	public void Jogador() {
		
		nome = "";
		posicaoAtual = 0;
		posicaoInicial = 0;
		
	}
	
	public void  Jogador(String nomeJogador, int ultimaPosicao, int posicaoInicio) {
		
		nome = nomeJogador;
		posicaoAtual = ultimaPosicao;
		posicaoInicial = posicaoInicio;
		
	}
	
	public int getPosicaoAtual() {
		
		return posicaoAtual;
	}
	
	public String getNomeJogador() {
		
		return nome;
	}
	
	public int getResultadoLance() {
		
		int lance = posicaoAtual - posicaoAtual;
		
		return lance;
	}
	
	public int getPosicaoInicial() {
		
		return posicaoInicial;
	}
	
	public void setPosicaoAtual(int posicao) {
		
		posicaoAtual = posicao;
	}
	
	public void setNomeJogador (String identidade) {
		
		nome = identidade;
	}
	
	public void setPosicaoInicial(int posInicial) {
		
		posicaoInicial = posInicial;
	}
	
}
