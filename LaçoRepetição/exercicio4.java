package LaçoRepetição;

import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int pessoas=0, idade, sexo=0, per=0, cont=0;
		int qtdeCalmas=0, mulherNervosas=0, homemAgressivos=0, outrosCalmos=0, nervosasMaiorQuarenta=0, calmosMenor=0;
		
		while(pessoas < 150) {
			System.out.println("Informe sua idade");
			idade= ler.nextInt();
			
			System.out.println("\nescolha seu sexo" + "\n1 - Feminino" + "\n2 - Masculino" + "\n3 - Outro");
			sexo= ler.nextInt();
			
			System.out.println("Como se considera:" + "1 - Calma" + "2 - Nervosa" + "3 - Agressiva");
			per= ler.nextInt();
			

			if (per == 1) {
				qtdeCalmas++;
			}

			if (sexo == 1 && per == 2) {
				mulherNervosas++;
			}

			if (sexo == 2 && per == 3) {
				homemAgressivos++;
			}

			if (sexo == 3 && per == 1) {
				outrosCalmos++;
			}

			if (per == 2 && idade > 40) {
				nervosasMaiorQuarenta++;
			}

			if (per == 1 && idade < 18) {
				calmosMenor++;
			}

			cont++;
		 }
		
		System.out.println("\nNumero de pessoas calmas: "+ qtdeCalmas);
		System.out.println("\nNúmero de mulheres nervosas: "+ mulherNervosas);
		System.out.println("\nNúmero de homens agressivos: "+ homemAgressivos);
		System.out.println("\nNúmero de outros calmos: "+ outrosCalmos);
		System.out.println("\nNúmero de pessoas nervosas com mais de 40 anos: "+ nervosasMaiorQuarenta);
		System.out.println("\nNúmero de pessoas calmas com menos de 18 anos: "+ calmosMenor);
	  }
		    
				
	}
			
			
	


		
 

	