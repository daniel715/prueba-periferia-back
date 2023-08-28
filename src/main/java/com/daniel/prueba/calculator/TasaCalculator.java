package com.daniel.prueba.calculator;

import com.daniel.prueba.dao.ITasaRepository;
import com.daniel.prueba.dao.impl.TasaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;


@Repository
class TasaCalculator {

    ITasaRepository tasasRepository = new TasaRepository();

    public BigDecimal getTipoCambio(String monedaOrigen, String monedaDestino) {
        BigDecimal tasa = tasasRepository.getTasa(monedaOrigen,monedaDestino);
        return  tasa;
    }
}
