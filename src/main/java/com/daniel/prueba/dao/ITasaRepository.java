package com.daniel.prueba.dao;

import com.daniel.prueba.dto.Tasa;

import java.math.BigDecimal;
import java.sql.SQLException;
import java.util.List;

public interface ITasaRepository {
    Tasa update(Tasa tasa) throws SQLException;

    List<Tasa> getAll();

    BigDecimal getTasa(String monedaEntrada, String monedaDestino);
}
