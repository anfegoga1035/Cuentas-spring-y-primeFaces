package pipe.cuentas.servicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pipe.cuentas.modelo.Cuenta;
import pipe.cuentas.repositorio.CuentaRepositorio;

import java.util.List;

@Service
public class CuentaServicio implements ICuentaServicio {

    @Autowired
    private CuentaRepositorio cuentaRepositorio;

    @Override
    public List<Cuenta> listarCuentas() {
        return cuentaRepositorio.findAll();
    }

    @Override
    public void guardarCuenta(Cuenta cuenta) {
        cuentaRepositorio.save(cuenta);

    }

    @Override
    public Cuenta buscarCuentaPorId(Integer idCuenta) {
        Cuenta cuenta = cuentaRepositorio.findById(idCuenta).orElse(null);
        return cuenta;
    }

    @Override
    public void eliminarCuenta(Cuenta cuenta) {
        cuentaRepositorio.delete(cuenta);

    }
}
