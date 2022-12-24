package com.cuentascliente.api.entidades;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "cuenta", schema = "public", catalog = "cuentasbanco")
public class CuentaEntity {
    private int cuentaid;
    private String numerocuenta;
    private String tipocuenta;
    private String saldoinicial;
    private Boolean estado;

    @Id
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
    public String getSaldoinicial() {
        return saldoinicial;
    }

    public void setSaldoinicial(String saldoinicial) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CuentaEntity that = (CuentaEntity) o;
        return cuentaid == that.cuentaid &&
                Objects.equals(numerocuenta, that.numerocuenta) &&
                Objects.equals(tipocuenta, that.tipocuenta) &&
                Objects.equals(saldoinicial, that.saldoinicial) &&
                Objects.equals(estado, that.estado);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cuentaid, numerocuenta, tipocuenta, saldoinicial, estado);
    }
}
