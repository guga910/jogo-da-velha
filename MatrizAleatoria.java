package MatrizYouTube;

import java.util.Random;

public class MatrizAleatoria {
	public static void main(String[] args) {
		
		int [][] Aleatoria= new int [4][4];
		Random ran= new Random();
		//int numero= ran.nextInt(100);
		
		
		for(int i=0; i<Aleatoria.length; i++) {
			for(int j=0; j<Aleatoria[i].length; j++) {
				Aleatoria[i][j]=ran.nextInt(100);
				System.out.print(Aleatoria[i][j]+" ");
				}System.out.println();
		}
			int maior=0;
			int menor=100;
			int linha=0;
			int col=0;
			int linhaMenor=0;
			int colMenor=0;
			
			for(int i=0; i<Aleatoria.length; i++) {
				for(int j=0; j<Aleatoria[i].length; j++) {
				if( Aleatoria[i][j]> maior) {
					maior=Aleatoria[i][j];
					linha= i;
					col= j;
					}else if (Aleatoria[i][j]< menor) {
						menor= Aleatoria[i][j];
						 linhaMenor=i;
						 colMenor=j;
					}
			}}
System.out.println("Maior Valor: "+ maior);
System.out.println("Linha: "+ linha);
System.out.println("Coluna: "+col);
System.out.println();
System.out.println("Menor Valor: "+ menor);
System.out.println("Linha Menor: "+ linhaMenor);
System.out.println("Coluna Menor: "+colMenor);




		
	
	}}
	
