package la�odecis�o;
import java.util.Scanner;
public class exerc�cio1 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int n1;
		int n2;
		int n3;
		
		System.out.println("Insira um n�mero");
		n1=ler.nextInt();
		
		System.out.println("Insira um n�mero");
		n2=ler.nextInt();
		
		System.out.println("Insira um n�mero");
		n3=ler.nextInt();
		
		if(n1>n2 && n1>n3) {
			System.out.println("O n�mero maior �: "+n1);
		}
		else if(n2>n1 && n2>n3){
			System.out.println("O n�mero maior �: "+n2);
		}
		else {
			System.out.println("O n�mero maior �: "+n3);
		}
		

	}

}
