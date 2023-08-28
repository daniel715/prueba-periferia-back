package com.daniel.prueba.controller;

import com.daniel.prueba.dao.ITasaRepository;
import com.daniel.prueba.dao.impl.TasaRepository;
import com.daniel.prueba.dto.Tasa;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;

@RestController
@RequestMapping(path = "converter/", produces = "application/json")
@CrossOrigin(origins = "*")
public class TasaController {

    private ITasaRepository requestRepository;


    public TasaController(TasaRepository iRequestRepository) {
        this.requestRepository = iRequestRepository;
    }


    @PatchMapping(path = "/updateTasa", consumes = "application/json")
    public Tasa updateTasa(@RequestBody Tasa tasa) {
        try {
            return requestRepository.update(tasa);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
