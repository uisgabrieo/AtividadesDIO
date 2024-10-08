import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.println("Digite o primeiro parâmetro:");
            int parametroUm = sc.nextInt();
            System.out.println("Digite o segundo parâmetro:");
            int parametroDois = sc.nextInt();

            contadorNum(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException e) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        }
    }

    static void contadorNum(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if (parametroUm > parametroDois) throw new ParametrosInvalidosException();

        int contador = parametroDois - parametroUm;

        for (int i = 1; i <= contador; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }

}