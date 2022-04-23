package POOPolimorfismo;

public class Cachorro extends Animal {
	
	//metodo polimorfismo (esse metodo vem da superclasse Animal)
	@Override
	public void emitirSom() {
		System.out.println("Esse animal late: au au au!!");
	}
     
}
