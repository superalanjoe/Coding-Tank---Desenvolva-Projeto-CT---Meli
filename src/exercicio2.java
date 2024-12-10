public class exercicio2 {
    public static void main(String[] args) {
        System.out.println("Exercicio 2 da Prova, Aluno: Alan Cleber.");
        System.out.println("Questão: Dada uma turma de alunos com N alunos, sendo que essa quantidade deve ser solicitada e " +
                "definida pelo usuário, " +
                "solicite o nome e a nota de cada um dos alunos. Seu programa " +
                "deve imprimir apenas aqueles alunos que tiraram nota" +
                " maior que a média da nota de todos os alunos. "+"\n");

        java.util.Scanner scanner = new java.util.Scanner(System.in);

        int n;
        do {
            System.out.print("Digite a quantidade de alunos na turma (máximo 20): ");
            n = scanner.nextInt();
            if (n < 1 || n > 20) {
                System.out.println("Quantidade inválida. Por favor, insira um número entre 1 e 20.");
            }
        } while (n < 1 || n > 20);
        scanner.nextLine();

        String[] nomes = new String[n];
        double[] notas = new double[n];
        double somaNotas = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Digite o nome do aluno " + (i + 1) + ": ");
            nomes[i] = scanner.nextLine();

            System.out.print("Digite a nota do aluno " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();
            scanner.nextLine();

            somaNotas += notas[i];
        }

        double media = somaNotas / n;
        System.out.println("\nA média da turma é: " + media);

        System.out.println("\nAlunos com notas acima da média:");
        for (int i = 0; i < n; i++) {
            if (notas[i] > media) {
                System.out.println("- " + nomes[i] + " (Nota: " + notas[i] + ")");
            }
        }

        scanner.close();
    }
}