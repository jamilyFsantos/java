package Orienta��oaObjetos;

public class Aviao {
     String companhiaAerea;
     String numRastreio;
     String cor;
     String tamanho;
    
    public Aviao(String com, String n, String c, String tam) {
    	this.companhiaAerea = com;
    	this.numRastreio = n;
    	this.cor = c;
    	this.tamanho = tam;
    }
    
    public void decolar() {
    	System.out.println("14:40 O avi�o est� decolando");
    }
    
    public void voar() {
    	System.out.println("15:00 O avi�o est� a caminho ao destinatario");
    }
    
    public void pousar() {
    	System.out.println("17:00 O avi�o est� pousando");
    }
}
