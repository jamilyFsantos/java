package POOHeranca;

public class animal {
	
	private String nome;
	private int idade;
	
	
	

	
	//metodos acessores e modificadores}
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
	
	
	//metodos --> comportamento
	public void emitirSom()
	{
		System.out.println("Ele emite som");
	}
	
	
}
