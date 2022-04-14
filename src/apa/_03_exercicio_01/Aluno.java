package apa._03_exercicio_01;

import apa._02._01.Produto;

public class Aluno {
	
	private String nome;
	private double nota;
	
	public Aluno() {		
	}
	
	public Aluno(String nome, double nota) {
		this.nome = nome;
		this.nota = nota; 	
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getNota() {
		return nota;
	}

	public void setNota(double nota) {
		this.nota = nota;
	}

	@Override
	public String toString() {
		return "Aluno [" + nome + ", " + nota + "]";
	}		
	
	public static void imprimeAlunos(Aluno[] alunos) {
        
        for (int i = 0; i < alunos.length; i++) {
            System.out.println("  " + alunos[i] + ",");
        }
        
    }
	
	
}
