package clase1;
import java.util.Scanner;
public class ejersicio2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		float ingresosMensuales;
		int cantidadVeiculos;
		int cantidadInmuebles;
		int cantidadEmbarcacion;
		
		System.out.println("ingrese su ingreso mensual como figura en su resibo de haberes ");
		ingresosMensuales = teclado.nextFloat();
		
		System.out.println("ingrese la cantidad de veiculos que figuran a su nombre:  ");
		cantidadVeiculos = teclado.nextInt();
		
		System.out.println("ingrese la cantidad de inmuebles que figuran a su nombre:  ");
		cantidadInmuebles = teclado.nextInt();
		
		System.out.println("ingrese la cantidad de embarcaciones que figuran a su nombre:  ");
		cantidadEmbarcacion = teclado.nextInt();
		
		
		if(ingresosMensuales > 489.083 && cantidadVeiculos >= 3 && cantidadInmuebles >= 3 && cantidadEmbarcacion >=3 ) {
			System.out.println("usted pertenece a personas de ingresos altos ");
		}
		else {
			System.out.println("usted pertenece a la clase de personas con ingresos bajos ");
		}
	}

}
