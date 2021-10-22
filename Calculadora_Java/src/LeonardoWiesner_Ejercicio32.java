import java.util.Scanner;

public class LeonardoWiesner_Ejercicio32 {

	public static void main(String[] args) { // Ejercicio 32 by Leonardo Wiesner
		// TODO Auto-generated method stub
		Scanner metodo = new Scanner(System.in);// Instanciar el lector

		float numero1 = 0;// Primer numero que ingresa el usuario
		float numero2 = 0;// Segundo numero que ingresa el usuario
		int eleccionoperacion = 0;// ELECCION USUARIO DE QUE OPERACION QUIERE EJECUTAR
		char opcion_mismos_numeros; // Variable que guarda la eleccion del usuario si quiere ejecutar la operacion
									// con mismos num
		boolean ejecutar = true;// Booleano valor verdadero para saber si finaliza el programa
		boolean ejecutar2 = true;// Booleano valor verdadero para saber si abre la pregunta finalizar

		System.out.println("Calculadora de dos numeros (A tu eleccion)");

		while (ejecutar) {// INICIO DEL PROGRAMA CON BOOLEANO TRUE

			System.out.println("Introduce un numero");
			numero1 = metodo.nextFloat();// LECTURA PRIMER NUMERO

			System.out.println("Introduce un segundo numero");
			numero2 = metodo.nextFloat();// LECTURA SEGUNDO NUMERO

			ejecutar2 = true;// ASIGNACION DE VALOR TRUE PARA QUE ENTRE EN EL SIGUIENTE WHILE

			while (ejecutar2 == true) {
				System.out.println("Que operacion deseas realizar ");
				System.out.println("SUMA : 1 - RESTA: 2 - MULTIPLICACION:3 - DIVISION:4");
				eleccionoperacion = metodo.nextInt();// LECTURA DE DATOS PARA EJECUTAR OPERACION

				System.out.println(eleccionoperacion);
				while (eleccionoperacion < 1 || eleccionoperacion > 4) {// CASO EN EL QUE EL USUARIO INTRODUZCA UN
																		// NUMERO DIFERENTE
					System.out.println("SUMA : 1 - RESTA: 2 - MULTIPLICACION:3 - DIVISION:4");
					eleccionoperacion = metodo.nextInt();
				}

				if (eleccionoperacion == 1) {// SUMA
					System.out.println("El resultado de " + numero1 + " + " + numero2 + " es: " + (numero1 + numero2));
				} else if (eleccionoperacion == 2) {// RESTA
					System.out.println("El resultado de " + numero1 + " - " + numero2 + " es: " + (numero1 - numero2));
				} else if (eleccionoperacion == 3) {// MULTIPLICACION
					System.out.println("El resultado de " + numero1 + " * " + numero2 + " es: " + (numero1 * numero2));
				} else if (eleccionoperacion == 4) {// DIVISION
					System.out.println("El resultado de " + numero1 + " / " + numero2 + " es: " + (numero1 / numero2));
				}

				// PREGUNTA PARA CONTINUAR OPERANDO CON LOS MISMOS NUMEROS
				System.out.println("¿Deseas continuar operando con los mismos numeros? S/N");
				System.out.println("s = SI / n = NO ");
				opcion_mismos_numeros = metodo.next().charAt(0);

				while (opcion_mismos_numeros != 's' && opcion_mismos_numeros != 'n') {// METODO INTRODUCCION DATO
																						// ERRONEO
					System.out.println("¿Deseas continuar operando con los mismos numeros? S/N");
					System.out.println("s = SI / n = NO ");
					opcion_mismos_numeros = metodo.next().charAt(0);
				}

				if (opcion_mismos_numeros == 'n') {// ELECCION NEGATIVA A SEGUIR OPERANDO CON LOS MISMOS NUM
					ejecutar2 = false; // VALOR BOOLEANO FALSE PARA VOLVER A INTRODUCIR LOS NUMEROS

					System.out.println("Deseas terminar el programa");// PREGUNTA PARA FINALIZACION
					System.out.println("S/N");
					opcion_mismos_numeros = metodo.next().charAt(0);
					// CASO DE DATOS ERRONEOS POR EL USUARIO
					while (opcion_mismos_numeros != 's' && opcion_mismos_numeros != 'n') {
																							
						System.out.println("Deseas terminar el programa");
						System.out.println("S/N");
						opcion_mismos_numeros = metodo.next().charAt(0);
					}
					if (opcion_mismos_numeros == 's') {
						ejecutar = false;// FINALIZAR EJECUCION
					}
				}
			}
		}
		metodo.close();// cierre del lector
	}

}
