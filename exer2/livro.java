package exer2;

public class livro extends produto{
	private String autor;

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	public livro(String nome,float preco, String autor) {
		super(nome, preco);
		this.autor = autor;
	}
	
	public String toString() {
		return "" + this.getNome() + " " + this.getPreco() + " " + this.getAutor() + "";
	}
}