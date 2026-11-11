public class ColaboradorProducao extends Colaborador {
    private int quantidadePecas;
    private double valorPorPeca ;

    public ColaboradorProducao(
            int matricula,
            String nome,
            int quantidadePecas,
            double valorPecas){
        super(matricula, nome);
        this.isBeneficiado = true;
        this.quantidadePecas = quantidadePecas;
        this.valorPorPeca  = valorPecas;
        this.tipoColaborador = "Produção";
    }

    public double calcularProdutividade(){
        return quantidadePecas * valorPorPeca ;
    }

    @Override
    public double calcularSalarioFinal(){
        return SALARIO_BASE + calcularProdutividade();
    }

    @Override
    protected double getBeneficio(){
        return calcularProdutividade();
    }

    public int getQuantidadePecas() {
        return quantidadePecas;
    }

    public double getValorPorPeca() {
        return valorPorPeca;
    }
}
