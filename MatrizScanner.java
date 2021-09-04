package MatrizYouTube;


import java.util.Scanner;

public class MatrizScanner {
	public static void main(String[] args) {
		
		Scanner entrada=new Scanner(System.in);
		int [][] MatrizScanner= new int[3][3];
		
		
		for(int i=0; i<MatrizScanner.length; i++) {
			for (int j=0; j<MatrizScanner[i].length; j++) {
				System.out.printf("Digite o valor de:\nLinha %d, Coluna %d:", i+1,j+1);
				MatrizScanner[i][j]=entrada.nextInt();
				
			}
		}
		int numeroPar=0;
		int numeroImpar=0;
		
		for(int i=0; i<MatrizScanner.length; i++) {
			for (int j=0; j<MatrizScanner[i].length; j++) {
				
				if( MatrizScanner[i][j] % 2 ==0) {
					numeroPar++;
				}else { numeroImpar++;
				
			}
		  }
		}
		System.out.println("Numeors par: "+ numeroPar);
		System.out.println("Numeors impar: "+ numeroImpar);

		
		for(int i=0; i<MatrizScanner.length; i++) {
			for (int j=0; j<MatrizScanner[i].length; j++) {
				System.out.print(MatrizScanner[i][j]+" ");
				
		  }System.out.println();
		}
		
		
		//System.out.println(MatrizScanner.length);
		entrada.close();
	}

}
