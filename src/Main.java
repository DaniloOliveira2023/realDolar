import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int valorConversao = 0;
        double valor = 0;
        Scanner s = new Scanner(System.in);
        do {
            System.out.println("Digite o valor da conversão");
            System.out.println("1 - Real para Dólar");
            System.out.println("2 - Dólar para Real");
            System.out.println("Outro número - Encerra a sessão");
            valorConversao = s.nextInt();
            System.out.println("Digite o valor");
            valor = s.nextDouble();
            if (valorConversao == 1) {
                System.out.println("O valor é de U$" + valor * 0.3);
            } else if (valorConversao == 2) {
                System.out.println("O valor é de R$" + valor * 3.25);

            } else {
                System.out.println("Número inválido");
            }

        } while (valorConversao!=0);
    }

    public static double realDolar (double valor) {
        return valor * 0.3;
    }

    public static void dolarReal (double valor) {
        System.out.println(+valor * 3.25);
    }

}