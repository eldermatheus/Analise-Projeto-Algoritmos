package apa._03_exercicio_01;

import java.util.Iterator;

import apa._02._01.Produto;

public class SelectInsertionSort {

	public static void main(String[] args) {

		Aluno alunos[] = new Aluno[] { new Aluno("Joao", 5.1), new Aluno("Maria", 7.2), new Aluno("Henrique", 5.8),
				new Aluno("Lucas", 8.4), new Aluno("Sofia", 5.5), new Aluno("Ana", 6.0), new Aluno("Julia", 9.5),
				new Aluno("Junior", 8), new Aluno("Antonio", 6), new Aluno("Igor", 8.0) };

		// ******** Testes ********
		// MaiorNotaSelecao(alunos);
		// MenorNotaSelecao(alunos);
		// TresMaioresNotasSelecao(alunos);
		// TresMenoresNotasSelecao(alunos);

		// MaiorNotaInsercao(alunos);
		// MenorNotaInsercao(alunos);
		// TresMaioresNotasInsercao(alunos);
		// TresMenoresNotasInsercao(alunos);

	}

	private static void ordenaPorInsercao(Aluno[] alunos) {

		for (int atual = 0; atual < alunos.length; atual++) {
			int analise = atual;
			// System.out.println("Atual: " + atual);
			while (analise > 0 && alunos[analise].getNota() < alunos[analise - 1].getNota()) {
				// System.out.println("Analise: " + analise);
				// System.out.println("Trocando: " + alunos[analise] + ". Por: " +
				// alunos[analise - 1]);
				Aluno prodAnalise = alunos[analise];
				alunos[analise] = alunos[analise - 1];
				alunos[analise - 1] = prodAnalise;
				analise--;
			}
		}
	}

	private static void ordenaPorSelecao(Aluno[] alunos) {
		for (int i = 0; i < alunos.length; i++) {
			// System.out.println("Estou na casa " + i);
			int menor = buscaMenor(alunos, i, alunos.length);
			Aluno menorProd = alunos[menor];
			// System.out.println("Menor: " + menorProd);
			if (menor != i) {
				// System.out.println("Trocando: " + menorProd + ". Por: " + alunos[i]);
				alunos[menor] = alunos[i];
				alunos[i] = menorProd;
			}
		}
	}

	public static int buscaMenor(Aluno[] alunos, int inicio, int fim) {
		int menor = inicio;
		for (int atual = inicio + 1; atual < fim; ++atual) {
			if (alunos[atual].getNota() < alunos[menor].getNota()) {
				menor = atual;
			}
		}
		return menor;
	}

	//
	// Busca por seleção
	private static void MaiorNotaSelecao(Aluno[] alunos) {
		ordenaPorSelecao(alunos);

		for (int i = alunos.length - 1; i <= alunos.length - 1; i++) {
			System.out.println("  " + alunos[i] + ",");
		}
	}

	private static void MenorNotaSelecao(Aluno[] alunos) {
		ordenaPorSelecao(alunos);

		for (int i = 0; i <= 0; i++) {
			System.out.println("  " + alunos[i] + ",");
		}
	}

	private static void TresMaioresNotasSelecao(Aluno[] alunos) {
		ordenaPorSelecao(alunos);

		for (int i = alunos.length - 3; i <= alunos.length - 1; i++) {
			System.out.println("  " + alunos[i] + ",");
		}
	}

	private static void TresMenoresNotasSelecao(Aluno[] alunos) {
		ordenaPorSelecao(alunos);

		for (int i = 0; i <= 2; i++) {
			System.out.println("  " + alunos[i] + ",");
		}
	}

	//
	// Busca por inserção
	private static void MaiorNotaInsercao(Aluno[] alunos) {
		ordenaPorInsercao(alunos);

		for (int i = alunos.length - 1; i <= alunos.length - 1; i++) {
			System.out.println("  " + alunos[i] + ",");
		}
	}

	private static void MenorNotaInsercao(Aluno[] alunos) {
		ordenaPorInsercao(alunos);

		for (int i = 0; i <= 0; i++) {
			System.out.println("  " + alunos[i] + ",");
		}
	}

	private static void TresMaioresNotasInsercao(Aluno[] alunos) {
		ordenaPorInsercao(alunos);

		for (int i = alunos.length - 3; i <= alunos.length - 1; i++) {
			System.out.println("  " + alunos[i] + ",");
		}
	}

	private static void TresMenoresNotasInsercao(Aluno[] alunos) {
		ordenaPorInsercao(alunos);

		for (int i = 0; i <= 2; i++) {
			System.out.println("  " + alunos[i] + ",");
		}
	}
}
