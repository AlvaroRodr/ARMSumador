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
	
/**
 * Compara si el valor es menor de 10 y mayor que -1
 * @return Devuelve una cadena de texto si el valor es positivo y menor de diez o otra cadena si es negtivo o mayor que 9
 */
	public String mostrar() {
		String numero = valorInicial;
		if (numero.length() == 1) {
			return (numero + " = " + numero);
		}
		return ("Número incorrecto");
	}	
	
	/**
	 * Compara si el número introducido es negativo
	 * @return devuelve una cadena vacía si el valor es negativo
	 */
	public String mostrarNegativo() {
		String numero = valorInicial;
		if (Integer.parseInt(numero) > 0) {
			return (numero + " = " + numero);
		}else {
			return ("");
		}
	}
	
	/**
	 * Compara si el número introducido es mayor que 9 y suma sus digitos
	 * @return devuelve una cadena de texto con el valor total de la suma de los digitos del valor introducido.
	 */
	public String total() {
		int suma = 0;
		String fin = "";
		for(int i = 0; i < valorInicial.length(); i++) {
			String digito = valorInicial.substring(i, i+1);
			suma += Integer.parseInt(digito);
			if (i < 1) {
				fin += digito;
			}else {
				fin += " + " + digito;
			}
		}
		return (fin + " = " + suma);
	}
	
}
