package com.dominguez.cuentacorriente;

public class Cuenta {
	
	private String titular;
	private double saldo;
	private String numeroCuenta;
	
	public Cuenta(String titular, double saldo) {
		
		this.titular=titular;
		this.saldo=saldo;
		numeroCuenta = generarIbanAleatorio();
		
		
	}
	
	public Cuenta() {
		
	}
	
	public void setIngreso(double ingreso) {
		
		if(ingreso<0) System.out.print("no se permiten ingresos negativos");
		else saldo+=ingreso;
	}
	
	public void setReintegro(double reintegro) {
		saldo-=reintegro;
	}
	
	public static void setTranferencia (Cuenta cuenta1, Cuenta cuenta2, double cantidad) {
		
		if (cantidad <= 0 || cantidad > cuenta1.saldo) {
	        System.out.println("Transferencia no válida. Verifique el saldo o la cantidad.");
		}else
		cuenta1.saldo-=cantidad;
		cuenta2.saldo+=cantidad;
		
	}
	
	public String getDatosCuenta() {
		
		return "Titular: " + titular + "\n" +
		"Numero de cuenta: " + numeroCuenta + "\n" +
		"Saldo: " + saldo;
	}
	
	 private String generarIbanAleatorio() {
	        String pais = "ES";
	        int digitoControl = (int)(Math.random() * 90 + 10);
	        StringBuilder numeroCuenta = new StringBuilder();
	        for (int i = 0; i < 16; i++) {
	            numeroCuenta.append((int)(Math.random() * 10));
	        }
	        return pais + digitoControl + numeroCuenta.toString();
	    }
	
	

}
