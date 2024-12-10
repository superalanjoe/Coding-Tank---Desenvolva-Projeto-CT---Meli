public class exercicio3 {
    public static void main(String[] args) {
        System.out.println("Exercicio 3 da Prova, Aluno: Alan Cleber");
        System.out.println("Questão: Uma família está dividindo uma pizza entre seus membros. " +
                "Crie um programa que solicite o número de membros da família e o número de fatias da pizza. " +
                "O programa deve calcular quantas fatias cada membro vai receber, e informar se haverá sobras e " +
                "quantas fatias sobrarão. Se a pizza não puder ser igualmente dividida, o programa deve sugerir " +
                "quantas fatias adicionais são necessárias para que todos recebam a mesma quantidade.\n");

        java.util.Scanner scanner = new java.util.Scanner(System.in);


        System.out.print("Digite quantas pessoas tem na sua família: ");
        int pessoa = scanner.nextInt();


        System.out.print("Digite quantas fatias de pizza cada pessoa ira comer: ");
        int fatias = scanner.nextInt();


        int fatiasPorPessoa = fatias / pessoa;
        int sobras = fatias % pessoa;


        System.out.println("Cada pessoa da família receberá " + fatiasPorPessoa + " fatias de pizza.");

        if (sobras > 0) {
            System.out.println("Sobraram " + sobras + " fatias de pizza.");


            int adicionais = pessoa - sobras;
            System.out.println("Para dividir igualmente, seriam necessárias mais " + adicionais + " fatias.");
        } else {
            System.out.println("A pizza foi dividida igualmente entre as pessoas da família.");
        }

        scanner.close();
    }
}
