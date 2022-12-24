package com.cuentascliente.api.entidades;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "persona", schema = "public", catalog = "cuentasbanco")
public class PersonaEntity {
    private int personaid;
    private String nombre;
    private String genero;
    private Integer edad;
    private String identificacion;
    private String direccion;
    private String telefono;

    @Id
    @Column(name = "personaid")
    public int getPersonaid() {
        return personaid;
    }

    public void setPersonaid(int personaid) {
        this.personaid = personaid;
    }

    @Basic
    @Column(name = "nombre")
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Basic
    @Column(name = "genero")
    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Basic
    @Column(name = "edad")
    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    @Basic
    @Column(name = "identificacion")
    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    @Basic
    @Column(name = "direccion")
    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Basic
    @Column(name = "telefono")
    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PersonaEntity that = (PersonaEntity) o;
        return personaid == that.personaid &&
                Objects.equals(nombre, that.nombre) &&
                Objects.equals(genero, that.genero) &&
                Objects.equals(edad, that.edad) &&
                Objects.equals(identificacion, that.identificacion) &&
                Objects.equals(direccion, that.direccion) &&
                Objects.equals(telefono, that.telefono);
    }

    @Override
    public int hashCode() {
        return Objects.hash(personaid, nombre, genero, edad, identificacion, direccion, telefono);
    }
}
