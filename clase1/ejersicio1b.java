package clase1;

public class ejersicio1b {

	public static void main(String[] args) {
		
		System.out.println("los numeros pares son ");
		
		int numeroInicio = 2;
		int numeroFin = 10;
	
		while(numeroInicio <= numeroFin){
			if (numeroInicio %2==0) {
				System.out.print(numeroInicio + " ");
				numeroInicio += 2;
			}
			else {
				numeroInicio +=1;
			}
		}

	}
  
}