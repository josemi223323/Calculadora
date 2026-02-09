package calculadora;

public class Main {
	private static LeerInt lectorInteger = new LeerInt();
	private static LeerString lectorString = new LeerString();
	public static void main(String[] args) {
		Boolean seguir = true;
		Calculadora calculadora = new Calculadora();
		while(seguir) {
			System.out.println("introduce una opcion: 1: calcular,2:conseguir el ultimo resultado,3:conseguir el resultado anterior");
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
				case 5:
					seguir = false;
					System.out.println("adios");
			}
		}
	}
	private static void verTodoslosCalculos(Calculadora calculadora) {
		calculadora.verTodosLosCalculos();
		
	}
	private static void resultadoAnterior(Calculadora calculadora) {
		System.out.println("el resultado anterior es " + calculadora.resultadoAnterior());
		
	}
	private static void ultimoResultado(Calculadora calculadora) {
		System.out.println("el ultimo resultado es " + calculadora.ultimoResultado());
		
	}
	private static void elegirCalculo(Calculadora calculadora) {
		String opcion = lectorString.lector("introduce que quieres hacer sumar/restar/dividir/multiplicar");
		if(opcion.equalsIgnoreCase("sumar")) {
			int numVeces = lectorInteger.lector("cuantas veces quieres sumar?",true);
			calculadora.sumar(numVeces);
		}else if(opcion.equalsIgnoreCase("restar")) {
			int numVeces = lectorInteger.lector("cuantas veces quieres restar?",true);
			calculadora.restar(numVeces);
		}else if(opcion.equalsIgnoreCase("multiplicar")) {
			int numVeces = lectorInteger.lector("cuantas veces quieres multiplicar?",true);
			calculadora.multiplicar(numVeces);
		}else if(opcion.equalsIgnoreCase("dividir")) {
			int numVeces = lectorInteger.lector("cuantas veces quieres dividir?",true);
			calculadora.dividir(numVeces);
		}
		
	}

}
