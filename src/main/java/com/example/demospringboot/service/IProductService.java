package com.example.demospringboot.service;

import com.example.demospringboot.domain.EsbProductSetting;

import java.util.List;

/**
 * @author jiaks
 * @version E9
 * @Package com.example.demospringboot.service
 * @date 2020/10/16 18:18
 *
 */
public interface IProductService {
    List<EsbProductSetting> findAll();
}
