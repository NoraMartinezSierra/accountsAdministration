package com.cuentascliente.api.controladores;

import com.cuentascliente.api.dto.ClienteCuentaDto;
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


    /*
     * Autor: Nora Ayde Martinez Sierra
     * fecha: 24/12/22
     * Recibe un json y guarda la persona, el cliente y la cuenta
     * */
    @ApiOperation(value = "Queries a list of spending Categories",
            response = Response.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK"),
            @ApiResponse(code = 400, message = "Bad Request")
    })
    @PostMapping(
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Response> getSpendingCategories(
            @RequestBody() ClienteCuentaDto clienteCuentaDto) {
        Response response = clienteServicio.crearClienteCuenta(clienteCuentaDto);
        return ResponseEntity.ok(response);
    }

}
