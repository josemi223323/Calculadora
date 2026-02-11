package calculadora;

import java.util.ArrayList;
//Nombres de funciones como verbos y clases como sustantivos
public class Calculadora {
	//Usar nombres que revelen las intenciones
	private static LecturaEnteros lectorInteger = new LecturaEnteros();
	private int acumulador;
	private ArrayList<Integer>resultados = new ArrayList<>();
	//Funciones de tamaño reducido
	/*Hice que las funciones tengan la minima cantidad de argumentos posible, para asi que el codigo sea lo mas limpio, tambien uso verbos para la funciones y sustantivos para las clases*/
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
		for(int i=0;i<numerosAMultiplicar;i++) {
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
				acumulador = lectorInteger.lector("introduce un numero a multiplicar",true);
			}else {
				acumulador /= lectorInteger.lector("introduce un numero a multiplicar",true);
			}
		}
		System.out.println("el resultado es " + acumulador);
		resultados.add(acumulador);
		acumulador = 0;
	}
	public int resultadoAnterior() {
		int resultadoAnterior = resultados.get(resultados.size()-1);
		return resultadoAnterior;
	}
	public int ultimoResultado() {
		int resultadoAnterior = resultados.get(resultados.size());
		return resultadoAnterior;
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
	
}
