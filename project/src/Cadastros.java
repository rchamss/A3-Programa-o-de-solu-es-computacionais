import java.util.Scanner;
public class Cadastros{
    public static ColaboradorPadrao cadastrarPadrao(){
        Scanner scanner = new Scanner(System.in);
        while (true){
            Operacao.limparTerminal();
            Menus.mostrarMenuCadastroPadrao("Padrão");
            int matricula = lerInt(scanner, "Matrícula: ");
            String nome = lerNome(scanner, "Nome: ");
            Operacao.limparTerminal();

            ColaboradorPadrao colaboradorPadrao = new ColaboradorPadrao(matricula, nome);
            Menus.mostrarResumoColaborador(colaboradorPadrao);
            char resposta = Operacao.definirEscolha("Gostaria de salvar os dados? ");
            switch (resposta){
                case 'S' -> {
                    Operacao.limparTerminal();
                    Menus.mostrarResumoColaborador(colaboradorPadrao);
                    System.out.print("Colaborador cadastrado com Sucesso. Aperte Enter para voltar. ");
                    scanner.nextLine();
                    return colaboradorPadrao;
                }
                case 'N' -> {
                    System.out.print("Cadastro descartado. Aperte Enter para Recomençar. ");
                    scanner.nextLine();
                }
            }
        }
    }

    public static ColaboradorComissionado cadastrarColaboradorComissionado(){
        Scanner scanner = new Scanner(System.in);
        while (true){
            Operacao.limparTerminal();
            Menus.mostrarMenuCadastroPadrao("Comissionado");

            int matricula = lerInt(scanner, "Matrícula: ");
            String nome = lerNome(scanner, "Nome: ");
            double valorVendas = lerDouble(scanner, "Valor das Vendas: ");
            double percentualComissao = lerDouble(scanner, "Percentual de Comissão (informe apenas o valor da %): ");
            Operacao.limparTerminal();
            ColaboradorComissionado colaboradorComissionado = new ColaboradorComissionado(matricula, nome, valorVendas, percentualComissao);
            Menus.mostrarResumoColaborador(colaboradorComissionado);

            char resposta = Operacao.definirEscolha("Gostaria de salvar os dados? ");
            switch (resposta){
                case 'S' -> {
                    Operacao.limparTerminal();
                    Menus.mostrarResumoColaborador(colaboradorComissionado);
                    System.out.print("Colaborador cadastrado com Sucesso. Aperte Enter para voltar. ");
                    scanner.nextLine();
                    return colaboradorComissionado;
                }
                case 'N' -> {
                    System.out.print("Cadastro descartado. Aperte Enter para Recomençar. ");
                    scanner.nextLine();
                }
            }
        }
    }
    public static ColaboradorProducao cadastrarColaboradorProducao(){
        Scanner scanner = new Scanner(System.in);
        while (true){
            Operacao.limparTerminal();
            Menus.mostrarMenuCadastroPadrao("Produção");
            int matricula = lerInt(scanner, "Matrícula: ");
            String nome = lerNome(scanner, "Nome: ");
            int quantidadePecas = lerInt(scanner, "Quantidade de Peças Vendidas: ");
            double valorPecas = lerDouble(scanner, "Valor das Peças: ");
            Operacao.limparTerminal();
            ColaboradorProducao colaboradorProducao = new ColaboradorProducao(matricula, nome, quantidadePecas, valorPecas);
            Menus.mostrarResumoColaborador(colaboradorProducao);

            char resposta = Operacao.definirEscolha("Gostaria de salvar os dados? ");
            switch (resposta){
                case 'S' -> {
                    Operacao.limparTerminal();
                    Menus.mostrarResumoColaborador(colaboradorProducao);
                    System.out.print("Colaborador cadastrado com Sucesso. Aperte Enter para voltar. ");
                    scanner.nextLine();
                    return colaboradorProducao;
                }
                case 'N' -> {
                    System.out.print("Cadastro descartado. Aperte Enter para Recomençar. ");
                    scanner.nextLine();
                }
            }
        }
    }

    public static int lerInt(Scanner scanner, String mensagem){
        while (true){
            System.out.print(mensagem);
            String entrada = scanner.nextLine();

            if (entrada.isBlank()) {
                System.out.println("Erro: O campo não pode ficar vazio. Tente novamente.\n ");
                continue;
            }

            try {
                int num = Integer.parseInt(entrada);
                if (num >= 0){
                    return  num;
                } else{
                    System.out.println("Não são aceitos números negativos. Tente novamente.");
                    continue;
                }

            } catch (NumberFormatException e){
                System.out.println("Valor inválido! Digite apenas números inteiros positivos. ");
            }
        }
    }

    public static String lerNome(Scanner scanner, String mensagem){
        while (true) {
            System.out.print(mensagem);
            String entrada = scanner.nextLine().trim();

            if (entrada.isBlank()) {
                System.out.println("Erro: O campo não pode ficar vazio. Tente novamente.\n");
                continue;
            }

            if (entrada.length() < 2) {
                System.out.println("Erro: O nome deve ter pelo menos 2 caracteres. Tente novamente.\n");
                continue;
            }

            if (!entrada.matches("^[A-Za-zÀ-ÖØ-öø-ÿ\\s]+$")) {
                System.out.println("Erro: Digite apenas letras (sem números ou caracteres especiais).\n");
                continue;
            }

            return entrada;
        }
    }

    public static double lerDouble(Scanner scanner, String mensagem){
        while (true) {
            System.out.print(mensagem);
            String entrada = scanner.nextLine();

            if (entrada.isBlank()) {
                System.out.println("Erro: O campo não pode ficar vazio. Tente novamente.\n");
                continue;
            }


            try {
                double valor = (Double.parseDouble(entrada.replace(",", ".")));
                if (valor >= 0){
                    return  valor;
                } else{
                    System.out.println("Não são aceitos números negativos. Tente novamente.");
                    continue;
                }

            } catch (NumberFormatException e){
                System.out.println("Valor inválido! Digite apenas números inteiros positivos. ");
            }
        }
    }
}
