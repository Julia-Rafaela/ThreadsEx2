package view;

import java.util.Random;

import controller.Threadmatriz;


public class Principal {
	static int matriz [] [] = new int[3][5];
	public static void main(String[] args) {
		Random aleatorio = new Random();
		for(int l=0; l < 3; l++ ) {
			for(int c=0; c < 5; c++) {
				matriz[l][c]= aleatorio.nextInt(51);
			
			}	
		
		 Thread Threadlinha = new 	Threadmatriz (l,matriz[l]);
	    
	      Threadlinha.start();
	      
		} 
	  }
}
	

