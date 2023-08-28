package com.daniel.prueba.calculator;

import com.daniel.prueba.dto.Request;
import com.daniel.prueba.dto.Response;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.Optional;

@Repository
public class Calculator implements ICalculator {

    public TasaCalculator tasas = new TasaCalculator();

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
                response.setMensajeError("Moneda Repetida");
        }
        return response;
    }

    public Response solesToDolar(Request request) {
        return getResponse(request);
    }

    public Response solesToEuro(Request request) {
        return getResponse(request);
    }

    public Response dolarToSoles(Request request) {
        return getResponse(request);
    }

    public Response dolarToEuro(Request request) {
        return getResponse(request);
    }

    public Response euroToSoles(Request request) {
        return getResponse(request);
    }

    public Response euroToDolar(Request request) {
        return getResponse(request);
    }

    private Response getResponse(Request request) {
        BigDecimal resultado = tasas.getTipoCambio(request.getMonedaOrigen(),request.getMonedaDestino()).multiply(request.getMonto());
        Response response = new Response();
        response.setMonedaDestino(request.getMonedaDestino());
        response.setMonedaOrigen(request.getMonedaOrigen());
        response.setMonto(resultado);
        response.setTipoCambio(resultado);
        response.setMontoConTipoCambio(resultado.toString() + " con tipo de cambio " + resultado);
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
