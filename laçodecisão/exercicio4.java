package la�odecis�o;
import java.util.Scanner;
public class exercicio4 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int n;
		
		System.out.println("Entre com um n�mero");
		n=ler.nextInt();
		
		if(n%2 == 0) {
			System.out.println("N�mero � par");
			
			System.out.println("Raiz quadrada: " + Math.sqrt(n));
			
		}else {
		  System.out.println("N�mero impar");
		  System.out.println("/nO n�mero elevado ao quadrado �: " + Math.pow(n, 2));
		
		}
		
		

	}

}
