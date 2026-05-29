import java.util.Scanner;

public class desafio_001Resultado {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Qual sua idade?");
        int resposta = entrada.nextInt();
        if(resposta >= 18) {
            System.out.println("Você tem " + resposta + " de idade então você pode beber");
        } else {
            System.out.println("Você tem " + resposta + " de idade então você não pode beber");
        }
    }
}
