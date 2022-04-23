package OrientaçãoaObjetos;
import java.util.*;
public class ProdEletronico {
     String cor;
	 String marca;
     int armazenamento;
     int ram;
    
    public ProdEletronico(String c, String m, int a, int r ) {
    	this.cor = c;
    	this.marca = m;
    	this.armazenamento = a;
    	this.ram = r;
    }
    
    public void LigarNot() {
    	int liga;
    	
    	Scanner ler = new Scanner(System.in);
    	System.out.println("\ndigite 1 para ligar");
    	liga = ler.nextInt();
    	
    	if(liga == 1) {
    		System.out.println("Lingando Notbook");
    	}
    	else {
    		System.out.println("O Notbook continuará desligado");
    	}
    }
    

}
