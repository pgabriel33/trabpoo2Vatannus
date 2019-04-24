package exer3;

import java.text.Format;
import java.util.ArrayList;
import java.util.List;

public class formasgeometricas {

	public static void main(String[] args) {
		
		List<formasgeometricasIF> formas = new ArrayList<formasgeometricasIF>();
		
		formasgeometricasIF ret1 = new retangulo(10,5,10,5);
		quadrilateros ret2 = new retangulo(10,5,10,5);
		formasgeometricasIF quad1 = new quadrado(5,5,5,5);
		quadrilateros quad2 = new quadrado(10,10,10,10);
		formasgeometricasIF cir1 = new circulo(10);
		formasgeometricasIF cir2 = new circulo(20);
		
		formas.add(ret1);
		formas.add(ret2);
		formas.add(quad1);
		formas.add(quad2);
		formas.add(cir1);
		formas.add(cir2);
		
		for(formasgeometricasIF fG: formas){
			System.out.print(fG.toString());
			System.out.println("\n");
		}
		
		System.out.println("\n");
		
		for(formasgeometricasIF fG: formas){
			System.out.print(fG.calculaArea());
			System.out.println("\n");
			System.out.print(fG.calculaPerimetro());
			System.out.println("\n");
		}

	}

}