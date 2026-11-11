public class ColaboradorComissionado extends Colaborador {
    private double valorVendas;
    private double percentualComissao;

    public ColaboradorComissionado(
            int matricula,
            String nome,
            double valorVendas,
            double percentualComissao){
        super(matricula, nome);
        this.isBeneficiado = true;
        this.valorVendas = valorVendas;
        this.percentualComissao = percentualComissao;
        this.tipoColaborador = "Comissionado";
    }

    public double calcularComissao(){
        return (valorVendas * percentualComissao)/100;
    }

    @Override
    public double calcularSalarioFinal(){
        return SALARIO_BASE + calcularComissao();
    }

    @Override
    protected double getBeneficio(){
        return calcularComissao();
    }

    public double getValorVendas(){
        return valorVendas;
    }
    public double getPercentualComissao(){
        return percentualComissao;
    }
}
