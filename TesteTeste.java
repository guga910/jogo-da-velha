package MatrizYouTube;

public class TesteTeste {
	public static void main(String[] args) {
		String[][] tabuleiro=new String [3][3];
		String sinal=" O ";
		
		tabuleiro[0][0]= sinal;
		tabuleiro[1][1]= "x";
		tabuleiro[2][2]= sinal;
		
		for(int l=0; l<tabuleiro.length; l++) {
			for(int c=0; c<tabuleiro[l].length; c++) {
				System.out.print(tabuleiro[l][c]+"  | ");
			}System.out.println();
		}
		
		
		
		
	}

}
