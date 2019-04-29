package exer7;

public class juridica extends Pessoa{

	private String cnpj;
	private String fantasia;

	public String getCnpj() {
		return cnpj;
	}
	
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	public String getFantasia() {
		return fantasia;
	}
	
	public void setFantasia(String fantasia) {
		this.fantasia = fantasia;
	}
	
	public juridica(String nome, String endereco, String telefone, String cnpj, String fantasia) {
		super(nome,endereco,telefone);
		this.cnpj = cnpj;
		this.fantasia = fantasia;
	}
	

	public void imprimeDados() {
		System.out.println("Nome: " + this.getNome());
		System.out.println("Endereço: " + this.getEndereco());
		System.out.println("Telefone: " + this.getTelefone());
		System.out.println("Cnpj: " + this.getCnpj());
		System.out.println("Nome Fantasia: " + this.getFantasia());
	}
	
}