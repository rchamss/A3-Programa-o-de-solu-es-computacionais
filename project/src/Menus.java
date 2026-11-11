public class Menus {
    public static void mostrarMenuPrincipal(){
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("------------------------------------------");
        System.out.println("Sistema gerenciador de folha de pagamentos");
        System.out.println("------------------------------------------");
        System.out.println("Selecione uma das operações disponiveis:");
        System.out.println("1. Cadastrar novo Colaborador Padrão");
        System.out.println("2. Cadastrar novo Colaborador Comissionado");
        System.out.println("3. Cadastrar novo Colaborador Produção");
        System.out.println("4. Gerar Folha de Pagamento");
        System.out.println("5. Exibir Resumo da Folha");
        System.out.println("0. Sair do Programa");
        System.out.println("------------------------------------------");
        System.out.print("Sua Escolha: ");
    }

    public static void mostrarMenuCadastroPadrao(String tipoColaborador){
        System.out.println("Iniciando cadastro do novo colaborador...");
        System.out.println("------------------------------------------");
        System.out.println("      Cadastro de Colaborador " + tipoColaborador);
        System.out.println("------------------------------------------");
        System.out.println("Informe os ítens a seguir");
        System.out.println("");
    }

    public static void mostrarResumoColaborador(Colaborador c){
        System.out.println("------------------------------------------");
        System.out.println("      Resumo do Colaborador inserido:     ");
        System.out.println("------------------------------------------");
        System.out.println("");
        System.out.println("Tipo:" + c.tipoColaborador);
        System.out.println("Matrícula: " + c.getMatricula());
        System.out.println("Nome: " + c.getNome());
        if (c instanceof ColaboradorComissionado comissionado) {
            System.out.println("Valor das Vendas: " + String.format("R$ %.2f", comissionado.getValorVendas()));
            System.out.println("Valor da Comissão: " + comissionado.getPercentualComissao() + "%");
        } else if (c instanceof ColaboradorProducao producao) {
            System.out.println("Quantidade de Peças: " + producao.getQuantidadePecas());
            System.out.println("Valor por Peça: " + String.format("R$ %.2f", producao.getValorPorPeca()));
        }
        System.out.println("");
        System.out.println("------------------------------------------");
    }

    public static void mostrarCreditos(){
        System.out.println("------------------------------------------");
        System.out.println("   Obrigado por utilizar nosso programa!  ");
        System.out.println("------------------------------------------");
        System.out.println("Integrantes do grupo:");
        System.out.println(" - Rodrigo Chamusca Gomes: 12725167470");
        System.out.println(" - Rafael Ahmad Fonseca Marques Santos: 12725138443");
        System.out.println(" - Camila Maria de Sá Longa: 12725154062");
        System.out.println(" - Cauã Leão Mendes: 12725145528");
        System.out.println(" - Tiago");

    }
}
