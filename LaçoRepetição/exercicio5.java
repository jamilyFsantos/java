package LaçoRepetição;

import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int n, soma=0;
		
		
		do {
			System.out.println("Insira um número");
			n = ler.nextInt();
			
			soma=soma + n;
			
		}while(n != 0);
		
		
		System.out.println("Fim do programa. Você inseriu o número 0");
		System.out.println("soma dos números inseridos: " + soma);

	}

}
