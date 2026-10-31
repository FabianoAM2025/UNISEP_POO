
public class Aluno {

	//Atributos
	String nome;
	String ra;
	float valor_mensalidade;
	float valor_soma;
	
	//Construtores
	
	public Aluno(String nome, String ra, float valor_mensalidade){
		
		this.nome = nome;
		this.ra = ra;
		this.valor_mensalidade = valor_mensalidade;
		this.valor_soma = valor_soma;		
}
	
	//Metodos  
	
	public void imprimir_Aluno() {
		System.out.println("----------------------------------");
		System.out.println("Nome do Aluno:" + this.nome);
		System.out.println("RA do Aluno:" + this.ra);
		System.out.println("Mensalidade do Aluno:" + this.valor_mensalidade);
		System.out.println("Soma Total:" + this.valor_soma);
		
	}
}
