package exer3;

public class retangulo extends quadrilateros{

	public retangulo(double l1, double l2, double l3, double l4) {
		super(l1, l2, l3, l4);
	}

	public double calculaArea() {
		
		return super.getLado1() * super.getLado2();
	}
	
	public double calculaPerimetro() {
		
		return (2 * super.getLado1()) + (2 * super.getLado2());
	}
	
	public String toString(){
		return "Base: " + super.getLado1() + " Altura: " + super.getLado2();
	}
}