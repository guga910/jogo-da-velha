package MatrizYouTube;

import java.util.Scanner;

public class MatrizAgenda {
	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		String [][] agenda=new String[24][31];
		
		boolean sair= false;
		int opcao;
		
		int dia=0;
		int hora=0;
		String compromisso;
		
		
		while(!sair) {
			System.out.println("Digite 1 para agendar.");
			System.out.println("Digite 2 para consultar.");
			System.out.println("Digite 3 para consultas do dia.");
			System.out.println("Digite 0 para encerar.");

			opcao=entrada.nextInt();
			
			if( opcao==1) {
			//	System.out.println("opcção 1");
				System.out.println("Digite o dia do agendamento: ");
				dia=entrada.nextInt();
				System.out.println("Digite o hora do agendamento: ");
				hora=entrada.nextInt();
				System.out.println("Qual o compromisso: ");
				compromisso=entrada.next();
				agenda[hora][dia]=compromisso;
				System.out.println();
				
//				System.out.println("Mas algum agendamento?\n1 para sim, 2 para nao.");
//				opcao2=entrada.nextInt();
				


			
		}else if(opcao==2) {
			//System.out.println("opcção 2");
			System.out.println("Qual o dia da consulta? ");
			dia=entrada.nextInt();
			System.out.println("Qual o horario da consulta? ");
			hora=entrada.nextInt();
			System.out.println("Seu compromisso é: ");
			//compromisso=entrada.next();
			//agenda[hora][dia]=compromisso;
			System.out.println("Seu compromisso é: "+agenda[hora][dia]);
			System.out.println();

			
			
		}else if(opcao==0) {
			System.out.println("sair! ate mais.");
				sair= true;
		}else if(opcao==3) {
			System.out.println("Quer sabe as consultas de qual dia?");
			dia=entrada.nextInt();
			
			for(int h=0; h< agenda.length; h++) {
				System.out.print("agenda do dia "+ dia +": "+h+" - "+agenda[h][dia]);
			}
			
			
		}
			
		}
		
		
		
		entrada.close();
	}

}
