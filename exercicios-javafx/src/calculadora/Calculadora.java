package calculadora;

import javafx.scene.layout.VBox;

public class Calculadora extends VBox {

	public Calculadora() {
		BarraTitulo barraTitulo = new BarraTitulo();
		Display display = new Display();
		Teclado teclado = new Teclado();
		
		getStyleClass().add("calculadora");
		
		getChildren().add(barraTitulo);
		getChildren().add(display);
		getChildren().add(teclado);
		
		teclado.noCliqueChame(texto -> {
			if(texto.equals("AC")) {
				display.limpar();
			} else {
				display.addTexto(texto);				
			}
		});
	}
}
