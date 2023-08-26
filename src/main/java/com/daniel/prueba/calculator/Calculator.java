package com.daniel.prueba.calculator;

import com.daniel.prueba.calculator.ICalculatorDao;
import com.daniel.prueba.dto.Request;
import com.daniel.prueba.dto.Response;
import com.daniel.prueba.dto.Tasas;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.Optional;

@Repository
public class Calculator implements ICalculatorDao {

    public Tasas tasas;

    @Override
    public Response convert(Request request) {
        String monedas = request.getMonedaOrigen() + request.getMonedaDestino();
        Response response = new Response();
        switch (monedas) {
            case "solesdolar":
                response = solesToDolar(request);
                break;
            case "soleseuro":
                response = solesToEuro(request);
                break;
            case "dolarsoles":
                response = dolarToSoles(request);
                break;
            case "dolareuro":
                response = dolarToEuro(request);
                break;
            case "eurosoles":
                response = euroToSoles(request);
                break;
            case "eurodolar":
                response = euroToDolar(request);
                break;
            default:
                response.setMensajeError("No se acepta esa moneda,escoger soles, dolar o euro");
        }
        return response;
    }

    public Response solesToDolar(Request request) {
        BigDecimal resultado = tasas.solesdolar.multiply(request.getMonto());
        Response response = new Response();
        response.setMonedaDestino(request.getMonedaDestino());
        response.setMonedaOrigen(request.getMonedaOrigen());
        response.setMonto(resultado);
        response.setTipoCambio(tasas.solesdolar);
        response.setMontoConTipoCambio(resultado.toString() + " con tipo de cambio " + tasas.solesdolar);
        return response;
    }

    public Response solesToEuro(Request request) {
        BigDecimal resultado = tasas.soleseuro.multiply(request.getMonto());
        Response response = new Response();
        response.setMonedaDestino(request.getMonedaDestino());
        response.setMonedaOrigen(request.getMonedaOrigen());
        response.setMonto(resultado);
        response.setTipoCambio(tasas.soleseuro);
        response.setMontoConTipoCambio(resultado.toString() + " con tipo de cambio " + tasas.soleseuro);
        return response;
    }

    public Response dolarToSoles(Request request) {
        BigDecimal resultado = tasas.dolarsoles.multiply(request.getMonto());
        Response response = new Response();
        response.setMonedaDestino(request.getMonedaDestino());
        response.setMonedaOrigen(request.getMonedaOrigen());
        response.setMonto(resultado);
        response.setTipoCambio(tasas.dolarsoles);
        response.setMontoConTipoCambio(resultado.toString() + " con tipo de cambio " + tasas.dolarsoles);
        return response;
    }

    public Response dolarToEuro(Request request) {
        BigDecimal resultado = tasas.dolareuro.multiply(request.getMonto());
        Response response = new Response();
        response.setMonedaDestino(request.getMonedaDestino());
        response.setMonedaOrigen(request.getMonedaOrigen());
        response.setMonto(resultado);
        response.setTipoCambio(tasas.dolareuro);
        response.setMontoConTipoCambio(resultado.toString() + " con tipo de cambio " + tasas.dolareuro);
        return response;
    }

    public Response euroToSoles(Request request) {
        BigDecimal resultado = tasas.eurosoles.multiply(request.getMonto());
        Response response = new Response();
        response.setMonedaDestino(request.getMonedaDestino());
        response.setMonedaOrigen(request.getMonedaOrigen());
        response.setMonto(resultado);
        response.setTipoCambio(tasas.eurosoles);
        response.setMontoConTipoCambio(resultado.toString() + " con tipo de cambio " + tasas.eurosoles);
        return response;
    }

    public Response euroToDolar(Request request) {
        BigDecimal resultado = tasas.eurodolar.multiply(request.getMonto());
        Response response = new Response();
        response.setMonedaDestino(request.getMonedaDestino());
        response.setMonedaOrigen(request.getMonedaOrigen());
        response.setMonto(resultado);
        response.setTipoCambio(tasas.eurodolar);
        response.setMontoConTipoCambio(resultado.toString() + " con tipo de cambio " + tasas.eurodolar);
        return response;
    }

    @Override
    public <S extends Request> S save(S entity) {
        return null;
    }

    @Override
    public <S extends Request> Iterable<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<Request> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public Iterable<Request> findAll() {
        return null;
    }

    @Override
    public Iterable<Request> findAllById(Iterable<Long> longs) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public void delete(Request entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends Request> entities) {

    }

    @Override
    public void deleteAll() {

    }
}
