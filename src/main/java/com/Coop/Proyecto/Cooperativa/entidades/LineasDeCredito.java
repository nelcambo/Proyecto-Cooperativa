package com.Coop.Proyecto.Cooperativa.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Lineas_de_Credito")
public class LineasDeCredito {
    @Id
    private int codigo;
    @Column(nullable = false, length = 30, unique = true)
    private String nombre;
    @Column(name = "Monto_Maximo")
    private int montoMaximo;
    @Column(name = "Plazo_Maximo")
    private int plazoMaximo;

    public LineasDeCredito(int codigo, String nombre, int montoMaximo, int plazoMaximo) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.montoMaximo = montoMaximo;
        this.plazoMaximo = plazoMaximo;
    }

    public LineasDeCredito() {
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getMontoMaximo() {
        return montoMaximo;
    }

    public void setMontoMaximo(int montoMaximo) {
        this.montoMaximo = montoMaximo;
    }

    public int getPlazoMaximo() {
        return plazoMaximo;
    }

    public void setPlazoMaximo(int plazoMaximo) {
        this.plazoMaximo = plazoMaximo;
    }
}
