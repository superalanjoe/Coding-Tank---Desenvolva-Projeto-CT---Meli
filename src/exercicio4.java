import java.util.Scanner;
class Exercicio4 {
    public static void main(String[] args) {
        System.out.println("Exercicio 4 da Prova, Aluno: Alan Cleber");
        System.out.println("Questão : Um número para ser considerado primo deve ser divisível apenas por 1 e ele mesmo. " +
                "Considerando isso, crie um programa que vai solicitar um número para o usuário e dizer se ele é primo."+"\n");


        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();


        if (ehPrimo(numero)) {
            System.out.println("O número " + numero + " é primo.");
        } else {
            System.out.println("O número " + numero + " não é primo.");
        }

        scanner.close();
    }

    public static boolean ehPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }

        return true;
    }
}