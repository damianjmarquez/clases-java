package clase1;

public class ejersicio1d {

	public static void main(String[] args) {
		int numeroInicio = 2;
		int numeroFin = 10;
		System.out.println("los numeros pares son los siguientes: ");
		for (int i = numeroFin; i >= numeroInicio; i--) {
			
			if (i %2==0) {
				System.out.print(i + " ");
				
			}
			
		}

	}

}
