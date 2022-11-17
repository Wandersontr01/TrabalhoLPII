package TRABFINAL;

import java.util.Random;

public class Aluno {
	Random ran = new Random();
	
	private int matricula;	
	private String nome;
	private String endereco;
	private String curso;
	private String data;
	private double multa;
	
	public Aluno(int matricula, String nome, String endereco, String curso, String data, double multa) {
		super();
		this.matricula = matricula;
		this.nome = nome;
		this.endereco = endereco;
		this.curso = curso;
		this.data = data;
		this.multa = multa;
	}
	
	public Aluno() {
		super();
		this.matricula = 0;
		this.nome = "";
		this.endereco = "";
		this.curso = "";
		this.data = "";
		this.multa = 0;
	}

	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}

	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}

	public double getMulta() {
		return multa;
	}
	public void setMulta(double multa) {
		this.multa = multa;
	}
	
	
	
	
	
}
