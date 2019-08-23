package excecao.personalizadaB;


@SuppressWarnings("serial")
public class StringVaziaException extends Exception {
	
	private String nomeDoAtributo;
	
	public StringVaziaException(String nomeDoAtributo) {
		this.nomeDoAtributo = nomeDoAtributo;
	}
	
	
	public String getMessage() {
		return String.format("O atributo '%s' está vazio.",
				nomeDoAtributo);
	}
}
