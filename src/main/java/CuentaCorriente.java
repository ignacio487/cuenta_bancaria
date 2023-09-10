public class CuentaCorriente extends CuentaBancaria {
	private int lineaDeSobregiro;

	public String getTipo() {
		return getTipo();
	}

	public int getLineaDeSobregiro() {
		return this.lineaDeSobregiro;
	}

	public void setLineaDeSobregiro(int lineaDeSobregiro) {
		this.lineaDeSobregiro = lineaDeSobregiro;
	}

	public CuentaCorriente(String numeroCuenta, String lineaDeSobregiro, double cliente, double sucursal) {
		super(numeroCuenta,lineaDeSobregiro,cliente,sucursal);
	}

	public void mostrarDetallesCuenta(CuentaBancaria cuentaBancaria) {
		CuentaCorriente cuentaCorriente = (CuentaCorriente) cuentaBancaria;
		System.out.println("Tipo de cuenta: Cuenta Corriente");
		System.out.println("Número de cuenta: " + cuentaCorriente.getNumeroCuenta());
		System.out.println("Fecha de apertura: " + cuentaCorriente.getFechaApertura());
		System.out.println("Saldo: " + cuentaCorriente.getSaldo());
		System.out.println("Línea de sobregiro: " + cuentaCorriente.getLineaDeSobregiro());
		System.out.println("Cliente: " + cuentaCorriente.getCliente().getNombre());
	}

}