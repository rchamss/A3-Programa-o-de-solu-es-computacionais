public class Colaborador {
    private int matricula;
    private String nome;
    protected final double SALARIO_BASE;
    protected boolean isBeneficiado;
    protected String tipoColaborador;

    public Colaborador(int matricula, String nome){
        this.matricula = matricula;
        this.nome = nome;
        this.SALARIO_BASE = 2000;
        this.isBeneficiado = false;
        this.tipoColaborador = "Padrão";
    }

    public void exibirDados(){
        System.out.println("------------------------------------------");
        System.out.println("Nome: " + getNome());
        System.out.println("Matrícula: " + getMatricula());
        System.out.println("Tipo: " + tipoColaborador);
        System.out.println("Salário Base: " + String.format("R$ %.2f", SALARIO_BASE));
        if(isBeneficiado){ System.out.println("Benefício: " + String.format("R$ %.2f", getBeneficio())); }
        System.out.println("Salário Final: " + String.format("R$ %.2f", calcularSalarioFinal()));
    }

    public String getNome(){
        return nome;
    }

    public int getMatricula(){
        return matricula;
    }

    public double calcularSalarioFinal(){
        return SALARIO_BASE;
    }

    protected double getBeneficio(){
        return 0;
    }
}
