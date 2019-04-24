package fungrad;

public class funcionariosemensino extends funcionario{

	funcionariosemensino(String nome, String codigoFuncional, double salario, String escolaEnsinoBasico, String escolaEnsinoMedio, String universidade) {
		super(nome, codigoFuncional, salario, escolaEnsinoBasico, escolaEnsinoMedio, universidade);
	}
	
	public void status() {
		System.out.println("Nome:\t"+this.getNome());
		System.out.println("ID funcionario:\t"+this.getCodigoFuncional());
		System.out.println("Salario:\t"+this.getSalario());
	}
}