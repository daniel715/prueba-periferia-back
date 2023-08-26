package com.daniel.prueba.controller;

import com.daniel.prueba.dao.ITasasRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "converter/", produces = "application/json")
@CrossOrigin(origins = "*")
public class TasasController {

    private ITasasRepository requestRepository;


    public TasasController(ITasasRepository iRequestRepository) {
        this.requestRepository = iRequestRepository;
    }


}
