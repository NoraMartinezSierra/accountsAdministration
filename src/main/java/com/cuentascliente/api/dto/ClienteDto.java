package com.cuentascliente.api.dto;

public class ClienteDto extends PersonaDto {

    private int clienteid;
    private String contrasena;
    private Boolean estado;

    public int getClienteid() {
        return clienteid;
    }

    public void setClienteid(int clienteid) {
        this.clienteid = clienteid;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }
}
