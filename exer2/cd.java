package exer2;

public class cd extends produto {
	private String nFaixas;

	public String getnFaixas() {
		return nFaixas;
	}
	public void setnFaixas(String nFaixas) {
		this.nFaixas = nFaixas;
	}
	cd(String name, float price, String nFaixas){
		super(name, price);
		this.nFaixas = nFaixas;
	}
	public String toString() {
		return this.getNome() + this.getPreco() + this.getnFaixas();
	}
}