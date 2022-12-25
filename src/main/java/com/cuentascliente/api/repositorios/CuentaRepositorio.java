package com.cuentascliente.api.repositorios;

import com.cuentascliente.api.entidades.CuentaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CuentaRepositorio extends JpaRepository<CuentaEntity, Integer> {

    Optional<CuentaEntity> findByClienteIdAndNumerocuenta(Integer clienteId, String numeroCuenta);

    List<CuentaEntity> findByClienteId(Integer clienteId);
}
