package com.example.demospringboot.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.example.demospringboot.domain.EsbProductSetting;
import com.example.demospringboot.repository.ProductRepository;
import com.example.demospringboot.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author jiaks
 * @version E9
 * @Package com.example.demospringboot.service.impl
 * @date 2020/10/16 18:22
 *
 */
@Service
public class ProductServiceImpl implements IProductService {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public List<EsbProductSetting> findAll() {
        return productRepository.findAll();
    }

}
