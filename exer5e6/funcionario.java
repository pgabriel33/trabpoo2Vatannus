package fungrad;
public class funcionario {
	public String nome;
	public String codigoFuncional;
	public double salario;
	public String escolaensinobasico;
	public String escolaensinomedio;
	public String universidade;
	
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}	
	public String getEscolaensinobasico() {
		return escolaensinobasico;
	}

	public void setEscolaensinobasico(String escolaensinobasico) {
		this.escolaensinobasico = escolaensinobasico;
	}

	public String getEscolaensinomedio() {
		return escolaensinomedio;
	}

	public void setEscolaensinomedio(String escolaensinomedio) {
		this.escolaensinomedio = escolaensinomedio;
	}

	public String getUniversidade() {
		return universidade;
	}

	public void setUniversidade(String universidade) {
		this.universidade = universidade;
	}

	public String getNome() {
		return nome;
	}

	public String getCodigoFuncional() {
		return codigoFuncional;
	}

	public void setCodigoFuncional(String codigoFuncional) {
		this.codigoFuncional = codigoFuncional;
	}
	
	public void calcularsalario() {
		setSalario(this.salario);
	}
	
	funcionario(String nome, String codigoFuncional, double salario, String escolaEnsinoBasico, String escolaEnsinoMedio, String universidade) {
		this.nome = nome;
		this.codigoFuncional = codigoFuncional;
		this.salario = salario;
		this.escolaensinobasico = escolaEnsinoBasico;
		this.escolaensinomedio = escolaEnsinoMedio;
		this.universidade = universidade;
	}
	
	public void status() {
		System.out.println("Nome:\t"+this.getNome());
		System.out.println("Codigo:\t"+this.getCodigoFuncional());
		System.out.println("Salario:\t"+this.getSalario());
		System.out.println("Escola Ensino Basico:\t"+this.getEscolaensinobasico());
		System.out.println("Escola Ensino Medio:\t"+this.getEscolaensinomedio());
		System.out.println("Escola Ensino Superior:\t"+this.getUniversidade());
	}
}