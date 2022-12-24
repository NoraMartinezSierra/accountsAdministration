package com.accountsAdministration.api.servicios;

import com.accountsAdministration.api.dto.ClienteDto;
import com.accountsAdministration.api.dto.Response;
import org.springframework.stereotype.Service;

@Service
public class ClienteServicio {

    public Response crearCliente(ClienteDto clienteDto){
        return new Response();
    }

}
