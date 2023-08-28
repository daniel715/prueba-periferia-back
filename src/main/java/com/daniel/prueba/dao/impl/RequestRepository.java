package com.daniel.prueba.dao.impl;

import com.daniel.prueba.calculator.Calculator;
import com.daniel.prueba.calculator.ICalculator;
import com.daniel.prueba.dao.IRequestRepository;
import com.daniel.prueba.dto.Request;
import com.daniel.prueba.dto.Response;
import org.springframework.stereotype.Repository;

@Repository
public class RequestRepository implements IRequestRepository {


    private ICalculator taskDao = new Calculator();


    @Override
    public Response convert(Request request) {
        return taskDao.convert(request);
    }
}
