import java.util.Scanner;

public class Principal {
    static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        while (true) {
            Operacoes.mostrarMenu();
            int escolha = scanner.nextInt();

            if (escolha == 0){
                break;
            }
            switch (escolha){
                case 1 -> System.out.println("Iniciando operação 1");
                case 2 -> System.out.println("Iniciando operação 2");
                case 3 -> System.out.println("Iniciando operação 3");
                case 4 -> System.out.println("Iniciando operação 4");
                case 5 -> System.out.println("Iniciando operação 5");
                default -> System.out.println("Operação não cadastrada. Tente novamente.");
            }
        }


        System.out.println("Sistema Finalizado.");
        scanner.nextInt();

    }


}
