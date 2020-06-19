package Prueba2FA;

public class Television extends Electrodomestico {

	// Atributo propio de la clase television
	private int resolucion;
	private boolean sintonizador;

	// Definicion de constante por defecto
	protected final int RESOLUCION_INICIAL = 20;
	protected final boolean SINTONIZADOR_INICIAL = false;

	// Constructor por defecto
	public Television() {
		super();
		this.resolucion = RESOLUCION_INICIAL;
		this.sintonizador = SINTONIZADOR_INICIAL;
	}

	// Constructor con el precio y peso.
	public Television(double precioBase, double peso) {
		super(precioBase, peso);
	}

	// Constructor con resolucion, sintonizador y atributos heredados
	public Television(double precioBase, String color, char consumoEnergetico, double peso, int resolucion,
			boolean sintonizador) {
		super(precioBase, color, consumoEnergetico, peso);
		this.resolucion = resolucion;
		this.sintonizador = sintonizador;
	}

	// Metodo get atributo Resolucion
	public int getResolucion() {
		return resolucion;
	}

	// Metodo get atributo Sintonizador
	public boolean isSintonizador() {
		return sintonizador;
	}

	protected double PrecioFinalTelevision() {
		double PrecioTotalTelevision = PrecioFinalElectrodomestico();
		// Adicionar si precio
		if (resolucion > 40) {
			PrecioTotalTelevision = (PrecioTotalTelevision * 1.30);
		}

		// Adicionar 50 si existe sintonizador
		if (sintonizador == true) {
			PrecioTotalTelevision += 50;
		}
		return PrecioTotalTelevision;
	}
}
