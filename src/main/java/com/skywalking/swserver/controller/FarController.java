package com.skywalking.swserver.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ShaoHuangxing on 2020/6/10
 */
@RestController
@RequestMapping(path = "api")
public class FarController {

    @GetMapping("/returnValue")
    public String returnValue() {
        return "success";
    }
}