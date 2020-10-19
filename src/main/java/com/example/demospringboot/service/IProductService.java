package com.example.demospringboot.service;

import com.example.demospringboot.domain.EsbProductSetting;

import java.util.List;

/**
 * @author jiaks
 * @version E9
 * @Package com.example.demospringboot.service
 * @date 2020/10/16 18:18
 * @Copyright (c) 2001-2019 上海泛微网络科技股份有限公司
 */
public interface IProductService {
    List<EsbProductSetting> findAll();
}
