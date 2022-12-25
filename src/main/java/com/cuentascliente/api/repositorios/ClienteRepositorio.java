package com.cuentascliente.api.repositorios;

import com.cuentascliente.api.entidades.ClienteEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepositorio extends JpaRepository<ClienteEntity, Integer> {
}
