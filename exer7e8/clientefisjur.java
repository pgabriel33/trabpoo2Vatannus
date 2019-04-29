package exer7;

import java.util.ArrayList;
import java.util.Scanner;

public class clientefisjur{
	
	public static void main(String[] args) {
		fisica pf1 = new fisica("Vinicius", "Rua 45, N. 98, Qd. 2, Lt. 23, Bairro Lírios do Campo", "62 99524-6655", "745.555.623-55");
		fisica pf2 = new fisica("Vitória", "Rua 27, N. 55, Qd. 7, Lt. 66, Bairro Campinas", "62 99525-3321", "546.998.254-93");
		juridica pj1 = new juridica("Maria Clara", "Rua 22, N. 3, Qd. 61, Lt. 14, Bairro Jundiaí", "62 99321-9874", "21.555.323/0001-25","Comercio de Alimentos");
		juridica pj2 = new juridica("Cleber", "Rua 77, N. 43, Qd. 61, Bairro Bom Clima", "14 99121-9377", "92.225.923/0001-99","Supermercado Kill");

		Scanner scanner = new Scanner(System.in);
		System.out.print("Cliente Codigo 0: Vinicius \n"
				+ "Cliente Codigo 1: Vitoria \n"
				+ "Cliente Codigo 2: Maria Clara \n"
				+ "Cliente Codigo 3: Cleber \n"
				+ "******Para saber mais informações dos cliente****** \n"
				+ "Digite o Código do Cliente: ");
	    String indice = scanner.next();		
		
		ArrayList<Pessoa> pessoas = new ArrayList();
		pessoas.add(pf1);
		pessoas.add(pf2);
		pessoas.add(pj1);
		pessoas.add(pj2);
		pessoas.get(Integer.valueOf(indice)).imprimeDados();
	}
}