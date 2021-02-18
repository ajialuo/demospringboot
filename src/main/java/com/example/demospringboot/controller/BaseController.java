package com.example.demospringboot.controller;

import com.alibaba.fastjson.JSONObject;
import com.example.demospringboot.service.IBaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author jiaks
 * @version E9
 * @Package com.example.demospringboot.controller
 * @date 2020/10/16 11:06
 *
 */
@RestController
@RequestMapping("/api/base")
public class BaseController {

    @Autowired
    IBaseService baseService;

    @GetMapping("/getDatas")
    public List<JSONObject> getDatas() {

        return baseService.getDatas();
    }
}
