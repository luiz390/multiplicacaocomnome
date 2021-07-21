package ativo;

import java.util.Scanner;

public class Conta1 {

	public static void main(String[] args) {
		
		
		   Scanner lui = new Scanner(System.in);
		    
		     String nome;
		     int n1,so;
		     
		     System.out.print("DIGITE O NOME: ");
		     nome = lui.nextLine();
		     System.out.print("DIGITE UM NUMERO: ");
		     n1 = lui.nextInt();
		     System.out.println();
		     for(so = 1;so <= (n1 * 2); so++) {
		    	 System.out.println(so +" - "+ nome);
		     }
	}

}
