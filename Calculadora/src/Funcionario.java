public class Funcionario {

    private String nome;
    private double salarioBase =1621.00;

    public Funcionario(String nome, double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    public String getNome() {
        return nome;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void calcularSalario() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Salário-base: R$ " + this.salarioBase);
    }
}
