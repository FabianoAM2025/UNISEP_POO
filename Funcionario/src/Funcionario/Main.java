public class Main {

    public static void main(String[] args) {

        FuncionarioCLT clt = new FuncionarioCLT("Fernando", 2000.00);
        FuncionarioPJ pj = new FuncionarioPJ("Fabiano", 6000.00);
        FuncionarioEstagiario estagiario = new FuncionarioEstagiario("Carla", 1900.00);

        clt.calcularSalario();
        pj.calcularSalario();
        estagiario.calcularSalario();
    }
}