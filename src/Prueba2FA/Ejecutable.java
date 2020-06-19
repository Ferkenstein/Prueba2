package Prueba2FA;

public class Ejecutable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Crear lista con 10 posiciones
		Electrodomestico electrodomesticos[] = new Electrodomestico[10];

		// Asignar a cada posicion un objeto
		electrodomesticos[0] = new Electrodomestico();
		electrodomesticos[1] = new Lavadora();
		electrodomesticos[2] = new Television();
		electrodomesticos[3] = new Electrodomestico(50000, 80);
		electrodomesticos[4] = new Lavadora(10000, 50);
		electrodomesticos[5] = new Television(5000, 100);
		electrodomesticos[6] = new Electrodomestico(12000, "Gris", 'c', 35);
		electrodomesticos[7] = new Lavadora("Amarillo", 'z', 40, 12000, 50);
		electrodomesticos[8] = new Television(10000, "Rojo", 'a', 41, 41, false);
		electrodomesticos[9] = new Lavadora("Negro", 'b', 2, 100, 30);

		// Recorrer Lista para mostrar precio Total

		double sumaElectrodomestico = 0;
		double sumaLavadora = 0;
		double sumaTelevision = 0;

		for (int i = 0; i < electrodomesticos.length; i++) {
			if (electrodomesticos[i] instanceof Electrodomestico) {
				sumaElectrodomestico += electrodomesticos[i].PrecioFinalElectrodomestico();
			}
			if (electrodomesticos[i] instanceof Lavadora) {
				sumaLavadora += ((Lavadora) electrodomesticos[i]).PrecioFinalLavadora();
			} else if (electrodomesticos[i] instanceof Television) {
				sumaTelevision += ((Television) electrodomesticos[i]).PrecioFinalTelevision();
			}
		}

		System.out.println("Electrodomestico: " + sumaElectrodomestico);
		System.out.println("Lavadora: " + sumaLavadora);
		System.out.println("Television: " + sumaTelevision);

	}
}