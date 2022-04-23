package POOPolimorfismo;

public abstract class Animal {
     private String nome;
     private int idade;
     
     
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
     
	//metodo polimorfismo
	public void emitirSom(){
		System.out.println("Emitir som");
	}
     
	
	public void correr() {
		System.out.println("Esse animal corre");
	}
}
