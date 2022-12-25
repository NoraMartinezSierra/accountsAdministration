package com.cuentascliente.api.servicios;

import com.cuentascliente.api.dto.CuentaDto;
import com.cuentascliente.api.dto.Response;
import com.cuentascliente.api.entidades.CuentaEntity;
import com.cuentascliente.api.repositorios.CuentaRepositorio;
import com.cuentascliente.api.utilidades.Utilidades;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CuentaServicio {

    private CuentaRepositorio cuentaRepositorio;
    private Utilidades utilidades;

    @Autowired
    public void setCuentaRepositorio(CuentaRepositorio cuentaRepositorio) {
        this.cuentaRepositorio = cuentaRepositorio;
    }

    @Autowired
    public void setUtilidades(Utilidades utilidades) {
        this.utilidades = utilidades;
    }

    public Response crearCuenta(CuentaDto cuentaDto) {
        CuentaEntity cuentaEntity = new CuentaEntity();
        cuentaEntity.setNumerocuenta(cuentaDto.getNumeroCuenta());
        cuentaEntity.setTipocuenta(cuentaDto.getTipoCuenta());
        cuentaEntity.setEstado(cuentaDto.getEstadoCuenta());
        cuentaEntity.setClienteId(cuentaDto.getClienteId());
        cuentaEntity.setSaldoinicial(cuentaDto.getSaldoInicial());
        cuentaRepositorio.save(cuentaEntity);
        Response response = utilidades.estandarResponse(200, "Post success", "GET", null);
        return response;
    }

    public Response consultarCuenta(Integer clienteId, String numeroCuenta) {

        Response response;
        if (numeroCuenta.equals("")) {
            List<CuentaEntity> cuentaEntityList = cuentaRepositorio.findByClienteId(clienteId);
            response = utilidades.estandarResponse(200, "Post success", "GET", cuentaEntityList);
        } else {
            Optional<CuentaEntity> cuentaEntity = cuentaRepositorio.findByClienteIdAndNumerocuenta(clienteId, numeroCuenta);
            if (cuentaEntity.isPresent()) {
                response = utilidades.estandarResponse(200, "Post success", "GET", cuentaEntity);
            } else {
                response = utilidades.estandarResponse(200, "Post success", "GET", null);
            }
        }

        return response;
    }

}
