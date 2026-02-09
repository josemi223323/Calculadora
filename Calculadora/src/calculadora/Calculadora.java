package calculadora;

import java.util.ArrayList;

public class Calculadora {
	private static LeerInt lectorInteger = new LeerInt();
	private int pilaNumeros;
	private ArrayList<Integer>resultados = new ArrayList<>();
	public void sumar(int numerosASumar) {
		for(int i=0;i<numerosASumar;i++) {
			pilaNumeros += lectorInteger.lector("introduce un numero a sumar",true);
		}
		System.out.println("el resultado es " + pilaNumeros);
		resultados.add(pilaNumeros);
		pilaNumeros = 0;
	}
	public void restar(int numerosARestar) {
		for(int i=0;i<numerosARestar;i++) {
			if(i==0) {
				pilaNumeros = lectorInteger.lector("introduce un numero a restar",true);
			}else {
				pilaNumeros -= lectorInteger.lector("introduce un numero a restar",true);
			}
		}
		System.out.println("el resultado es " + pilaNumeros);
		resultados.add(pilaNumeros);
		pilaNumeros = 0;
	}
	public void multiplicar(int numerosAMultiplicar) {
		for(int i=0;i<numerosAMultiplicar;i++) {
			if(i==0) {
				pilaNumeros = lectorInteger.lector("introduce un numero a multiplicar",true);
			}else {
				pilaNumeros *= lectorInteger.lector("introduce un numero a multiplicar",true);
			}
		}
		System.out.println("el resultado es " + pilaNumeros);
		resultados.add(pilaNumeros);
		pilaNumeros = 0;
	}
	public void dividir(int numerosADividir) {
		for(int i=0;i<numerosADividir;i++) {
			if(i==0) {
				pilaNumeros = lectorInteger.lector("introduce un numero a multiplicar",true);
			}else {
				pilaNumeros /= lectorInteger.lector("introduce un numero a multiplicar",true);
			}
		}
		System.out.println("el resultado es " + pilaNumeros);
		resultados.add(pilaNumeros);
		pilaNumeros = 0;
	}
	public int resultadoAnterior() {
		int resultadoAnterior = resultados.get(resultados.size()-2);
		return resultadoAnterior;
	}
	public int ultimoResultado() {
		int resultadoAnterior = resultados.get(resultados.size()-2);
		return resultadoAnterior;
	}
	
	
}
