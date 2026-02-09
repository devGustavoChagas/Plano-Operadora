
import java.util.Scanner;
import java.text.NumberFormat;
import java.util.Locale;

public class PlanoOperadora {
    public static void main(String[] args) {
        NumberFormat formatoMoeda = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));

        Scanner sc = new Scanner(System.in);
        System.out.println("Bem-vindo a operadora Vivo!");

        System.out.println("Qual o seu nome: ");
        String nome = sc.nextLine();

        System.out.println("Olá " + nome + "! ");

        System.out.println("Informe sua linha+DDD: ");
        String linha = sc.nextLine();

        System.out.println("Abaixo, segue a tabela de planos: " +
                "\n BASIC a partir de R$15,00 " +
                "\n MIDIA a partir de R$20,00 " +
                "\n TURBO a partir de R$30,00 ");

        System.out.println("Selecione o seu plano para mais informações. Exemplo: B = BASIC, M = MIDIA ou T = TURBO");
        String plano = sc.nextLine();

        switch (plano) {
            case "B", "b": {
                System.out.println("BASIC = 100min de ligação + 5GB de internet");
            }
            break;
            case "M", "m": {
                System.out.println("MIDIA = Plano BASIC + Whats e Instagram grátis");
            }
            break;
            case "T", "t": {
                System.out.println("TURBO = Plano MIDIA + 10GB de internet e Youtube");
            }
            break;
        }

        System.out.println("Quantos R$ de crédito você gostaria de recarregar? ");
        double credito = sc.nextDouble();

        if (credito >= 15 && credito < 20) {
            System.out.printf("Recarregando R$ %,.2f você tem acesso ao plano BASIC e seus benefícios. \nGostaria de recarregar o plano BASIC?", credito);
        }
        else if (credito >= 20 && credito < 30) {
            System.out.printf("Recarregando R$ %,.2f você tem acesso ao plano MIDIA e seus benefícios. \nGostaria de recarregar o plano MIDIA?", credito);
        }
        else {
            System.out.printf("Recarregando R$ %,.2f você tem acesso ao plano TURBO e seus benefícios. \nGostaria de recarregar o plano TURBO?", credito);
        }
    }
}
