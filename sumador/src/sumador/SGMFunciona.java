package sumador;

public class SGMFunciona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * Prueba el metodo mostrar
		 */
		ASumar ob1 = new ASumar("7");
		System.out.println(ob1.mostrar());
		/**
		 * Prueba el metodo mostrar negativo
		 */
		ASumar ob2 = new ASumar("-89");
		System.out.println(ob2.mostrarNegativo());
		/**
		 * Prueba el metodo total
		 */
		ASumar ob3 = new ASumar("24324234");
		System.out.println(ob3.total());
	}

}
