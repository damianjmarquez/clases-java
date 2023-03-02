package clase3;

public class ej1a {

	public static void main(String[] args) {
		// ejersicio número 1 a
				String palabra = "programacion";
				String [] juntar = palabra.split("");
				
				String letra = "a";
				
				
				int contar = 0;
				for (int i = 0; i < juntar.length; i++) {
					if (palabra.charAt(i)== letra.charAt(0)) {
						contar = contar+1;
						
					}
				}
				System.out.println("La letra  " + letra + " Se repite " + contar + " veces ");
				
			

	}

}
