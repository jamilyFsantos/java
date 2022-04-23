package laçodecisão;
import java.util.Scanner;
public class exercicio4 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int n;
		
		System.out.println("Entre com um número");
		n=ler.nextInt();
		
		if(n%2 == 0) {
			System.out.println("Número é par");
			
			System.out.println("Raiz quadrada: " + Math.sqrt(n));
			
		}else {
		  System.out.println("Número impar");
		  System.out.println("/nO número elevado ao quadrado é: " + Math.pow(n, 2));
		
		}
		
		

	}

}
