package pipe.cuentas.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import pipe.cuentas.modelo.Cuenta;

public interface CuentaRepositorio extends JpaRepository<Cuenta, Integer> {

}
