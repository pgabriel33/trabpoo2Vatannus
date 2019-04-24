package fungrad;

public class fungrad {
	public static void main(String[] args) {
		funcionariograduado f1 = new funcionariograduado("roberto", "23425", 1000,"arturmachado","robettodemares","uinvaglico");
		f1.calcularsalario();
		f1.status();
		funcionariosemensino f4 = new funcionariosemensino("carlos","1245335",3000, null, null, null);
		f4.calcularsalario();
		f4.status();
		funcionarioensinobasico t5 = new funcionarioensinobasico("mikamito","2543",500,"teste1234",null,null);
		t5.calcularrendatotal();
		t5.status();
		funcionarioensinomedio y7 = new funcionarioensinomedio("vinicus","3432",900,"atshe13","atshe13",null);
		y7.calcularrendatotal();
		y7.status();
		
	}
}	