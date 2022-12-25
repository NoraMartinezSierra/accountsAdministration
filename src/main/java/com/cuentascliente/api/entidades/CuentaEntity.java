package com.cuentascliente.api.entidades;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.util.Objects;

@Entity
@Table(name = "cuenta", schema = "public", catalog = "cuentasbanco")
public class CuentaEntity {
    private int cuentaid;
    private String numerocuenta;
    private String tipocuenta;
    private BigDecimal saldoinicial;
    private Boolean estado;
    private Integer clienteId;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cuentaid")
    public int getCuentaid() {
        return cuentaid;
    }

    public void setCuentaid(int cuentaid) {
        this.cuentaid = cuentaid;
    }

    @Basic
    @Column(name = "numerocuenta")
    public String getNumerocuenta() {
        return numerocuenta;
    }

    public void setNumerocuenta(String numerocuenta) {
        this.numerocuenta = numerocuenta;
    }

    @Basic
    @Column(name = "tipocuenta")
    public String getTipocuenta() {
        return tipocuenta;
    }

    public void setTipocuenta(String tipocuenta) {
        this.tipocuenta = tipocuenta;
    }

    @Basic
    @Column(name = "saldoinicial")
    public BigDecimal getSaldoinicial() {
        return saldoinicial;
    }

    public void setSaldoinicial(BigDecimal saldoinicial) {
        this.saldoinicial = saldoinicial;
    }

    @Basic
    @Column(name = "estado")
    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    @Basic
    @Column(name = "clienteid")
    public Integer getClienteId() {
        return clienteId;
    }

    public void setClienteId(Integer clienteId) {
        this.clienteId = clienteId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CuentaEntity that = (CuentaEntity) o;
        return cuentaid == that.cuentaid &&
                Objects.equals(numerocuenta, that.numerocuenta) &&
                Objects.equals(tipocuenta, that.tipocuenta) &&
                Objects.equals(saldoinicial, that.saldoinicial) &&
                Objects.equals(estado, that.estado) &&
                Objects.equals(clienteId, that.clienteId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cuentaid, numerocuenta, tipocuenta, saldoinicial, estado, clienteId);
    }
}
