package model.exceptions;

public class ErroPersonalizadoException extends RuntimeException {

	private static final long serialVersionUID = 1L;//RuntimeException -> N�o � obriogado a tratar j� o Exception deve ser trato (igual o parse)

	public ErroPersonalizadoException(String msg) {//passar uma mensagem para minha excess�o
		super(msg);
	}
	
	
	
	
}
