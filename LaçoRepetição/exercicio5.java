package La�oRepeti��o;

import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int n, soma=0;
		
		
		do {
			System.out.println("Insira um n�mero");
			n = ler.nextInt();
			
			soma=soma + n;
			
		}while(n != 0);
		
		
		System.out.println("Fim do programa. Voc� inseriu o n�mero 0");
		System.out.println("soma dos n�meros inseridos: " + soma);

	}

}
