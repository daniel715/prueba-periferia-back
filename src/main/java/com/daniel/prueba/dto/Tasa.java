package com.daniel.prueba.dto;

import jakarta.persistence.*;

import java.math.BigDecimal;
@Entity
@Table(name = "Tasa")
public class Tasa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    private String monedaorigen;
    private String monedadestino;
    private BigDecimal tasa;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMonedaOrigen() {
        return monedaorigen;
    }

    public void setMonedaOrigen(String monedaOrigen) {
        this.monedaorigen = monedaOrigen;
    }

    public String getMonedaDestino() {
        return monedadestino;
    }

    public void setMonedaDestino(String monedaDestino) {
        this.monedadestino = monedaDestino;
    }

    public BigDecimal getTasa() {
        return tasa;
    }

    public void setTasa(BigDecimal tasa) {
        this.tasa = tasa;
    }
}
