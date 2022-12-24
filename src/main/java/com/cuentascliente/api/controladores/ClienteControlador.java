package com.cuentascliente.api.controladores;

import com.cuentascliente.api.dto.ClienteDto;
import com.cuentascliente.api.dto.PersonaDto;
import com.cuentascliente.api.dto.Response;
import com.cuentascliente.api.servicios.ClienteServicio;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/clientes")
public class ClienteControlador {

    private ClienteServicio clienteServicio;

    @Autowired
    public void setClienteServicio(ClienteServicio clienteServicio) {
        this.clienteServicio = clienteServicio;
    }

    @ApiOperation(value = "Queries a list of spending Categories",
            response = PersonaDto.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK"),
            @ApiResponse(code = 400, message = "Bad Request")
    })
    @PostMapping(
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Response> getSpendingCategories(
            @RequestBody() ClienteDto clienteDto) {
        Response response = clienteServicio.crearCliente(clienteDto);
        return ResponseEntity.ok(response);
    }
}
