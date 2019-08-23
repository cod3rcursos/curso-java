package lambdas;

public class CalculoTeste1 {

	public static void main(String[] args) {
		
		Calculo calculo = new Somar();
		System.out.println(calculo.executar(2, 3));
		
		
		calculo = new Multiplicar();
		System.out.println(calculo.executar(2, 3));
	}
}
