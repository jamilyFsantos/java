package La�oRepeti��o;

import java.util.Scanner;

public class exerc�cio6 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int x, soma = 0, cont = 0, media = 0;
		do {
			System.out.print("\nDigite um n�mero inteiro: ");
			x = leitor.nextInt();
			if (x % 3 == 0 && x != 0) {
				soma += x;
				cont++;
			}
		} while (x != 0);
	

		media = soma / cont;

		System.out.printf("\nM�dia dos n�meros digitados m�ltiplos de 3: %d", media);
		System.out.println("\n\nFim do Programa");

	}

}
