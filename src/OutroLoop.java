import java.util.Scanner;

public class OutroLoop {

    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double media = 0;
        double nota = 0;
        int total = 0;

        while (nota != -1) {
            System.out.println("Digite sua avaliação para o filme ou -1 para encerrar: ");
            nota = leitura.nextDouble();

            if (nota != -1){
                media += nota;
                total++;
            }
        }

        System.out.println("Média de avaliações: " + media/total);
    }
}
