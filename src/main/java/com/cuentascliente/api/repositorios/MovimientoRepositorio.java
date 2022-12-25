package com.cuentascliente.api.repositorios;

import com.cuentascliente.api.entidades.MovimientosEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovimientoRepositorio extends JpaRepository<MovimientosEntity, Integer> {
}
