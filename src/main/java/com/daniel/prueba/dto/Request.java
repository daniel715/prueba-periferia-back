package com.daniel.prueba.dto;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name="Request")
public class Request {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private String id;
    private BigDecimal monto;
    private String monedaOrigen;
    private String monedaDestino;

    public BigDecimal getMonto() {
        return monto;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setMonto(BigDecimal monto) {
        this.monto = monto;
    }

    public String getMonedaOrigen() {
        return monedaOrigen;
    }

    public void setMonedaOrigen(String monedaOrigen) {
        this.monedaOrigen = monedaOrigen;
    }

    public String getMonedaDestino() {
        return monedaDestino;
    }

    public void setMonedaDestino(String monedaDestino) {
        this.monedaDestino = monedaDestino;
    }
}
