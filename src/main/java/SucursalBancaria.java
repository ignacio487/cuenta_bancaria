import java.util.Vector;

public class SucursalBancaria {
	private String codigoSucursal;
	private String codigoPostal;
	private Vector<CuentaBancaria> cuentaBancaria = new Vector<CuentaBancaria>();
	public GestionBanco unnamed_GestionBanco_;

	public String getCodigoSucursal() {
		return this.codigoSucursal;
	}

	public void setCodigoSucursal(String codigoSucursal) {
		this.codigoSucursal = codigoSucursal;
	}

	public String getCodigoPostal() {
		return this.codigoPostal;
	}

	public void setCodigoPostal(String codigoPostal) {
		this.codigoPostal = codigoPostal;
	}

	public SucursalBancaria(String codigoSucursal, String codigoPostal) {
		super();
	}
}