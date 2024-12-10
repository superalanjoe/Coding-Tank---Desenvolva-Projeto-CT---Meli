public class Main {
    public static void main(String[] args) {
        System.out.println("Exercicio 1 da Prova, Aluno: Alan Cleber");
        System.out.println("Questão: Um motorista precisa abastecer seu carro para uma viagem. O carro tem um consumo médio " +
                "de combustível de 12 km por litro e o motorista planeja percorrer uma distância de 360 km. " +
                "Crie um programa que solicite o preço do combustível por litro ao usuário e calcule o custo total da viagem. " +
                "Além disso, informe quantos litros de combustível serão necessários para completar a viagem.");

        java.util.Scanner scanner = new java.util.Scanner(System.in);

        final double consumoPorKm = 12.0;
        final double distanciaViagem = 360.0;

        System.out.print("Digite o preço do combustível por litro (em reais): ");
        double precoPorLitro = scanner.nextDouble();

        double litrosNecessarios = distanciaViagem / consumoPorKm;
        double custoTotal = litrosNecessarios * precoPorLitro;

        System.out.println("\nResultados:");
        System.out.printf("Quantidade de combustível necessária: %.2f litros%n", litrosNecessarios);
        System.out.printf("Custo total da viagem: R$ %.2f%n", custoTotal);

        scanner.close();
    }
}