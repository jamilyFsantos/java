package laçodecisão;
import java.util.Scanner;
public class exercicio2 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int n1;
		int n2;
		int n3;
		
		// tem que mostrar os numeros em ordem crescente
		System.out.println("Insira um número");
		n1=ler.nextInt();
		
		System.out.println("Insira um número");
		n2=ler.nextInt();
		
		System.out.println("Insira um número");
		n3=ler.nextInt();
		
		if(n1 <= n2 && n1 <= n3) {
			if(n2 <= n3) {
				System.out.println("Ordem crescente "+ n1 + ", " + n2 + ", " + n3 + ".");
			}
			else {
				System.out.println("Ordem crescente "+ n1 + ", " + n3 + ", " + n2 + ".");
			}
		}
		else if(n2 <= n1 && n2 <= n3) {
			if(n1 <= n3) {
				System.out.println("Ordem crescente "+ n2 + ", " + n1 + ", " + n3 + ".");
			}
			else {
				System.out.println("Ordem crescente "+ n2 + ", " + n3 + ", " + n1 + ".");
			}
		}
		else if(n3 <= n1 && n3 <= n2) {
			if(n1 < n2) {
				System.out.println("Ordem crescente "+ n3 + ", " + n1 + ", " + n2 + ".");
			}
			else {
				System.out.println("Ordem crescente "+ n3 + ", " + n2 + ", " + n1 + ".");
			}
		}

	}

}
