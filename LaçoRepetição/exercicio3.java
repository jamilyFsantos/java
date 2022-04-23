package LaçoRepetição;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int idade=0;
		int jovens=0;
		int idoso=0;
		int adulto=0;
		
		System.out.println("Informe sua idade");
		idade=ler.nextInt();
		
		while(idade !=-99) {
			
			
			if(idade<=21) {
				jovens++;
			}
			else if(idade>=50){
				idoso++;
			}
			else {
				adulto++;
			}
			
			System.out.println("Informe sua idade");
			idade=ler.nextInt();
		}
		
		System.out.println("\nTotal de pessoas com menos de 21 anos: "+jovens);
		System.out.println("\nTotal de pessoas com mais de 50 anos: "+idoso);
		System.out.println("\nFim do programa");

	}

}
