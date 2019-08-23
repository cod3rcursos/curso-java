package excecao;

import java.util.Scanner;

public class Finally {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		try {
			System.out.println(7 / entrada.nextInt());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("Finally #01...");
		}

		try {
			System.out.println(7 / entrada.nextInt());
		} finally {
			System.out.println("Finally #02...");
			entrada.close();
		}
		
		System.out.println("Fim!");
	}
	
}
