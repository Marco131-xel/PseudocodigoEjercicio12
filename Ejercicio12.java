import java.util.* ;
public class Ejercicio12{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int f = 0, m = 0, em = 0, ef = 0;
		// f es femenino, m es masculino y e son las edades a contar 
	    int sexo;
	    int edad;
	    double estatura;
	    // p son los promedios 
	    double suma1 = 0, suma2 = 0, suma3 = 0, suma4 = 0, p1, p2, p3;

		System.out.println("");
		System.out.println("*********Ejercicio12************");
		System.out.println("");



		for(int i = 1; i <= 2; i++){
			System.out.println("Ingrese 0 si su sexo es femenino");
			System.out.println("Ingrese 1 si su sexo es Masculino");
			sexo = scanner.nextInt();
			if(sexo == 0){
				System.out.println("");
				System.out.println("**Sexo Femenino**");
				System.out.println("Ingrese su edad");
				edad = scanner.nextInt();
				// suma de las edades del sexo femenino
				suma3 = edad + suma3;
				ef = ef + 1;
				System.out.println("Ingrese su Estatura");
				estatura = scanner.nextDouble();
				if(estatura >= 0){
					suma1 = estatura + suma1;
					f = f + 1;
					System.out.println("**Datos guardados**");
					System.out.println("");
				}
				// aqui se acaba el programa 
			}
			else{
				if(sexo == 1){
					System.out.println("");
					System.out.println("**Sexo Masculino**");
				    System.out.println("Ingrese su edad");
				    edad = scanner.nextInt();
				    // suma de las edades del sexo masculino
				    suma4 = edad + suma4;
				    em = em + 1;
				    System.out.println("Ingrese su Estatura");
				    estatura = scanner.nextDouble();
				    if(estatura >= 0){
				    	suma2 = estatura + suma2;
				    	m = m + 1;
				    	System.out.println("**Datos guardados**");
				    	System.out.println("");

				    }
				    //aqui se acaba el programa 

				}

			}

		}
		// aqui termina el for 

        // aqui estab los promedios
        p1 = suma1/f;
        p2 = suma2/m;
        p3 = (suma3+suma4)/(ef+em);

        System.out.println("");
        System.out.println("***PROMEDIOS DE LOS DATOS***");
		System.out.println("El promedio de la estatura del sexo Femenino es: " + p1);
		System.out.println("El promedio de la estatura del sexo Masculino es: " + p2);
		System.out.println("El promedio de la edad de los participantes es: " + p3);
		
		
	}
}