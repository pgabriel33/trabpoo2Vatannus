package fungrad;

public class funcionariograduado extends funcionario {

	funcionariograduado(String nome, String codigoFuncional, double salario, String escolaEnsinoBasico, String escolaEnsinoMedio, String universidade) {
		super(nome, codigoFuncional,salario, escolaEnsinoBasico, escolaEnsinoMedio, universidade);
	}

	public void calcularsalario() {
		setSalario(getSalario() * 2);
	}
	
	
}