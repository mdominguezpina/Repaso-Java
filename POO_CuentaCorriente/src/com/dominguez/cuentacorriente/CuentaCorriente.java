package com.dominguez.cuentacorriente;

public class CuentaCorriente {

	public static void main(String[] args) {
		
		Cuenta cuenta1 = new Cuenta("Manuel Dominguez Piña", 900);
		Cuenta cuenta2 = new Cuenta("Adrian Gomez Gamarra", 600);
		
		System.out.print("Estos son los valores iniciales de la cuenta numero 1 y numero 2" + "\n".repeat(2));
		imprimirEstado(cuenta1, cuenta2);
		
		
		System.out.print("Haremos un ingreso de 100 euros en la cuenta número 1" + "\n" + 
				"y un ingreso de 200 euros en la cuenta número 2" + "\n".repeat(2));
		cuenta1.setIngreso(100);
		cuenta2.setIngreso(200);
		
		imprimirEstado(cuenta1, cuenta2);

		System.out.print("Haremos una retirada de 200 euros en la cuenta número 1" + "\n" + 
				"y una retirada de 100 euros en la cuenta número 2" + "\n".repeat(2));
		cuenta1.setReintegro(200);
		cuenta2.setReintegro(100);
		
		imprimirEstado(cuenta1, cuenta2);
		
		System.out.print("Haremos una tranferencia de 200 euros desde la cuenta número 1" + "\n" + 
				"a la cuenta número 2" + "\n".repeat(2));
		Cuenta.setTranferencia(cuenta1, cuenta2, 200);
		
		imprimirEstado(cuenta1, cuenta2);
		
	}
	
	public static void imprimirEstado(Cuenta cuenta1, Cuenta cuenta2) {
	    System.out.println(cuenta1.getDatosCuenta() + "\n");
	    System.out.println(cuenta2.getDatosCuenta() + "\n");
	}

}
