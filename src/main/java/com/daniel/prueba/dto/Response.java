package com.daniel.prueba.dto;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name="Request")
public class Response {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private String id;
    private BigDecimal monto;
    private String montoConTipoCambio;
    private String monedaOrigen;
    private String monedaDestino;
    private BigDecimal tipoCambio;

    private String mensajeError;

    public String getMensajeError() {
        return mensajeError;
    }

    public void setMensajeError(String mensajeError) {
        this.mensajeError = mensajeError;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public BigDecimal getMonto() {
        return monto;
    }

    public void setMonto(BigDecimal monto) {
        this.monto = monto;
    }

    public String getMontoConTipoCambio() {
        return montoConTipoCambio;
    }

    public void setMontoConTipoCambio(String montoConTipoCambio) {
        this.montoConTipoCambio = montoConTipoCambio;
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

    public BigDecimal getTipoCambio() {
        return tipoCambio;
    }

    public void setTipoCambio(BigDecimal tipoCambio) {
        this.tipoCambio = tipoCambio;
    }
}
