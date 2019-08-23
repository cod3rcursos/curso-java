package lambdas;

public class Trabalho1 implements Runnable {

	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Tarefa #01");
			try {
				Thread.sleep(100);						
			} catch (Exception e) {
			}
		}
	}
}
