package apa._04._01;

public class IntercalaEmUmArray {

    public static void main(String[] args) {
        Aluno[] alunos = new Aluno[9];
        alunos[0] = new Aluno("Andr�", 4);
        alunos[1] = new Aluno("Mariana", 5);
        alunos[2] = new Aluno("Carlos", 8.5f);
        alunos[3] = new Aluno("Paulo", 9);
        alunos[4] = new Aluno("Jonas", 3);
        alunos[5] = new Aluno("Juliana", 6.7f);
        alunos[6] = new Aluno("Gui", 7);
        alunos[7] = new Aluno("L�cia", 9.3f);
        alunos[8] = new Aluno("Ana", 10);
        imprime(alunos);
        
        Aluno[] resultado = intercala(alunos, 0, 4, 9);
        imprime(resultado);
    }

    private static Aluno[] intercala(Aluno[] alunos, int inicio, int meio, int fim) {
        Aluno[] resultado = new Aluno[alunos.length]; 
        
        int atual = 0;
        int atual1 = inicio;
        int atual2 = meio;
        
        while (atual1 < meio && 
                atual2 < fim) {
            Aluno aluno1 = alunos[atual1];
            Aluno aluno2 = alunos[atual2];
            if (aluno1.getNota() < aluno2.getNota()) {
                resultado[atual] = aluno1;
                atual1++;
            } else {
                resultado[atual] = aluno2;
                atual2++;
            }
            atual++;
        }
        while (atual1 < meio) {
            resultado[atual] = alunos[atual1];
            atual++;
            atual1++;
        }
        while (atual2 < fim) {
            resultado[atual] = alunos[atual2];
            atual++;
            atual2++;
        }
        return resultado;
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
