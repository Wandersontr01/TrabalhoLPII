package TRABFINAL;

import java.util.*;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner entrada = new Scanner(System.in);
		alunoVet alunos = new alunoVet(100);
		
		//MENU DE ESCOLHA
		System.out.println("\n=============== BIBLIOTECA DO(A) XXXXXXXXXX TESTE2===============");
		char op = 0;
		while (op != 9) {
			//PRECISA SER REALIZADO UMA AUTENTICACAO DE USUARIO ANTES DE EXIBIR A TELA DE MENU
			System.out.println("Informe o opcao desejada\n"
					+ "[1] Empréstimo de livros\n"
					+ "[2] Devolução de Livros\n"
					+ "[3] Cadastrar novos Livros\n"
					+ "[4] Cadastrar novos Usuários\n" //Aluno ou Funcionário
					+ "[5] R"
					+ ",elatórios\n" //Livros cadastrados; Empréstimos realizados; Funcionários cadastrados; Alunos cadastrados; Imprimir multa individual;
					+ "[6] Funcao6");
			
			op = entrada.next().charAt(0);
			
			switch (op) {
			case 1:
				
				break;
			case 2:
				
				break;
			case 3:
				
				break;
			case '4':
				alunos.cadastrar();
				break;
			case 5:
				
				break;
			case 6:
				
				break;
			case 9:
				System.out.println("Fim de programa!");
				entrada.close();
				break;
			default:
				System.out.println("A opcao informada é inválida!");
				break;
			}
		}

	}

}
