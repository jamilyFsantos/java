package OrientaçãoaObjetos;

public class ObjetoAviao {

	public static void main(String[] args) {
		Aviao a1 = new Aviao("TAM", "AC34567", "Preto", "72M");
		 System.out.println("Companhia Aerea: "+a1.companhiaAerea + "\nNúmero de Rastreio: "+a1.numRastreio + "\nCor: "+a1.cor + "\nComprimento: "+a1.tamanho);
		
		System.out.println("");
	    a1.decolar();
	    System.out.println("");
		a1.voar(); 
		System.out.println("");
		a1.pousar();
		

	}

}
