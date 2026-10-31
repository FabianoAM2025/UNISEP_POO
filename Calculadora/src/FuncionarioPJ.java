public class FuncionarioPJ extends Funcionario {

    public FuncionarioPJ(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    
    public void calcularSalario() {
        double salarioFinal = getSalarioBase() + (getSalarioBase() * 0.15);

        System.out.println("Nome: " + getNome());
        System.out.println("Salário-base: R$ " + getSalarioBase());
        System.out.println("Bônus contratual: 15%");
        System.out.println("Salário final: R$ " + salarioFinal);
        System.out.println();
    }
}
