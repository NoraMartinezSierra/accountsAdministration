package com.cuentascliente.api.servicios;

import com.cuentascliente.api.dto.ClienteDto;
import com.cuentascliente.api.dto.Response;
import org.springframework.stereotype.Service;

@Service
public class ClienteServicio {

    public Response crearCliente(ClienteDto clienteDto){
        return new Response();
    }

}
