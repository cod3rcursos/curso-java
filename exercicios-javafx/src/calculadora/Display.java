package calculadora;

import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public class Display extends HBox {
	
	
	private Label label = new Label("0");
	
	public Display() {
		setAlignment(Pos.BOTTOM_RIGHT);
		getStyleClass().add("display");
		
		label.getStyleClass().add("texto-display");
		getChildren().add(label);
	}
		
	public void addTexto(String novoTexto) {
		String texto = getTextoAtual();
		
		if(texto.isEmpty() && novoTexto.equals(",")) {
			texto = "0,";
		} else if(!texto.contains(",") && novoTexto.equals(",")) {
			texto += novoTexto;
		} else if(novoTexto.matches("\\d")) {
			texto += novoTexto;
		}
		
		if(texto.isEmpty() || texto.equals("00")) {
			texto = "0";
		}
		
		setTextoAtual(texto);		
	}

	public String getTextoAtual() {
		return "0".equals(label.getText()) ? "" : label.getText(); 
	}
	
	private void setTextoAtual(String novoTexto) {
		label.setText(novoTexto);
		ajustarTamanhoDaFonte();
	}
	
	private void ajustarTamanhoDaFonte() {
		final int TAMANHO_PADRAO_FONTE = 44;
		int tamanho = TAMANHO_PADRAO_FONTE;
		
		Text text = new Text(label.getText());
		
		do {
			text.setFont(new Font(label.getFont().getName(), tamanho));
			label.setStyle("-fx-font-size:" + tamanho + "px;");			
			tamanho--;
		} while(text.getBoundsInLocal().getWidth() > 210);
	}

	public void limpar() {
		label.setText("0");
	}	
}
