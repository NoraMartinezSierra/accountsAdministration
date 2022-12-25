package com.cuentascliente.api.dto;


public class ClienteCuentaDto {

    private ClienteDto clienteDto;
    private PersonaDto personaDto;
    private CuentaDto cuentaDto;

    public ClienteDto getClienteDto() {
        return clienteDto;
    }

    public void setClienteDto(ClienteDto clienteDto) {
        this.clienteDto = clienteDto;
    }

    public PersonaDto getPersonaDto() {
        return personaDto;
    }

    public void setPersonaDto(PersonaDto personaDto) {
        this.personaDto = personaDto;
    }

    public CuentaDto getCuentaDto() {
        return cuentaDto;
    }

    public void setCuentaDto(CuentaDto cuentaDto) {
        this.cuentaDto = cuentaDto;
    }

    @Override
    public String toString() {
        return "ClienteCuentaDto{" +
                "clienteDto=" + clienteDto +
                ", personaDto=" + personaDto +
                ", cuentaDto=" + cuentaDto +
                '}';
    }
}
