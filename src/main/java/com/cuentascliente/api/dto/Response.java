package com.cuentascliente.api.dto;

import java.util.Date;

public class Response {

    private Boolean respuesta;
    private String url;
    private Integer estado;
    private String mensaje;
    private Documentos documentos;
    private Date tiempoRequerido;
    private String metodo;

    public Boolean getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(Boolean respuesta) {
        this.respuesta = respuesta;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getEstado() {
        return estado;
    }

    public void setEstado(Integer estado) {
        this.estado = estado;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public Documentos getDocumentos() {
        return documentos;
    }

    public void setDocumentos(Documentos documentos) {
        this.documentos = documentos;
    }

    public Date getTiempoRequerido() {
        return tiempoRequerido;
    }

    public void setTiempoRequerido(Date tiempoRequerido) {
        this.tiempoRequerido = tiempoRequerido;
    }

    public String getMetodo() {
        return metodo;
    }

    public void setMetodo(String metodo) {
        this.metodo = metodo;
    }
}
