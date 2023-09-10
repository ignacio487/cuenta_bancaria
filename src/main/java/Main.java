import java.util.ArrayList;
import java.util.Vector;

public class Main {
        private ArrayList<CuentaBancaria> listaDeClientes;
        private ArrayList<CuentaBancaria> listaDeCuentasBancarias;
        private ArrayList<SucursalBancaria> listaDeSucursalesBancarias;
        public SucursalBancaria unnamed_SucursalBancaria_;

        public void agregarCllientes(CuentaBancaria cliente) {
            listaDeClientes.add(cliente);
        }

        public void agregarCuentaBancaria(CuentaBancaria cuentaBancaria, Cliente cliente) {
            listaDeCuentasBancarias.add(cuentaBancaria);
            listaDeClientes.add(cuentaBancaria);
        }

        public void agregarSucursalBancaria(SucursalBancaria sucursalBancaria) {
            listaDeSucursalesBancarias.add(sucursalBancaria);
        }

        public Vector<CuentaBancaria> verCuentasCliente(Cliente cliente) {
            return cliente.getCuentaBancaria();
        }

        public ArrayList<CuentaAhorro> obtenerCuentasDeAhorro(SucursalBancaria sucursalBancaria) {
            ArrayList<CuentaAhorro> cuentasAhorroSucursal = new ArrayList<>();
            for (CuentaBancaria cuenta : listaDeCuentasBancarias) {
                if (cuenta instanceof CuentaAhorro && sucursalBancaria.equals(((CuentaAhorro) cuenta).getSucursalBancaria())) {
                    cuentasAhorroSucursal.add((CuentaAhorro) cuenta);
                }
            }
            return cuentasAhorroSucursal;

        }

        public ArrayList<CuentaCorriente> obtenerCuentasCorrientes(SucursalBancaria sucursalBancaria) {
            ArrayList<CuentaCorriente> cuentasCorrienteSucursal = new ArrayList<>();
            for (CuentaBancaria cuenta : listaDeCuentasBancarias) {
                if (cuenta instanceof CuentaCorriente && sucursalBancaria.equals(((CuentaCorriente) cuenta).getSucursalBancaria())) {
                    cuentasCorrienteSucursal.add((CuentaCorriente) cuenta);
                }
            }
            return cuentasCorrienteSucursal;

        }
    }
}