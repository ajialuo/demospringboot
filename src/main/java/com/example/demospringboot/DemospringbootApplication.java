package com.example.demospringboot;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.LinkedHashMap;

@SpringBootApplication
@EnableDiscoveryClient
@Controller
@RefreshScope
/*@EnableJpaRepositories("com.example.demospringboot.repository")
@EntityScan("com.example.demospringboot.domain")*/
public class DemospringbootApplication {

    @Value("${nacos.config}")
    private String hello;

    public static void main(String[] args) {
        SpringApplication.run(DemospringbootApplication.class, args);
    }

    @RequestMapping("/hi")
    public String get(Model model){
        model.addAttribute("msg","hi: "+hello);
        LinkedHashMap map = new LinkedHashMap<>();
        map.put("A","1");
        map.put("B","2");
        map.put("C","3");
        map.put("D","4");
        System.out.println(map);

        map.put("B","55");
        System.out.println(map);
        return "index";
    }

}
