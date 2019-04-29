package exer7;

public class fisica extends Pessoa{
	
	private String cpf;
	
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public fisica(String nome, String endereco, String telefone, String cpf) {
		super(nome,endereco,telefone);
		this.cpf = cpf;
	}
	
	public void imprimeDados() {
		System.out.println("Nome: " + this.getNome());
		System.out.println("Endereço: " + this.getEndereco());
		System.out.println("Telefone: " + this.getTelefone());
		System.out.println("Cpf: " + this.getCpf());
	}	

}
