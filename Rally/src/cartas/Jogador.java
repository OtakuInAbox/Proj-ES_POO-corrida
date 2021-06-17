package cartas;
/**
 * Representa a classe jogador
 * 
 * @author Daviw
 *
 */
public class Jogador {

	public String nome;
	public int posicaoAtual;
	public int posicaoInicial;
	
	/**
	 * Construtor default
	 */
	public void Jogador() {
		
		nome = "";
		posicaoAtual = 0;
		posicaoInicial = 0;
		
	}
	
	/**
	 * Construtor com argumentos
	 * @param nomeJogador Indica o nome do jopgador
	 * @param ultimaPosicao Indica a ultima posicao do jogador
	 * @param posicaoInicio Indica a posicao inicial
	 */
	public void  Jogador(String nomeJogador, int ultimaPosicao, int posicaoInicio) {
		
		nome = nomeJogador;
		posicaoAtual = ultimaPosicao;
		posicaoInicial = posicaoInicio;
		
	}
	
	/**
	 * Obtem a posicao atual
	 * @return Retorna a posicao atual
	 */
	public int getPosicaoAtual() {
		
		return posicaoAtual;
	}
	
	/**
	 * Obtem o nome do jogador
	 * @return Retorna o nome 
	 */
	public String getNomeJogador() {
		
		return nome;
	}
	
	/**
	 * Obtem o resultado do lancamento
	 * @return Retorna o resultado do lancamento
	 */
	public int getResultadoLance() {
		
		int lance = posicaoAtual - posicaoAtual;
		
		return lance;
	}
	
	/**
	 * Obtem a posicao inicial
	 * @return Retorna a posicao inicial
	 */
	public int getPosicaoInicial() {
		
		return posicaoInicial;
	}
	
	/**
	 * Serve para se poder modificar a posicao do carro
	 * @param posicao Serve para representar a posicao 
	 */
	public void setPosicaoAtual(int posicao) {
		
		posicaoAtual = posicao;
	}
	
	/**
	 * Serve para poder modificar o nome do jogador
	 * @param identidade Serve para reprrsenar o nome
	 */
	public void setNomeJogador (String identidade) {
		
		nome = identidade;
	}
	
	/**
	 * Serve para poder odificar a posicao inicial do jogador
	 * @param posInicial Serve para representar a posicao inicial
	 */
	public void setPosicaoInicial(int posInicial) {
		
		posicaoInicial = posInicial;
	}
	
}
