package view;

import controller.Threadmatriz;
//2) Fazer uma aplicação que insira números
//aleatórios em uma matriz 3 x 5 e tenha 3
//chamadas de Threads, onde cada uma calcula a
//soma dos valores de cada linha, imprimindo a
//identificação da linha e o resultado da soma.

public class Principal {

	public static void main(String[] args) {
		for(int Threadmat=0; Threadmat < 1; Threadmat++ ) {
			
		
				Thread threadm= new Threadmatriz(Threadmat);
				threadm.start();
		}
	  }
	
}
