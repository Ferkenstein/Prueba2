package Prueba2FA;

public class Lavadora extends Electrodomestico {

	// Atributo propio de la clase lavadora
	private int cargaLavadora;

	// Definicion de constante por defecto
	protected final int CARGALAVADORA_INICIAL = 5;

	// Constructor por defecto
	public Lavadora() {
		super();
		this.cargaLavadora = CARGALAVADORA_INICIAL;
	}

	// Constructor precio y peso
	public Lavadora(double precioBase, double peso) {
		super(precioBase, peso);
	}

	// Constructor con los atributos heredados
	public Lavadora(String color, char consumoEnergetico, double peso, double precioBase, int cargaLavadora) {
		super(precioBase, color, consumoEnergetico, peso);
		this.cargaLavadora = cargaLavadora;
	}

	// Get de atributo cargaLavadora
	public int getCargaLavadora() {
		return cargaLavadora;
	}

	// Adicionar a Precio Total 50 si existe una carga mayor a 30, sino mantener
	// Precio Total

	protected double PrecioFinalLavadora() {
		double PrecioTotalLavadora = PrecioFinalElectrodomestico();
		if (cargaLavadora > 30) {
			PrecioTotalLavadora += 50;
			return PrecioTotalLavadora;
		} else {
			return PrecioTotalLavadora;
		}

	}

}
