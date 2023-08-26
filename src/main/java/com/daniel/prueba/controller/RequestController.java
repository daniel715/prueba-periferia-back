package com.daniel.prueba.controller;

import com.daniel.prueba.dao.IRequestRepository;
import com.daniel.prueba.dto.Request;
import com.daniel.prueba.dto.Response;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "converter", produces = "application/json")
@CrossOrigin(origins = "*")
public class RequestController {

    private IRequestRepository requestRepository;


    public RequestController(IRequestRepository iRequestRepository) {
        this.requestRepository = iRequestRepository;
    }


    @PostMapping(path = "/convert", consumes = "application/json")
    @ResponseStatus(HttpStatus.CREATED)
    public Response convert(@RequestBody Request request) {
        if (request != null) return requestRepository.convert(request);
        else return null;
    }
}
