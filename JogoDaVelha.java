package MatrizYouTube;

import java.util.Scanner;

public class JogoDaVelha {
	public static void main(String[] args) {
		
		
		  Scanner entrada= new Scanner(System.in);
		  String[][] tabuleiro= new String[3][3];
		  boolean endGame= false;
		  int jogada=0;
		  int linha=0;
		  int coluna=0;
		  String sinal;
		 
		  
		  while(!endGame){
			  boolean entradaValida=false;
			  boolean entradaValida2=false;
		 
		  if (jogada % 2==0){
		   sinal=" X ";
		    System.out.println("Jogador 01,\nseu sinal é "+sinal+"!\n");
		     }else{sinal=" O ";
		    System.out.println("Jogador 02,\nseu sinal é "+sinal+"!\n");
		    }// if de apresentação dos jogadores
		    
		    
		  
		  	
		    while (!entradaValida){// solicitação de linha 
		    	System.out.println("Digite o numero da Linha\nentre 1 e 3.\n");
		    	linha=entrada.nextInt();			    	
		    if(linha<=3 && linha>=1) {
		    	entradaValida=true;
		    }else {
		    	System.out.println("Entrada invalida, tente novamente!\n");
		    }
		   }// while entradaValida
	    
		    
		   
		    while (!entradaValida2){// solicitação de linha     	
		    	 System.out.println("Digite o numero da coluna\nentre 1 e 3.\n");
				    coluna=entrada.nextInt();
		    	if(coluna<=3 && coluna>=1) {
		    	entradaValida2=true;
		    }else {
		    	System.out.println("Entrada invalida, tente novamente!\n");
		    }
		   }// while entradaValida
		    
		    
		    
		    linha--; coluna--;
		   if( tabuleiro[linha][coluna]==" O "||tabuleiro[linha][coluna]==" X ") {
			   System.out.println("Localização ja usada, tente outra!\n");
		   }else {
			   tabuleiro[linha][coluna]=sinal; 
			   jogada++;
		   }
		   for(int l=0; l<tabuleiro.length; l++) {
				for(int c=0; c<tabuleiro[l].length; c++) {
					System.out.print(tabuleiro[l][c]+" | ");
				}System.out.println();
			}
		    
		    
		    
		    System.out.println("ate aqui, tudo bem...\n");
		   
		   
		      
		      
if( (tabuleiro[0][0]==" X "&&tabuleiro[0][1]==" X "&&tabuleiro[0][2]==" X ")||
	(tabuleiro[1][0]==" X "&&tabuleiro[1][1]==" X "&&tabuleiro[1][2]==" X ")||
	(tabuleiro[2][0]==" X "&&tabuleiro[2][1]==" X "&&tabuleiro[2][2]==" X ")||
	(tabuleiro[0][0]==" X "&&tabuleiro[1][1]==" X "&&tabuleiro[2][2]==" X ")||
	(tabuleiro[2][0]==" X "&&tabuleiro[1][1]==" X "&&tabuleiro[0][2]==" X ")||
	(tabuleiro[0][0]==" X "&&tabuleiro[1][0]==" X "&&tabuleiro[2][0]==" X ")||
	(tabuleiro[0][1]==" X "&&tabuleiro[1][1]==" X "&&tabuleiro[2][1]==" X ")||
	(tabuleiro[0][2]==" X "&&tabuleiro[1][2]==" X "&&tabuleiro[2][2]==" X ")) {
		    	endGame= true;
		    	System.out.println("parabens, Jogador 1 ganhou!!!");
		    	
		    }else if ( (tabuleiro[0][0]==" O "&&tabuleiro[0][1]==" O "&&tabuleiro[0][2]==" O ")||
		    			(tabuleiro[1][0]==" O "&&tabuleiro[1][1]==" O "&&tabuleiro[1][2]==" O ")||
		    			(tabuleiro[2][0]==" O "&&tabuleiro[2][1]==" O "&&tabuleiro[2][2]==" O ")||
		    			(tabuleiro[0][0]==" O "&&tabuleiro[1][1]==" O "&&tabuleiro[2][2]==" O ")||
		    			(tabuleiro[2][0]==" O "&&tabuleiro[1][1]==" O "&&tabuleiro[0][2]==" O ")||
		    			(tabuleiro[0][0]==" O "&&tabuleiro[1][0]==" O "&&tabuleiro[2][0]==" O ")||
		    			(tabuleiro[0][1]==" O "&&tabuleiro[1][1]==" O "&&tabuleiro[2][1]==" O ")||
		    			(tabuleiro[0][2]==" O "&&tabuleiro[1][2]==" O "&&tabuleiro[2][2]==" O ")){ 
		    				    	endGame= true;
		    				    	System.out.println("parabens, Jogador 2 ganhou!!!");
		   }else if(jogada>=9) {
		    	System.out.println("Fim de jogo, deu EMPATE!");
		    	endGame= true;
		    }
		        
		  }//final do jogo
		  
		  
		
		entrada.close();
		
	}

}
