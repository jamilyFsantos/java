package POOPolimorfismo;

public class Preguica extends Animal {
	
	public void subir() {
		System.out.println("Esse animal sobi em �rvore");
	}

	//metodo polimorfismo (esse metodo vem da superclasse Animal)
	   @Override //tem que ter esse override
		public void emitirSom() {
			System.out.println("Esse animal emite sons de alta-frequ�cia pelas narinas!!");
		}
}
