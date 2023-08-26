package com.daniel.prueba.dao;

import com.daniel.prueba.dto.Request;
import com.daniel.prueba.dto.Response;

public interface IRequestRepository {

    Response convert(Request request);
}
