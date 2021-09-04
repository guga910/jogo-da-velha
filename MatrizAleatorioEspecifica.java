package MatrizYouTube;

import java.util.Random;

public class MatrizAleatorioEspecifica {
	public static void main(String[] args) {
		int [][] MatrizAle= new int [10][10];
		Random numeroAle=new Random();
		
		for(int i=0; i<MatrizAle.length; i++) {
			for(int j=0; j<MatrizAle[i].length; j++) {
				MatrizAle[i][j]=numeroAle.nextInt(100);
				System.out.print(MatrizAle[i][j]+" ");
			}System.out.println();
		}
		int linha5Maior=0;
		int linha5Menor=100;
		int col7Maior=0;
		int col7Menor=100;
		
		for(int i=0; i< MatrizAle.length; i++) {
			for(int j=0; j<MatrizAle[i].length; j++) {
				if (MatrizAle[4][j] > linha5Maior) {
					linha5Maior=MatrizAle[4][j];
				}else if(MatrizAle[4][j] < linha5Menor) {
					linha5Menor= MatrizAle[4][j];
				}
				
			}
		}
		for(int i=0; i< MatrizAle.length; i++) {
			for(int j=0; j<MatrizAle[i].length; j++) {
				if (MatrizAle[i][6] > col7Maior) {
					col7Maior=MatrizAle[i][6];
				}else if(MatrizAle[i][6] < col7Menor) {
					col7Menor= MatrizAle[i][6];
				}
				
			}
		}
		System.out.println("linha5Maior: "+linha5Maior);
		System.out.println("linha5Menor: "+linha5Menor);
		System.out.println("Col7Maior: "+col7Maior);
		System.out.println("Col7Menor: "+col7Menor);
		
		
	}

}
