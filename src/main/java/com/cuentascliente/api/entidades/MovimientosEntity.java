package com.cuentascliente.api.entidades;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "movimientos", schema = "public", catalog = "cuentasbanco")
public class MovimientosEntity {
    private int movimientoid;
    private Timestamp fecha;
    private BigDecimal valor;
    private String descripcion;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "movimientoid")
    public int getMovimientoid() {
        return movimientoid;
    }

    public void setMovimientoid(int movimientoid) {
        this.movimientoid = movimientoid;
    }

    @Basic
    @Column(name = "fecha")
    public Timestamp getFecha() {
        return fecha;
    }

    public void setFecha(Timestamp fecha) {
        this.fecha = fecha;
    }

    @Basic
    @Column(name = "valor")
    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    @Basic
    @Column(name = "descripcion")
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MovimientosEntity that = (MovimientosEntity) o;
        return movimientoid == that.movimientoid &&
                Objects.equals(fecha, that.fecha) &&
                Objects.equals(valor, that.valor) &&
                Objects.equals(descripcion, that.descripcion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(movimientoid, fecha, valor, descripcion);
    }
}
