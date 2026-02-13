package calculadora;

import java.util.OptionalInt;

public class Main {
	private static LecturaEnteros lectorInteger = new LecturaEnteros();
	private static LecturaStrings lectorString = new LecturaStrings();
	public static void main(String[] args) {
		Boolean seguir = true;
		Calculadora calculadora = new Calculadora(); // un Ejemplo de nombre de variable que revela intenciones 
		while(seguir) {
			System.out.println("introduce una opcion: 1: calcular,2:conseguir el ultimo resultado,3:conseguir el resultado anterior,4 mostrar todos los resultados,5 borrar hisotiral completo,6 borrar ultimo numero del historial,7 salir");
			int opcion = lectorInteger.lector("",true);
			switch(opcion) {
				case 1:
					elegirCalculo(calculadora);
					break;
				case 2:
					ultimoResultado(calculadora);
					break;
				case 3:
					resultadoAnterior(calculadora);
					break;
				case 4:
					verTodoslosCalculos(calculadora);
					break;
				case 5:
					borrarHistorial(calculadora);
					break;
				case 6:
					borrarUltimoNumero(calculadora);
					break;
				case 7:
					seguir = false;
					System.out.println("adios");
			}
		}
	}
	private static void borrarUltimoNumero(Calculadora calculadora) {
		if(calculadora.borrarUltimoNumero()) {
			System.out.println("eliminado con exito");
		}else {
			System.out.println("la lista esta vacia");
		}
	}
	private static void borrarHistorial(Calculadora calculadora) {
		if(calculadora.borrarHistorial()) {
			System.out.println("historial borrado con exito");
		}else {
			System.out.println("el historial esta vacio");
		}
		
	}
	private static void verTodoslosCalculos(Calculadora calculadora) {
		calculadora.verTodosLosCalculos();
		
	}
	private static void resultadoAnterior(Calculadora calculadora) {
		OptionalInt resultadoAnterior = calculadora.resultadoAnterior();
		if(resultadoAnterior.isEmpty()) {
			System.out.println("la lista esta vacia o solo tienes un calculo hecho");
		}else {
			System.out.println("el resultado anterior es " + resultadoAnterior.getAsInt());
		}
		
	}
	private static void ultimoResultado(Calculadora calculadora) {
		OptionalInt ultimoResultado = calculadora.ultimoResultado();
		if(ultimoResultado.isEmpty()) {
			System.out.println("la lista esta vacia");
		}else {
			System.out.println("el ultimo resultado es " + ultimoResultado.getAsInt());
		}
		
	}
	private static void elegirCalculo(Calculadora calculadora) {
		String opcion = lectorString.lector("introduce que quieres hacer sumar/restar/dividir/multiplicar");
		int numVeces;
		switch(opcion.toLowerCase()) {
			case "sumar":
				numVeces = lectorInteger.lector("introduce la cantidad de numeros que quieres sumar",true);
				calculadora.sumar(numVeces);
				break;
			case "restar":
				numVeces = lectorInteger.lector("introduce la cantidad de numeros que quieres restar",true);
				calculadora.restar(numVeces);
				break;
			case "multiplicar":
				numVeces = lectorInteger.lector("introduce la cantidad de numeros que quieres multiplicar",true);
				calculadora.multiplicar(numVeces);	
				break;
			case "dividir":
				numVeces = lectorInteger.lector("introduce la cantidad de numeros que quieres dividir",true);
				calculadora.dividir(numVeces);
				break;
			default:
				System.out.println("introduce uno correcto");
			
		}
	}

}