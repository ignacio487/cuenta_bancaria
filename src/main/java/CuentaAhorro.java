public class CuentaAhorro extends CuentaBancaria {
	private double reajusteAnual;

	public String getTipo() {
		return getTipo();
	}

	public double getReajusteAnual() {
		return this.reajusteAnual;
	}

	public void setReajusteAnual(double reajusteAnual) {
		this.reajusteAnual = reajusteAnual;
	}

	public CuentaAhorro(String numeroCuenta, String reajusteAnual, double cliente, double sucursal) {
		super(numeroCuenta,reajusteAnual,cliente,sucursal);
	}

	public void mostrarDetallesCuenta(CuentaBancaria cuentaBancaria){
		CuentaAhorro cuentaAhorro = (CuentaAhorro) cuentaBancaria;
		System.out.println("Tipo de cuenta: Cuenta de Ahorro");
		System.out.println("Número de cuenta: " + cuentaAhorro.getNumeroCuenta());
		System.out.println("Fecha de apertura: " + cuentaAhorro.getFechaApertura());
		System.out.println("Saldo: " + cuentaAhorro.getSaldo());
		System.out.println("Porcentaje de reajuste anual: " + cuentaAhorro.getReajusteAnual());
		System.out.println("Cliente: " + cuentaAhorro.getCliente().getNombre());
	}
}