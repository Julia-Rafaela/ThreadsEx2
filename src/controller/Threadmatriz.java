package controller;

import java.util.Random;
// 2) Fazer uma aplicação que insira números
// aleatórios em uma matriz 3 x 5 e tenha 3
// chamadas de Threads, onde cada uma calcula a
// soma dos valores de cada linha, imprimindo a
// identificação da linha e o resultado da soma.

public class Threadmatriz extends Thread {

	private int Threadmat;
	
	 private int[] linha;
	public Threadmatriz(int Threadmat,int [] linha ) {
		this. Threadmat =Threadmat;
		this.linha=linha;;
	}
	@Override
	public void run() {
		Tmatriz();
		
	}

	
		private void Tmatriz() {
			
			int somalinhas=0;
			
			for(int line: linha ) {
				somalinhas= somalinhas+ line;
					  
				  }
				  System.out.println("a soma da linha" +" "+ (Threadmat + 1)+ " = "+somalinhas);
				
			}

	
}
