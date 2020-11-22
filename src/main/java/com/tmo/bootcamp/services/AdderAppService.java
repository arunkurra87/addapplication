package com.tmo.bootcamp.services;

import com.tmo.bootcamp.model.AddApplicationResponse;
import org.springframework.http.ResponseEntity;

public interface AdderAppService {
    public ResponseEntity<AddApplicationResponse>addNum(String num1Str , String num2Str) ;
}
