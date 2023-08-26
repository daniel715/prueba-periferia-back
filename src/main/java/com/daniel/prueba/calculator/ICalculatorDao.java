package com.daniel.prueba.calculator;

import com.daniel.prueba.dto.Request;
import com.daniel.prueba.dto.Response;
import org.springframework.data.repository.CrudRepository;

public interface ICalculatorDao extends CrudRepository<Request, Long> {

    Response convert(Request request);

}
