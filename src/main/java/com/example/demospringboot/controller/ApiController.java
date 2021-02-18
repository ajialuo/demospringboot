package com.example.demospringboot.controller;

import com.example.demospringboot.annotation.ApiVersion;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author jiaks
 * @version E9
 * @Package com.example.demospringboot.controller
 * @date 2021/2/18 15:44
 *
 */
@Controller
@RequestMapping("/api/{version}")
public class ApiController {
    @GetMapping("/fun")
    @ResponseBody
    public String fun1() {
        return "fun 1";
    }
    @ApiVersion(5)
    @GetMapping("/fun")
    @ResponseBody
    public String fun2() {
        return "fun 2";
    }
    @ApiVersion(9)
    @GetMapping("/fun")
    @ResponseBody
    public String fun3() {
        return "fun 5";
    }
}
