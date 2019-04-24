package fungrad;
public class funcionarioensinobasico extends funcionario {
	
	funcionarioensinobasico(String nome, String codigoFuncional, double salario, String escolaEnsinoBasico, String escolaEnsinoMedio, String universidade) {
		super(nome, codigoFuncional,salario, escolaEnsinoBasico, escolaEnsinoMedio, universidade);
	}
	public void calcularrendatotal() {
		setSalario(getSalario()*1.1);
	}
	public void status() {
		System.out.println("Nome:\t"+this.getNome());
		System.out.println("ID funcionario:\t"+this.getCodigoFuncional());
		System.out.println("Salario:\t"+this.getSalario());
		System.out.println("Escola ensino basico\t"+this.getEscolaensinobasico());
		
	}
}