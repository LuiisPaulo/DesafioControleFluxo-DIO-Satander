import java.util.*;

public class Contador {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro");
        int parametroUm = entrada.nextInt();
        System.out.println("Digite o segundo parâmetro");
        int parametroDois = entrada.nextInt();

        try {
            // chamando o método contendo a lógica de contagem
            Contar.contar(parametroUm, parametroDois);

        } catch (ParametrosInvalidosException exception) {
            // imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
            System.out.println("Segundo parâmetro deve ser maior que o primeiro \n");
        }

    }

}
