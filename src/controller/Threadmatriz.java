package controller;

import java.util.Random;
// 2) Fazer uma aplicação que insira números
// aleatórios em uma matriz 3 x 5 e tenha 3
// chamadas de Threads, onde cada uma calcula a
// soma dos valores de cada linha, imprimindo a
// identificação da linha e o resultado da soma.

public class Threadmatriz extends Thread {

	private int  Threadmat;
	public Threadmatriz(int  Threadmat) {
		this. Threadmat = Threadmat;
	}
	@Override
	public void run() {
		Tmatriz();
		
	}

	
		private void Tmatriz() {
			int vet [] = new int[5];
			int aux=0;

		int  matriz [][]= new int [3][5];
		Random aleatorio = new Random();
		for(int l=0; l < 3; l++ ) {
			for(int c=0; c < 5; c++) {
				matriz[l][c]= aleatorio.nextInt(51);
			
			}	
		}
		for(int Threadmat=0; Threadmat < 3; Threadmat++ ) {
			Thread threadm= new Threadmatriz(Threadmat);
			for(int c=0; c < 5; c++) {
				 aux= aux + matriz [Threadmat][c];
				  
				
			 }
			 vet[Threadmat] = aux;
			  System.out.println("a soma da linha" +" " +Threadmat+ " = "+vet[Threadmat]);
			aux =0;  
			}
		
		
 
		
	}
	
}
