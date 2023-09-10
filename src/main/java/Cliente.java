import java.util.Vector;

public class Cliente {
	private String nombre;
	private int rut;
	private int edad;
	private Vector<CuentaBancaria> cuentasBancarias = new Vector<CuentaBancaria>();

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getRut() {
		return this.rut;
	}

	public void setRut(int rut) {
		this.rut = rut;
	}

	public int getEdad() {
		return this.edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public Cliente(String nombre, String rut, int edad) {
		super();
	}

	public Vector<CuentaBancaria> getCuentaBancaria() {
		return this.cuentasBancarias;
	}
}