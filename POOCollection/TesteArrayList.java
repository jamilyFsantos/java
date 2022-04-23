package POOCollection;
import java.util.*;
public class TesteArrayList {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		 String eletronico1 = "Notbook DELL";
		 String eletronico2 = "Iphone 12 PRO";
		 String eletronico3 = "TV Smart PHILIPS";
		 String eletronico4 = "XBOX ONE";	
		 int produto, qtdNot=20, qtdIpho=15, qtdTv=10, qtdXbox=17;
		 int restNot=0, restIpho=0, restTv=0, restXbox=0;
		 
		 ArrayList <String> eletronicos = new ArrayList(); 
		 
         
		 //armazenando dados
		 
		 eletronicos.add( eletronico1);
		 eletronicos.add( eletronico2);
		 eletronicos.add( eletronico3);
		 eletronicos.add( eletronico4);
		 
		 System.out.println("Produtos em estoque");
		 System.out.println("Quantidade    Produtos");
		 System.out.println("   20         " + ( eletronico1));
		 System.out.println("   15         " + ( eletronico2));
		 System.out.println("   10         " + ( eletronico3));
		 System.out.println("   17         " + ( eletronico4));
		 
		 //remover
		 System.out.println("Qual produto deseja comprar?");
		 System.out.println( "1 - Notbook" + "| 2 - Iphone" + "| 3 - TV" + "| 4 - XBOX");
		 produto=ler.nextInt();
		 
		 switch (produto) {
		 case 1:
			 System.out.println(eletronico1);
			 
			 System.out.println("\nQuantos Notbooks Deseja?");
			 qtdNot = ler.nextInt();
			 
			 if(qtdNot==20) {
				 eletronicos.remove(1);
				 System.out.println("Você comprou as ultimas unidades, obrigado pela preferência");
				 
				 System.out.println("\nProdutos em estoque");
				 System.out.println("Quantidade    Produtos");
				 System.out.println("   15      " + ( eletronico2));
				 System.out.println("   10      " + ( eletronico3));
				 System.out.println("   17      " + ( eletronico4));
				 
			 }else {
				 restNot=qtdNot-produto;
				 System.out.println("Compra efetuada com sucesso!");
				 System.out.println("\nQuantidade de Notbooks disponíveis: "+restNot);
				 	
			 }
			 
			 break;
			 
		 case 2:
			 System.out.println(eletronico2);
			 
			 System.out.println("\nQuantos Iphones Deseja?");
			 qtdIpho = ler.nextInt();
			 
			 if(qtdIpho==15) {
				 //removendo
				 eletronicos.remove(2);
				 System.out.println("Você comprou as ultimas unidades, obrigado pela preferência");
				 
				 System.out.println("\nProdutos em estoque");
				 System.out.println("Quantidade    Produtos");
				 System.out.println("   20       " + ( eletronico1));
				 System.out.println("   10       " + ( eletronico3));
				 System.out.println("   17       " + ( eletronico4));
				 
			 }else {
				 restIpho=qtdIpho-produto;
				 System.out.println("Compra efetuada com sucesso!");
				 System.out.println("\nQuantidade de Notbooks disponíveis: "+qtdIpho);
				 
			 }
			 
			 break;
			 
		 case 3:
			 System.out.println(eletronico3);
			 
			 System.out.println("\nQuantas TVs Deseja?");
			 qtdNot = ler.nextInt();
			 
			 if(qtdTv==10) {
				 eletronicos.remove(3);
				 System.out.println("Você comprou as ultimas unidades, obrigado pela preferência");
				 
				 System.out.println("\nProdutos em estoque");
				 System.out.println("Quantidade    Produtos");
				 System.out.println("   20      " + ( eletronico1));
				 System.out.println("   15      " + ( eletronico2));
				 System.out.println("   17      " + ( eletronico4));
				 
			 }else {
				 restTv=qtdTv-produto;
				 System.out.println("Compra efetuada com sucesso!");
				 System.out.println("\nQuantidade de Notbooks disponíveis: "+qtdTv);
				 
			
			 }
			 
			 break;
			 
		 case 4:
			 System.out.println(eletronico4);

			 System.out.println("\nQuantos XBOX Deseja?");
			 qtdNot = ler.nextInt();
			 
			 if(qtdXbox==17) {
				 eletronicos.remove(4);
				 System.out.println("Você comprou as ultimas unidades, obrigado pela preferência");
				 
				 System.out.println("\nProdutos em estoque");
				 System.out.println("Quantidade    Produtos");
				 System.out.println("   20      " + ( eletronico1));
				 System.out.println("   15      " + ( eletronico2));
				 System.out.println("   10      " + ( eletronico3));
				 
			 }else {
				 restXbox=qtdXbox-produto;
				 System.out.println("Compra efetuada com sucesso!");
				 System.out.println("\nQuantidade de Notbooks disponíveis: "+qtdXbox);
				
			 }
			 
			 break;
		 }
		 
		
		//Atualizar a lista
		 
		
	
		 
	}

}
