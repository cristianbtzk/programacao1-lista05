package questao02;

public class Main {

	public static void main(String[] args) {
		Item item = new Item(1, "Item qualquer");
		Livro livro = new Livro(2, "Harry Potter", "J. K. Rowling");
		Midia midia = new Midia(3, "Uma mídia qualquer", "Gravadora teste", 10.5f);
		CD cd = new CD(4, "CD de músicas", "Gravadora 02", 20.05f, 12, "Victor e Léo", "Borboletas");
		VHS vhs = new VHS(5, "Fita VHS", "Gravadora 03", 30.32f, "Músicas para a família");
		
		System.out.println(item);
		System.out.println(livro);
		System.out.println(midia);
		System.out.println(cd);
		System.out.println(vhs);

	}

}
