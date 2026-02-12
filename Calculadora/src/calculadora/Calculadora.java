//el codigo sigue el estandar kiss en general pues lo intento mantener simple
//en el codigo evito usar numeros magicos
//tambien evito dar pistas faltas sobre el funcionamiento del programa
package calculadora;

import java.util.ArrayList;
import java.util.OptionalInt;
public class Calculadora {
	private static LecturaEnteros lectorInteger = new LecturaEnteros();
	private int acumulador;
	private ArrayList<Integer>resultados = new ArrayList<>();// por ejemplo resultados es un nombre de variable buscable
	//en el codigo evito usar muchos argumentos de funciones, la maxima cantidad de argumentos que tiene una funcion son 1
	//intento mantener el DRY,el unico caso donde no lo sigo del todo es en las operaciones de calculo pues quiero evitar usar muchos argumentos para las funciones
	public void sumar(int numerosASumar) {
		for(int i=0;i<numerosASumar;i++) {
			acumulador += lectorInteger.lector("introduce un numero a sumar",true);
		}
		System.out.println("el resultado es " + acumulador);
		resultados.add(acumulador); 
		acumulador = 0;
	}
	public void restar(int numerosARestar) {
		for(int i=0;i<numerosARestar;i++) {
			if(i==0) {
				acumulador = lectorInteger.lector("introduce un numero a restar",true);
			}else {
				acumulador -= lectorInteger.lector("introduce un numero a restar",true);
			}
		}
		System.out.println("el resultado es " + acumulador);
		resultados.add(acumulador);
		acumulador = 0;
	}
	public void multiplicar(int numerosAMultiplicar) {
		for(int i=0;i<numerosAMultiplicar;i++) { // el unico caso donde hago asignaciones mentales es en los bucles, en el resto las variables usan un nombre
			if(i==0) {
				acumulador = lectorInteger.lector("introduce un numero a multiplicar",true);
			}else {
				acumulador *= lectorInteger.lector("introduce un numero a multiplicar",true);
			}
		}
		System.out.println("el resultado es " + acumulador);
		resultados.add(acumulador);
		acumulador = 0;
	}
	public void dividir(int numerosADividir) {
		for(int i=0;i<numerosADividir;i++) {
			if(i==0) {
				acumulador = lectorInteger.lector("introduce un numero a dividir",true);
			}else {
				acumulador /= lectorInteger.lector("introduce un numero a dividir",true);
			}
		}
		System.out.println("el resultado es " + acumulador);
		resultados.add(acumulador);
		acumulador = 0;
	}
	//Use la clase optionalInt para evitar usar valores como -1 y asi evitar usar numeros magicos
	public OptionalInt resultadoAnterior() {
		if(resultados.isEmpty()) {
			return OptionalInt.empty();
		}else {
			int resultadoAnterior = resultados.get(resultados.size()-1);
			return OptionalInt.of(resultadoAnterior);
		}
	}
	public OptionalInt ultimoResultado() {
		if(resultados.isEmpty()) {
			return OptionalInt.empty();
		}else {
			int resultadoAnterior = resultados.get(resultados.size());
			return OptionalInt.of(resultadoAnterior);
		}
	}
	public void verTodosLosCalculos() {
		for(Integer calculos : resultados) {
			System.out.println(calculos + "\t");
		}
	}
	public Boolean borrarHistorial() {
		if(resultados.isEmpty()) {
	        return false;
	    }
	    resultados.clear();
	    return true;
	}
	public Boolean borrarUltimoNumero() {
		if(!resultados.isEmpty()) {
			resultados.remove(resultados.size()-1);
			return true;
		}
		return false;
	}
	
}