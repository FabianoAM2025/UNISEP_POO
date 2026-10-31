public class FuncionarioCLT extends Funcionario {

    public FuncionarioCLT(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    
    public void calcularSalario() {
        double salarioFinal = getSalarioBase() - (getSalarioBase() * 0.08);

        System.out.println("Nome: " + getNome());
        System.out.println("Salário-base: R$ " + getSalarioBase());
        System.out.println("Desconto INSS: 8%");
        System.out.println("Salário final: R$ " + salarioFinal);
        System.out.println();
    }
}
