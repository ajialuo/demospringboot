package com.example.demospringboot.config;

import com.example.demospringboot.custom.ApiRequestMappingHandlerMapping;
import org.springframework.boot.autoconfigure.web.servlet.WebMvcRegistrations;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;

/**
 * @author jiaks
 * @version E9
 * @Package com.example.demospringboot.config
 * @date 2021/2/18 15:32
 *
 */
@Configuration
public class WebMvcRegistrationsConfig implements WebMvcRegistrations {
    @Override
    public RequestMappingHandlerMapping getRequestMappingHandlerMapping() {
        return new ApiRequestMappingHandlerMapping();
    }
}
