package gm.zona_fit.repositorio;

import gm.zona_fit.modelo.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
//Tipo de dato y clave de llave primaria
public interface ClienteRepositorio extends JpaRepository<Cliente, Integer> {
}
