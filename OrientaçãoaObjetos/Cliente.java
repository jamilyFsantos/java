package Orienta��oaObjetos;

public class Cliente {

	String Nome;
	String Sobrenome;
	String Telefone;
	String Cpf;
	boolean Compra=true;
	
	public Cliente(String n, String s, String cp, String tel) {
		this.Nome = n;
		this.Sobrenome = s;
		this.Cpf = cp;
		this.Telefone = tel;
	}
	
	public void comprando() {
		if(Compra==true)
			System.out.println("Cliente est� comprando!!");
		else
			System.out.println("Cliente est� apenas olhando!");
	}
	
	
	
}
