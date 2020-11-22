package com.tmo.bootcamp.services.impl;

import com.tmo.bootcamp.exception.ApiException;
import com.tmo.bootcamp.model.AddApplicationResponse;
import com.tmo.bootcamp.services.AdderAppService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;


@Service
public class AdderAppServiceImpl implements AdderAppService {


    @Override
    public ResponseEntity<AddApplicationResponse> addNum(String num1Str , String num2Str) {
        int num1Int = 0 ;
        int num2Int = 0 ;
        try {
            num1Int = Integer.valueOf(num1Str) ;
            num2Int = Integer.valueOf(num2Str) ;
        }catch(NumberFormatException e){
           throw new ApiException(HttpStatus.BAD_REQUEST , "Please enter numeric values");
        }

        AddApplicationResponse addApplicationResponse = new AddApplicationResponse();
        addApplicationResponse.setSum((String.valueOf(num1Int+num2Int)));
        return new ResponseEntity<>(addApplicationResponse, HttpStatus.OK);
    }
}
