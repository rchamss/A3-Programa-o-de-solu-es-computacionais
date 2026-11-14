import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args){
        boolean executandoPrograma = true;
        Scanner scanner = new Scanner(System.in);
        List<Colaborador> colaboradores = new ArrayList<Colaborador>();

        while (executandoPrograma) {
            Operacao.limparTerminal();
            Menus.mostrarMenuPrincipal();
            int escolha = Cadastros.lerInt(scanner, "");
            switch (escolha){
                case 0 -> executandoPrograma = false;
                case 1 -> colaboradores.add(Cadastros.cadastrarPadrao());
                case 2 -> colaboradores.add(Cadastros.cadastrarColaboradorComissionado());
                case 3 -> colaboradores.add(Cadastros.cadastrarColaboradorProducao());
                case 4 -> Operacao.exibirFolhaCompleta(colaboradores);
                case 5 -> Operacao.exibirFolha(colaboradores);
                default -> System.out.println("Operação não cadastrada. Tente novamente.");
            }
        }
        System.out.println("Sistema Finalizado.");
        Operacao.limparTerminal();
        Menus.mostrarCreditos();
        scanner.nextInt();
    }
}
