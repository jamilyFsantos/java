package POOPolimorfismo;

public class Cavalo extends Animal {

	//metodo polimorfismo (esse metodo vem da superclasse Animal)
	@Override
		public void emitirSom() {
			System.out.println("Esse animal relincha: hinn in in!!");
		}
}
