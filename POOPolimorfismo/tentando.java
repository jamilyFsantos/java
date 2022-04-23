package POOPolimorfismo;

public class tentando {

	public static void main(String[] args) {
		
		Cachorro c = new Cachorro();
		Cavalo ca = new Cavalo();
		Preguica p = new Preguica();
		
		//cachorro
		c.setNome("Rambo");
		System.out.println(c.getNome());
		
		c.setIdade(7);
		System.out.println(c.getIdade() + " Anos");
		
		c.emitirSom();
		
		c.correr();
		

		//Cavalo
		ca.setNome("Mark");
		System.out.println(ca.getNome());
		
		ca.setIdade(17);
		System.out.println(ca.getIdade() + " Anos");
		
		ca.emitirSom();
		ca.correr();
		
		
		//preguiça
		p.setNome("Luk");
		System.out.println(p.getNome());
		
		p.setIdade(13);
		System.out.println(p.getIdade() + " Anos");
		
		p.emitirSom();
		p.subir();
		
		
	}

}
