package Prueba2FA;

import java.util.Scanner;

public class Ejecutable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Crear lista con 10 posiciones
		Electrodomestico electrodomesticos[]= new Electrodomestico[10];
		
		// Asignar a cada posicion un objeto
		// Electrodomestico recibe precio base, color, consumo energetico y peso
		electrodomesticos[0] = new Electrodomestico(0, "Gris" , 'C' , 10) ;
		electrodomesticos[1] = new Electrodomestico(0, "Amarillo" , 'd' , 90) ;
		electrodomesticos[2] = new Lavadora(0, 0, 30) ;
		electrodomesticos[3] = new Electrodomestico(0, "Rojo" , 'z' , 1) ;
		electrodomesticos[4] = new Television(0, 0, 40, true) ;
		electrodomesticos[5] = new Lavadora(0, 10, 1) ;
		electrodomesticos[6] = new Electrodomestico(0, "Azul" , 'a' , 200) ;
		electrodomesticos[7] = new Lavadora(0, 44, 15) ;
		electrodomesticos[8] = new Electrodomestico(0, "negRO" , 'F' , 79) ;
		electrodomesticos[9] = new Television(0, 0, 0, true) ;
		
		// Recorrer Lista para mostrar precio Total
		
		double sumaElectrodomestico = 0;
		double sumaLavadora = 0;
		double sumaTelevision = 0;
		
		for (int i = 0; i < electrodomesticos.length; i++) {
			if (electrodomesticos[i] instanceof Electrodomestico) {
				sumaElectrodomestico += electrodomesticos[i].PrecioFinalElectrodomestico();
			}
			if (electrodomesticos[i] instanceof Lavadora) {
				sumaLavadora += ((Lavadora)electrodomesticos[i]).PrecioFinalLavadora();
			}
			else if (electrodomesticos[i] instanceof Television) {
				sumaTelevision += ((Television)electrodomesticos[i]).PrecioFinalTelevision();
			}
		}
		
		System.out.println("Electrodomestico: " + sumaElectrodomestico);
		System.out.println("Lavadora: " + sumaLavadora);
		System.out.println("Television: " + sumaTelevision);

	}
}