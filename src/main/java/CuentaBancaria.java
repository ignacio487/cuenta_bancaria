public class CuentaBancaria {
	private String numeroCuenta;
	private String fechaApertura;
	private int saldo;
	private SucursalBancaria sucursalBancaria;
	private Cliente cliente;

	private String tipo;  // Atributo para almacenar el tipo de cuenta (ahorro o corriente)

	public void Cuenta(String numeroCuenta, int fechaApertura, double saldo, String tipo) {
		// Constructor de la clase
		// Inicializa otros atributos
		this.tipo = tipo;
	}
	public String getNumeroCuenta() {
		return this.numeroCuenta;
	}

	public void setNumeroCuenta(String numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}

	public String getFechaApertura() {
		return this.fechaApertura;
	}

	public void setFechaApertura(String fechaApertura) {
		this.fechaApertura = fechaApertura;
	}

	public int getSaldo() {
		return this.saldo;
	}

	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}

	public CuentaBancaria(String numeroCuenta, String reajusteAnual, double cliente, double sucursal) {
		super();
	}

	public SucursalBancaria getSucursalBancaria() {
		return this.sucursalBancaria;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	CuentaAhorro cuentaAhorro = new CuentaAhorro("12102", new String(), 1490.0, 0.07);
	String tipoCuentaAhorro = cuentaAhorro.getTipo(); // Devuelve "Ahorro"

	CuentaCorriente cuentaCorriente = new CuentaCorriente("040715", new String(), 2050.0, 345.0);
	String tipoCuentaCorriente = cuentaCorriente.getTipo(); // Devuelve "Corriente"
}