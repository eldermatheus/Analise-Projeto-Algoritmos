package apa._04._10;

public class MergeSort {

    public static void main(String[] args) {
        Aluno[] alunos = new Aluno[9];
        alunos[0] = new Aluno("Andr�", 4);
        alunos[1] = new Aluno("Carlos", 8.5f);
        alunos[2] = new Aluno("Ana", 10);
        alunos[3] = new Aluno("Jonas", 3);
        alunos[4] = new Aluno("Juliana", 6.7f);
        alunos[5] = new Aluno("Gui", 7);
        alunos[6] = new Aluno("Paulo", 9.f);
        alunos[7] = new Aluno("Mariana", 5);
        alunos[8] = new Aluno("L�cia", 9.3f);
        imprime(alunos);
        
        ordena(alunos, 0, 9);
        imprime(alunos);
    }
    
    private static void ordena(Aluno[] alunos, int inicio, int fim) {
        int meio = (fim + inicio) / 2;
        System.out.println(inicio + " " + meio + " " + fim);
        if (fim - inicio > 2) {
            ordena(alunos, inicio, meio);
            ordena(alunos, meio, fim);
        }
        intercala(alunos, inicio, meio, fim);
    }

    private static void intercala(Aluno[] alunos, int inicio, int meio, int fim) {
        Aluno[] intercalado = new Aluno[fim - inicio];
        
        int atual = 0;
        int atual1 = inicio;
        int atual2 = meio;
        
        while (atual1 < meio && 
                atual2 < fim) {
            Aluno aluno1 = alunos[atual1];
            Aluno aluno2 = alunos[atual2];
            if (aluno1.getNota() < aluno2.getNota()) {
                intercalado[atual] = aluno1;
                atual1++;
            } else {
                intercalado[atual] = aluno2;
                atual2++;
            }
            atual++;
        }
        while (atual1 < meio) {
            intercalado[atual] = alunos[atual1];
            atual++;
            atual1++;
        }
        while (atual2 < fim) {
            intercalado[atual] = alunos[atual2];
            atual++;
            atual2++;
        }
        for (int i = 0; i < intercalado.length; ++i) {
            alunos[inicio + i] = intercalado[i];
        }
    }
    
    public static void imprime(Object[] array) {
        for (int i = 0; i < array.length; i++) {
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(array[i]);
        }
        System.out.println();
    }

}
    