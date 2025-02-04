import java.util.Random;
import java.util.Scanner;

// Desafio independente
// Curso da ALURA: Java: criando a sua primeira aplicação

public class NumeroSecreto {

    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int numeroSecreto = random.nextInt(11);
        int numero = 0;
        int tentativas = 5;
        System.out.println("\nAdivinhe o número secreto!!");
        System.out.println("Você tem " + tentativas + " tentativas para acertar o número secreto\n");

        while (numero != numeroSecreto) {
            System.out.println("Digite um número de 1 a 10: ");
            numero = scanner.nextInt();
            tentativas --;
                if (numero > numeroSecreto) {
                    System.out.println("O número secreto é menor que " + numero);
                } else if (numero < numeroSecreto) {
                    System.out.println("O número secreto é maior que " + numero);
                } else {
                    break;
                }
                if (tentativas == 0 || numero == numeroSecreto) {
                    break;
                }
             System.out.println("Tentativas restantes: " + tentativas);
        }

        System.out.println("O número secreto era: " + numeroSecreto);
    }
}
