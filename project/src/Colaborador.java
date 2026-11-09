public class Colaborador {
    private int matricula;
    private String nome;
    private double salarioBase;

    public Colaborador(int matricula, String nome, double salarioBase){
        this.matricula = matricula;
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    private double calcularSalarioFinal(){
        return 0;
    }

    public void exibirDados(){
        System.out.println("Exibindo informações referente colaborador solicitado...");
        System.out.println("-----------");
        System.out.printf("Matricula: %d%n", matricula);
        System.out.printf("Colaborador: %s%n", nome);
        System.out.printf("Salário Base: %.2f%n", salarioBase);
    }
}
