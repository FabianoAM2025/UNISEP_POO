public class FuncionarioEstagiario extends Funcionario {

    public FuncionarioEstagiario(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    @Override
    public void calcularSalario() {
        double salarioFinal = getSalarioBase() - (getSalarioBase() * 0.05);

        System.out.println("Nome: " + getNome());
        System.out.println("Salário-base: R$ " + getSalarioBase());
        System.out.println("Desconto administrativo: 5%");
        System.out.println("Salário final: R$ " + salarioFinal);
        System.out.println();
    }
}
