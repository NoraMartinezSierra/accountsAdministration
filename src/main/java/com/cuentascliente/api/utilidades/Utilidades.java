package com.cuentascliente.api.utilidades;

import com.cuentascliente.api.dto.Documentos;
import com.cuentascliente.api.dto.Response;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class Utilidades {

    /**
     * Metodo el cual hace las respuestas estandar para metodos put o patch o post o get
     *
     * @Autor: Nora Ayde Martinez
     **/
    public Response estandarResponse(Integer status, String message, String method, Object obj) {
        Response res = new Response();
        res.setEstado(status);
        res.setMensaje(message);
        res.setMetodo(method);
        res.setRespuesta(true);
        res.setTiempoRequerido(new Date());
        Documentos documents = new Documentos();
        documents.setDatos(obj);
        res.setDocumentos(documents);
        return res;
    }
}
