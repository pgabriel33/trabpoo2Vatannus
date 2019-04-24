package exer2;

public class produto {
	private String nome;
	private float preco;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public float getPreco() {
		return preco;
	}
	public void setPreco(float preco) {
		this.preco = preco;
	}
	public produto(String name, float preco) {
		this.nome = name;
		this.preco = preco;
	}
	public String toString() {
		return this.nome + this.preco;
	}
}