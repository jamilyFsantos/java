package La�oRepeti��o;

import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int n;
		int par=0;
		int impar=0;
		
	 for(int x=1; x<=10; x++) {	
		System.out.println("Insira um n�mero");
		n=ler.nextInt();
		
		
		if(n%2==0) {
		    par++;
		    
		}else {
			impar++;
		}
	
		
	  }
	 
	 System.out.println("Quantidade de n�meros pares: "+par);
	 System.out.println("Quantidade de n�meros impares: "+impar);
	}

}
