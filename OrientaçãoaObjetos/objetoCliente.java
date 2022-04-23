package OrientaçãoaObjetos;

import java.util.Scanner;

public class objetoCliente {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in); 
		Cliente c1 = new Cliente("Lucas", "Silva", "465.986.045.98", "(11)983645208");
		
		System.out.println(c1.Nome + "" + c1.Sobrenome + "\nCPF:" + c1.Cpf + "\n Telefone: "+c1.Telefone);
		
		c1.comprando();

	}

}
