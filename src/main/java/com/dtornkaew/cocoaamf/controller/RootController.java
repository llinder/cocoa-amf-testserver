package com.dtornkaew.cocoaamf.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.dtornkaew.cocoaamf.business.Service;
import com.dtornkaew.cocoaamf.domain.Complex;
import com.dtornkaew.cocoaamf.domain.Simple;

@Controller
@RequestMapping(value="/*")
public class RootController
{
    @Autowired
    private Service service;
    
    @RequestMapping(value="/simple", method=RequestMethod.GET)
    public Simple simple()
    {
        return service.getSimple();
    }
    
    @RequestMapping(value="/complex", method=RequestMethod.GET)
    public Complex complex()
    {
        return service.getComplex();
    }
}
