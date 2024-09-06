package SistemaRH;

import java.text.DateFormat;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

/* Classe principal teste */
public class testeSelecao {

	public static void main(String[] args) {

/* Objetos Classes*/		
		Scanner sc = new Scanner(System.in);
		Selecao cd = new Selecao();
		Date hoje = new Date();
		
		System.out.println();
		System.out.println();
/* Método Hora/Formato Br */		
		Locale.setDefault(new Locale("pt", "Brazil"));
		String Hoje = DateFormat.getDateTimeInstance().format(hoje);
		System.out.println("Data: "+ Hoje);
		System.out.println();
		System.out.println();
		System.out.println("=============== SISTEMA DE RH ===============");
		System.out.println();
		System.out.println();
		System.out.println();
	try {
		System.out.print("Informe o número de Candidatos a ser avaliado: ");
		cd.limitedeCadastro = sc.nextInt();
	    } catch (InputMismatchException e) {
	    	System.out.println();
	    	System.out.println("\n Erro na execução! Por gantileza, usar números. \n Recomece o Sistema!");
	    }
	
		System.out.println();
		System.out.println();
		
/* Variavel Constante: Contador */		
		int count = 0;

/* Repetir a operação de acordo com as vezes que o usuário determinar */		
	do{
		for (int count1 = 0; count1 < cd.limitedeCadastro; count1++) {
			System.out.println("Posição ["+ (count1 + 1)+ "]");
			System.out.println();
			System.out.println();
			sc.nextLine();
			System.out.print("Digite o nome do Candidato: ");
			cd.nome = sc.nextLine();
			System.out.println();
			System.out.print("Idade: ");
			cd.idade = sc.nextInt();
			sc.nextLine();
			System.out.println();
			System.out.print("Pretensão Salarial: ");
			cd.salarioPretendido = sc.nextDouble();
			sc.nextLine();
			System.out.println();
			System.out.println();
			System.out.print("Resultado: ");
			cd.avaliarCandidatos();
			System.out.println();
			System.out.println();
			System.out.println("======================================================");
			System.out.println();
			
			count++;
			
			System.out.println();
	      } 
	   
	   }while(count < cd.limitedeCadastro);
	    
	   sc.close();
	}
 }

