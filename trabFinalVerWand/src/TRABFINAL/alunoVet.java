package TRABFINAL;
import java.io.IOException;
import java.util.*;

public class alunoVet {
	Scanner ler= new Scanner(System.in);
	Random ran = new Random();
	
	private Aluno vet[];
	private int quantAluno;
	
	public alunoVet(int tamanho) {
		this.vet = new Aluno[tamanho];
		this.quantAluno = 0;
	}

	public Aluno[] getVet() {
		return vet;
	}
	public void setVet(Aluno[] vet) {
		this.vet = vet;
	}

	public int getQuantAluno() {
		return quantAluno;
	}
	public void setQuantAluno(int quantAluno) {
		this.quantAluno = quantAluno;
	}
	
	public void cadastrar() throws IOException {
		String entrada, linha="";
		Aluno alunos = new Aluno();
		
		System.out.printf("Informe a matrícula do aluno:\n");
		entrada = ler.nextLine();
		linha += entrada+";";
		alunos.setMatricula(Integer.parseInt(entrada));
		
		System.out.printf("Informe o nome do aluno:\n");
		entrada = ler.nextLine();
		linha += entrada+";";
		alunos.setNome(entrada);
		
		System.out.printf("Informe o endereço do aluno:\n");
		entrada = ler.nextLine();
		linha += entrada+";";
		alunos.setEndereco(entrada);
		
		System.out.printf("Informe curso do aluno:\n");
		entrada = ler.nextLine();
		linha += entrada+";";
		alunos.setCurso(entrada);
		
		System.out.printf("\nInforme a data de ingresso do aluno: ");
		entrada = ler.nextLine();
		linha += entrada+";";
		alunos.setData(entrada);
		
	
		entrada = "0";
		linha += entrada;
		alunos.setMulta(Double.parseDouble(entrada));

		//Inseri um professor no array list
		this.vet[this.quantAluno] = alunos;
		this.quantAluno++;
		
		for(int c=0; c<this.quantAluno;c++) {
			System.out.println(this.vet[c].getNome());
		}
		
		//Grava dados de um professor no arquivo
		ManipulaArquivo.escritor("ALUNOS.csv", linha);
	}
	
	
}
