package com.cuentascliente.api.dto;

public class ClienteDto extends PersonaDto {

    private int clienteid;
    private String contrasena;
    private Boolean estadoCliente;

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

    public Boolean getEstadoCliente() {
        return estadoCliente;
    }

    public void setEstadoCliente(Boolean estadoCliente) {
        this.estadoCliente = estadoCliente;
    }

    @Override
    public String toString() {
        return "ClienteDto{" +
                "clienteid=" + clienteid +
                ", contrasena='" + contrasena + '\'' +
                ", estadoCliente=" + estadoCliente +
                '}';
    }
}
