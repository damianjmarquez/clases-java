package clase1;
import java.util.Scanner;
public class ejersio1c {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
        System.out.println("los numeros pares son ");
		
		int numeroInicio = 2;
		int numeroFin = 10;
		int mostrar;
		System.out.println("ingrese 1 para par y 2 para impar");
		mostrar = teclado.nextInt();
		
		if (mostrar ==1) {
			System.out.println("usted ingreso 1 los numeros pares son: ");
			if (numeroInicio %2==0) {
				
			while( numeroInicio<=numeroFin){
				System.out.println(numeroInicio);
				numeroInicio += 2;
				
			}
			}
			else {
				
				if (numeroInicio %2==1) {
					numeroInicio += 1;
					while( numeroInicio<=numeroFin){
						
						
						System.out.println(numeroInicio);
						numeroInicio +=2;
					}
				}
		
		
			}
		}
		else {
			if(mostrar == 2) {
				System.out.println("usted ingreso 2 los numeros impares son: ");
				if (numeroInicio %2==1) {
					while( numeroInicio<=numeroFin){
						System.out.println(numeroInicio);
						numeroInicio += 2;
						
					}
				}
					else {
						if (numeroInicio %2==0) {
							numeroInicio += 1;
							while( numeroInicio<=numeroFin){
								
								
								System.out.println(numeroInicio);
								numeroInicio +=2;
							}
						}
					}
			}
			else {
				System.out.println("no ingreso una opcion correcta ingrese 1 para mostrar numeros pares y 2 para numeros impares");
			}
		}
				
	
	}
			
		
	}


