package OrientaçãoaObjetos;

public class ObjetoPEletronico {

	public static void main(String[] args) {
		ProdEletronico Not = new ProdEletronico ("Preto", "DELL", 500, 8);
		
		System.out.println("Marca do Notbook: "+Not.marca + "\nCor: " + Not.cor + "\nArmazenamento: " + Not.armazenamento + "\nRAM: "+Not.ram );

		Not.LigarNot();
	}

}
