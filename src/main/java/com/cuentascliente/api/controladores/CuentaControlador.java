package com.cuentascliente.api.controladores;

import com.cuentascliente.api.dto.CuentaDto;
import com.cuentascliente.api.dto.Response;
import com.cuentascliente.api.servicios.CuentaServicio;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cuentas")
public class CuentaControlador {

    private CuentaServicio cuentaServicio;

    @Autowired
    public void setCuentaServicio(CuentaServicio cuentaServicio) {
        this.cuentaServicio = cuentaServicio;
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
            @RequestBody() CuentaDto cuentaDto) {
        Response response = cuentaServicio.crearCuenta(cuentaDto);
        return ResponseEntity.ok(response);
    }

    /*
     * Autor: Nora Ayde Martinez Sierra
     * fecha: 24/12/22
     * Recibe un clienteId y un número de cuenta y devuelve una cuenta o una lista de cuentas
     * */
    @ApiOperation(value = "Queries a list of spending Categories",
            response = Response.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK"),
            @ApiResponse(code = 400, message = "Bad Request")
    })
    @GetMapping(
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Response> getcuenta(
            @RequestParam(required = false, defaultValue = "") String numeroCuenta,
            @RequestParam("clienteId") Integer clienteId) {
        Response response = cuentaServicio.consultarCuenta(clienteId, numeroCuenta);
        return ResponseEntity.ok(response);
    }

}
