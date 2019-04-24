package exer2;

public class dvd extends produto{
	private String duracao;
	
	public String getDuracao() {
		return duracao;
	}
	public void setDuracao(String duracao) {
		this.duracao = duracao;
	}
	dvd(String nome, float preco, String duracao){
		super(nome, preco);
		this.duracao = duracao;
	}
	public String toString() {
		return this.getNome() + this.getPreco() + this.getDuracao();
	}
}