package calculadora;

import java.util.function.Consumer;

import javafx.scene.control.Button;

public class Botao extends Button {

	public Botao(String texto, Consumer<String> func, String... classesCSS) {
		super(texto);

		getStyleClass().add("botao");

		setOnAction(e -> func.accept(getText()));
		
		for(String classeCSS: classesCSS) {
			getStyleClass().add(classeCSS);
		}
	}
}
