// Sus atributos son precio base, color, consumo energético (letras entre A y F) y peso. Indica que se podrán heredar
// Por defecto, el color será blanco, el consumo energético será F, el precioBase es de $100.000 y el peso de 5 kg. Usar constantes para ello
// Los colores disponibles son blanco, negro, rojo, azul y gris. No importa si el nombre está en mayúsculas o en minúsculas.

package Prueba2FA;

public class Electrodomestico {

	// Definición de atributos heredables
	protected double precioBase;
	protected String color;
	protected char consumoEnergetico;
	protected double peso;

	// Definicion constantes por defecto
	protected final String COLOR_INICIAL = "BLANCO";
	protected final char CONSUMO_INICIAL = 'F';
	protected final double PRECIO_INICIAL = 100000;
	protected final double PESO_INICIAL = 5;

	// Constructor por defecto
	public Electrodomestico() {
	}

	// Constructor con el precio y peso
	public Electrodomestico(double precioBase, double peso) {
		this.precioBase = precioBase;
		this.peso = peso;
	}

	// Constructor con todos los atributos
	public Electrodomestico(double precioBase, String color, char consumoEnergetico, double peso) {
		this.precioBase = precioBase;
		this.color = color;
		this.consumoEnergetico = consumoEnergetico;
		this.peso = peso;
	}

	// Metodo get de los atributos
	public double getPrecioBase() {
		return precioBase;
	}

	public String getColor() {
		return color;
	}

	public char getConsumoEnergetico() {
		return consumoEnergetico;
	}

	public double getPeso() {
		return peso;
	}

	// comprobarConsumoEnergetico(char letra): comprueba que la letra es correcta,
	// sino es correcta usara la letra por defecto.
	// Se invocará al crear el objeto y no sera visible.

	public void comprobarConsumoEnergetico(char consumoEnergetico) {
		// Transformar variable consumoEnergetico a mayuscula
		consumoEnergetico = Character.toUpperCase(consumoEnergetico);

		if (consumoEnergetico == 'A' || consumoEnergetico == 'B' || consumoEnergetico == 'C' || consumoEnergetico == 'D'
				|| consumoEnergetico == 'E' || consumoEnergetico == 'F') {
			this.consumoEnergetico = consumoEnergetico;
		} else {
			this.consumoEnergetico = CONSUMO_INICIAL;

		}
	}

// Comprueba que el color es correcto, sino lo es usa el color por defecto. Se invocará al crear el objeto y no será visible.

	public void comprobarColor(String color) {
		// Transformar variable color a mayuscula
		color = color.toUpperCase();

		if (color == "BLANCO" || color == "NEGRO" || color == "AZUL" || color == "GRIS" || color == "ROJO") {
			this.color = color;
		} else {
			this.color = COLOR_INICIAL;

		}
	}

	protected double PrecioFinalElectrodomestico() {
		double precioTotal = precioBase;

		// Dependiendo de el consumo es el cobro agregado
		if (consumoEnergetico == 'A') {
			precioTotal += 100;
		} else if (consumoEnergetico == 'B') {
			precioTotal += 80;
		} else if (consumoEnergetico == 'C') {
			precioTotal += 60;
		} else if (consumoEnergetico == 'D') {
			precioTotal += 50;
		} else if (consumoEnergetico == 'E') {
			precioTotal += 30;
		} else if (consumoEnergetico == 'F') {
			precioTotal += 10;
		}

		// Dependiendo el peso es el cobro agregado
		if (peso >= 0 && peso <= 19) {
			precioTotal += 10;
		} else if (peso >= 20 && peso <= 49) {
			precioTotal += 50;
		} else if (peso >= 50 && peso <= 79) {
			precioTotal += 80;
		} else if (peso >= 80) {
			precioTotal += 100;
		}

		return precioTotal;

	}

}
	


	
	
	
	
	
	
	
			
	


