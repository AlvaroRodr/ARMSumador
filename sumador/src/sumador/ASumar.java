package sumador;

public class ASumar {
	
	String valorInicial;
	/**
	 * M�todo constructor para almacenar la variable
	 * @author Salvador Galindo Mart�nez
	 * @param string
	 * @version 1.0
	 */
	public ASumar(String string) {
		this.valorInicial = string;
	}
	
	/**
	 * M�todo que mide la longitud de la variable introducida 
	 * y muestra el resultado
	 * @author Salvador Galindo Mart�nez
	 * @version 1.0
	 * @return devuelve el resultado correcto si cumple la condici�n y si no, 
	 * devuelve un mensaje de error
	 */
	public String mostrar() {
		String numero = valorInicial;
		if (numero.length() == 1) {
			return (numero + " = " + numero);
		}
		return ("N�mero incorrecto");
	}	
	
	/**
	 * M�todo que muestra una cadena de texto vac�a si el n�mero introducido
	 * es negativo.
	 * @author Salvador Galindo Mart�nez
	 * @version 1.0
	 * @return 
	 */
	public String mostrarNegativo() {
		String numero = valorInicial;
		if (Integer.parseInt(numero) > 0) {
			return (numero + " = " + numero);
		}else {
			return ("");
		}

	}
}
