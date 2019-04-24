package fungrad;
public class funcionarioensinomedio extends funcionario {
   
	funcionarioensinomedio(String nome, String codigoFuncional, double salario, String escolaEnsinoBasico, String escolaEnsinoMedio, String universidade) {
		super(nome, codigoFuncional,salario, escolaEnsinoBasico, escolaEnsinoMedio, universidade);
	}

	public void calcularrendatotal() {
		setSalario(getSalario()*1.5);
	}
	public void status() {
		System.out.println("Nome:\t"+this.getNome());
		System.out.println("ID funcionario:\t"+this.getCodigoFuncional());
		System.out.println("Salario:\t"+this.getSalario());
		System.out.println("Escola ensino basico\t"+this.getEscolaensinobasico());
		System.out.println("Escola ensino medio:\t"+this.getEscolaensinomedio());
	}
	
}