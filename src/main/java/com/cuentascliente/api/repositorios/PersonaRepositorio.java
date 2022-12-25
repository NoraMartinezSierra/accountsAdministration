package com.cuentascliente.api.repositorios;

import com.cuentascliente.api.entidades.PersonaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepositorio extends JpaRepository<PersonaEntity, Integer> {


}
