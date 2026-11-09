public class Operacoes {
    public static void mostrarMenu(){
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
}
