package sumador;

public class ASumar {
	
	String valorInicial;
	/**
	 * @author Álvaro Rodríguez Martínez
	 * @param string
	 * @version 1.0
	 */
	public ASumar(String string) {
		this.valorInicial = string;
	}
	
	public String mostrar() {
		String numero = valorInicial;
		if (numero.length() == 1) {
			return (numero + " = " + numero);
		}
		return ("N�mero incorrecto");
	}	
	

	public String mostrarNegativo() {
		String numero = valorInicial;
		if (Integer.parseInt(numero) > 0) {
			return (numero + " = " + numero);
		}else {
			return ("");
		}
	}
	
}
