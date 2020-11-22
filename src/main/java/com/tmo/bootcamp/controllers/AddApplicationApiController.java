package com.tmo.bootcamp.controllers;

import com.tmo.bootcamp.services.AddTenService;
import com.tmo.bootcamp.services.AdderAppService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class AddApplicationApiController {

    @Autowired
    AddTenService addTenService;

    @Autowired
    AdderAppService adderAppService;

    @RequestMapping(value = "/{num}", produces = { "application/json" }, method = RequestMethod.GET)
    public ResponseEntity<?> getAddTen(@PathVariable String num) {
        return addTenService.getAddTen(num);
    }

    @RequestMapping(value = "/{num1}/{num2}", produces = { "application/json" }, method = RequestMethod.GET)
    public ResponseEntity<?> addNumbers(@PathVariable String num1 , @PathVariable String num2) {
        return adderAppService.addNum(num1 ,num2) ;
    }
}
