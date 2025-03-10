package pipe.cuentas.servicio;

import pipe.cuentas.modelo.Cuenta;

import java.util.List;

public interface ICuentaServicio {
    public List<Cuenta> listarCuentas();

    public void guardarCuenta(Cuenta cuenta);

    public Cuenta buscarCuentaPorId(Integer idCuenta);

    public void eliminarCuenta(Cuenta cuenta);
}
