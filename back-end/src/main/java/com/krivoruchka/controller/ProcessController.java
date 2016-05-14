package com.krivoruchka.controller;

import org.omg.CORBA.Object;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created on 30.04.2016.
 */
@RestController
@RequestMapping("/api/process")
public class ProcessController {

    @RequestMapping("/file")
    @ResponseBody
    public Object processDocument() {
        return null;
    }
}
