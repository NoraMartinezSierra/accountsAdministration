package com.cuentascliente.api.servicios;

import com.cuentascliente.api.dto.ClienteCuentaDto;
import com.cuentascliente.api.dto.CuentaDto;
import com.cuentascliente.api.dto.Response;
import com.cuentascliente.api.entidades.ClienteEntity;
import com.cuentascliente.api.entidades.PersonaEntity;
import com.cuentascliente.api.excepciones.ExcepcionGeneral;
import com.cuentascliente.api.repositorios.ClienteRepositorio;
import com.cuentascliente.api.repositorios.CuentaRepositorio;
import com.cuentascliente.api.repositorios.PersonaRepositorio;
import com.cuentascliente.api.utilidades.Utilidades;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

@Service
public class ClienteServicio {

    private static final Logger LOGGER = LoggerFactory.getLogger(ClienteServicio.class);


    private PersonaRepositorio personaRepositorio;
    private ClienteRepositorio clienteRepositorio;
    private Utilidades utilidades;
    private CuentaServicio cuentaServicio;

    @Autowired
    public void setPersonaRepositorio(PersonaRepositorio personaRepositorio) {
        this.personaRepositorio = personaRepositorio;
    }

    @Autowired
    public void setClienteRepositorio(ClienteRepositorio clienteRepositorio) {
        this.clienteRepositorio = clienteRepositorio;
    }

    @Autowired
    public void setUtilidades(Utilidades utilidades) {
        this.utilidades = utilidades;
    }

    @Autowired
    public void setCuentaServicio(CuentaServicio cuentaServicio) {
        this.cuentaServicio = cuentaServicio;
    }

    public Response crearClienteCuenta(ClienteCuentaDto clienteCuentaDto) {
        Response response;
        try {
            LOGGER.info("Informacion del cliente : {}", clienteCuentaDto);

            crearPersona(clienteCuentaDto);
            validarCliente(clienteCuentaDto);

            response = utilidades.estandarResponse(200, "Post success", "POST", clienteCuentaDto);
        } catch (Exception e) {
            response = utilidades.estandarResponse(500, "Post failed", "POST", null);
            LOGGER.error("Fallo la creacion de clienteCuenta : {}", e.getMessage());

        }

        return response;
    }

    private void crearPersona(ClienteCuentaDto clienteCuentaDto) {
        if (null == clienteCuentaDto.getPersonaDto()) {
            throw new ExcepcionGeneral("Los datos de la persona estan vacios.", HttpStatus.BAD_REQUEST.value());
        }
        PersonaEntity personaEntity = new PersonaEntity();
        personaEntity.setNombre(clienteCuentaDto.getPersonaDto().getNombre());
        personaEntity.setDireccion(clienteCuentaDto.getPersonaDto().getDireccion());
        personaEntity.setEdad(clienteCuentaDto.getPersonaDto().getEdad());
        personaEntity.setGenero(clienteCuentaDto.getPersonaDto().getGenero());
        personaEntity.setIdentificacion(clienteCuentaDto.getPersonaDto().getIdentificacion());
        personaEntity.setTelefono(clienteCuentaDto.getPersonaDto().getTelefono());
        personaRepositorio.save(personaEntity);
    }

    private void validarCliente(ClienteCuentaDto clienteCuentaDto) {
        if (null == clienteCuentaDto.getClienteDto()) {
            LOGGER.info("El cliente esta vacio");
        } else {
            crearCliente(clienteCuentaDto);
        }
    }

    private void crearCliente(ClienteCuentaDto clienteCuentaDto){
        ClienteEntity clienteEntity = new ClienteEntity();
        clienteEntity.setContrasena(clienteCuentaDto.getClienteDto().getContrasena());
        clienteEntity.setEstado(clienteCuentaDto.getClienteDto().getEstadoCliente());
        clienteRepositorio.save(clienteEntity);
        clienteCuentaDto.getCuentaDto().setClienteId(clienteEntity.getClienteid());
        crearCuenta(clienteCuentaDto.getCuentaDto());
    }

    private void crearCuenta(CuentaDto cuentaDto) {
        if (null == cuentaDto) {
            LOGGER.info("La cuenta esta vacia");
        } else {
            cuentaServicio.crearCuenta(cuentaDto);
        }
    }
}
