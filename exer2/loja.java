package exer2;

import java.util.ArrayList;
import java.util.List;

public class loja {
	public static void main(String[] args) {
		cd cd1 = new cd("\tedsherran\t", 50, "\t16\n");
		livro livro1 = new livro("\tbird box", 300, "british aleyman\n");
		dvd dvd1 = new dvd("\tultimato", 19028, "5h\n");
		cd cd2 = new cd("\tplanetHemp", 50, "4\n");
		livro livro2 = new livro("\tdeath note", 289, "vaisaber\n");
		
		List<produto> produtos = new ArrayList<produto>();
		produtos.add(livro1);
		produtos.add(cd1);
		produtos.add(cd2);
		produtos.add(dvd1);
		produtos.add(livro2);
		
		System.out.println(produtos.toString());
	}
}