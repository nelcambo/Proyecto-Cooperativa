package com.Coop.Proyecto.Cooperativa.entidades;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table
public class Creditos {
    @Id
    private int codigo;
    @Column(name = "Monto_Prestado", nullable = false)
    private int montoPrestamo;
    @Column(name = "Plazo_Prestado", nullable = false)
    private int plazoPrestamo;
    @Column(name = "Fecha_Desembolso", nullable = false)
    private Date fechaDesembolso;
    @ManyToOne
        @JoinColumn(name="documento_cliente")
        Cliente cli;

    @ManyToOne
    @JoinColumn(name="codigo_linea")
    LineasDeCredito lc;

    public Creditos(int codigo, int montoPrestamo, int plazoPrestamo, Date fechaDesembolso, Cliente cli, LineasDeCredito lc) {
        this.codigo = codigo;
        this.montoPrestamo = montoPrestamo;
        this.plazoPrestamo = plazoPrestamo;
        this.fechaDesembolso = fechaDesembolso;
        this.cli = cli;
        this.lc = lc;
    }

    public Creditos() {
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getMontoPrestamo() {
        return montoPrestamo;
    }

    public void setMontoPrestamo(int montoPrestamo) {
        this.montoPrestamo = montoPrestamo;
    }

    public int getPlazoPrestamo() {
        return plazoPrestamo;
    }

    public void setPlazoPrestamo(int plazoPrestamo) {
        this.plazoPrestamo = plazoPrestamo;
    }

    public Date getFechaDesembolso() {
        return fechaDesembolso;
    }

    public void setFechaDesembolso(Date fechaDesembolso) {
        this.fechaDesembolso = fechaDesembolso;
    }

    public Cliente getCli() {
        return cli;
    }

    public void setCli(Cliente cli) {
        this.cli = cli;
    }

    public LineasDeCredito getLc() {
        return lc;
    }

    public void setLc(LineasDeCredito lc) {
        this.lc = lc;
    }
}
