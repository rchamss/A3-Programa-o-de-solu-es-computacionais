import java.util.List;
import java.util.Scanner;

public class Operacao {
    public static void limparTerminal(){
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void exibirFolha(List<Colaborador> colaboradores){
        double soma = 0;
        int quantidadeColaboradores = 0;
        Scanner scanner = new Scanner(System.in);
        if (colaboradores.isEmpty()) {
            limparTerminal();
            System.out.print("Nenhum colaborador cadastrado. Pressione Enter para continuar");
            scanner.nextLine();
        } else {
            limparTerminal();
            System.out.println("\n------- Resumo da Folha -----------");
            for (Colaborador c : colaboradores){
                soma += c.calcularSalarioFinal();
                quantidadeColaboradores += 1;
            }
            double media = (soma / quantidadeColaboradores);
            System.out.println("Quantidade de Colaboradores: " + quantidadeColaboradores);
            System.out.println("Total: " + String.format("R$ %.2f", soma));
            System.out.println("Média Salarial: " + String.format("R$ %.2f", media));
            System.out.println("------------------------------------------");
            System.out.print("Pressione Enter para voltar. ");
            scanner.nextLine();
        }
    }

    public static void exibirFolhaCompleta(List<Colaborador> colaboradores){
        Scanner scanner = new Scanner(System.in);
        if (colaboradores.isEmpty()) {
            limparTerminal();
            System.out.print("Nenhum colaborador cadastrado. Pressione Enter para continuar");
            scanner.nextLine();
        } else {
            limparTerminal();
            System.out.println("\n---------- Folha de Pagamentos -----------");
            for (Colaborador c : colaboradores){c.exibirDados();}
            System.out.println("------------------------------------------");
            System.out.print("Pressione Enter para voltar. ");
            scanner.nextLine();
        }
    }

    public static char definirEscolha(String mensagem){
        Scanner scanner = new Scanner(System.in);
        char alternativa;
        while (true){
            System.out.print(mensagem + "(S/N) ");
            String resposta = scanner.nextLine().trim().toUpperCase();

            if (resposta.isEmpty()){
                System.out.println("Operação invalida, tente novamente.");
                continue;
            }

            alternativa = resposta.charAt(0);

            if (alternativa != 'S' && alternativa != 'N'){
                System.out.println("Tipo invalido. Selecione apenas entre as opções ofertadas. ");
            }

            else{
                return alternativa;
            }
        }



    }
}
