package com.tmo.bootcamp.services;

import com.tmo.bootcamp.model.AddApplicationResponse;
import org.springframework.http.ResponseEntity;

public interface AddTenService {
    public ResponseEntity<AddApplicationResponse> getAddTen(String numStr);
}
