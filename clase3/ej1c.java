package clase3;

public class ej1c {

	public static void main(String[] args) {
		int vector [] = new int [] {3,4,11,10,20,30,40};
		int x = 12;
		int resultado = 0;
		for (int i = 0; i < vector.length;i++) {
			if (vector[i] > x) {
				resultado = vector[i] + resultado;
			}
		}
		System.out.println("el resultado de los numeros mayores a " + x + " es " + resultado);
		
	}

}
