package com.example.demospringboot.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.example.demospringboot.domain.EsbProductSetting;
import com.example.demospringboot.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author jiaks
 * @version E9
 * @Package com.example.demospringboot.controller
 * @date 2020/10/16 18:30
 *
 */
@Controller
@RequestMapping("/api/product")
public class ProductController {
    @Autowired
    private IProductService productService;

    @GetMapping("/findProducts")
    @ResponseBody
    public List<EsbProductSetting> findAll(){
        //查询所有的用户
        List<EsbProductSetting> userList = productService.findAll();
        return userList;
    }

    @GetMapping("/findProductsStr")
    public String findProductsStr(Model model){
        //查询所有的用户
        List<EsbProductSetting> userList = productService.findAll();
        model.addAttribute("msg",JSONArray.parseArray(JSON.toJSONString(userList)).toJSONString());
        return "index";
    }
}
