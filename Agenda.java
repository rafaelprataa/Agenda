package exercicios;
import java.util.Scanner;
public class Agenda {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
	        String [][] Agenda = new String [10][5]; 
	        int n = 0;

	        do { // inicio do ciclo DO WHILE
	            System.out.printf("Insira seu nome: "); // usuario digita os dados e assim respectivamente
	            Agenda [n][0] = entrada.nextLine(); // posição 0 da matriz guarda o nome e assim respectivamente

	            System.out.printf("Insira seu endereco: ");
	            Agenda [n][1] = entrada.nextLine();
	            
	            System.out.printf("Insira seu codigo postal: ");
	            Agenda [n][2] = entrada.nextLine();
	            
	            System.out.printf("Insira seu bairro: ");
	            Agenda [n][3] = entrada.nextLine();
	            
	            System.out.printf("Insira seu telefone: ");
	            Agenda [n][4] = entrada.nextLine();
	            entrada.close();

	            n++; 
	            
	        } while (n < 10); // N<10 para se repetir no total de 10 vezes
	        
	        
	        for (int x = 0; x < Agenda.length; x++) { //laço de repetição
	        	 for (int y = 0; y < Agenda[x].length; y++) { // outro laço de repetição para conseguir andar sobre a matriz
	        		
	        		  System.out.print("\t\t"+ Agenda[x][y]); // exibe a matriz confome o tamanho dela, organizado por linha e coluna
	        	 }
	        	 
	        	 System.out.println(" -------");
	        	 System.out.println("DADOS");
	        	 System.out.println();
	        }
	        
	        
	         

	       
	    }
	}
		