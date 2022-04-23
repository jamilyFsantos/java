package POOHeranca;

public class testa {

	public static void main(String[] args) {
		
		cachorro c = new cachorro();
		cavalo ca = new cavalo();
		preguica p = new preguica();
		
		
		//cachorro
		c.setNome("noha");
		System.out.println(c.getNome());
		
		c.setIdade(13);
		System.out.println(c.getIdade());
		
		c.emitirSom();
		c.correr();
		
		
		//cavalo
		ca.setNome("mark");
		System.out.println(ca.getNome());
		
		ca.setIdade(16);
		System.out.println(ca.getIdade());
		
		ca.emitirSom();
		ca.correr();
		
		
		//preguiça
		p.setNome("lau");
		System.out.println(p.getNome());
		
		p.setIdade(3);
		System.out.println(p.getIdade());
	
		p.emitirSom();
		p.sobi();
		
	
		
    
	}

}
