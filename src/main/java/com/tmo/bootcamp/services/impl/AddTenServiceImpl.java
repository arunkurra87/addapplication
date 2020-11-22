package com.tmo.bootcamp.services.impl;

import com.tmo.bootcamp.model.AddApplicationResponse;
import com.tmo.bootcamp.services.AddTenService;
import com.tmo.bootcamp.exception.ApiException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;


@Service
public class AddTenServiceImpl implements AddTenService {


    @Value("${AddValueApp}")
    private int addValueApp;


    @Override
    public ResponseEntity<AddApplicationResponse> getAddTen(String numStr) {
        int numInt = 0 ;

        try {
            numInt = Integer.valueOf(numStr) ;
        }catch(NumberFormatException e){
            throw new ApiException(HttpStatus.BAD_REQUEST , "Please enter numeric values");
        }

        AddApplicationResponse addApplicationResponse = new AddApplicationResponse();
        addApplicationResponse.setSum((String.valueOf(numInt+addValueApp)));
        return new ResponseEntity<> (addApplicationResponse ,HttpStatus.OK);
    }
}


