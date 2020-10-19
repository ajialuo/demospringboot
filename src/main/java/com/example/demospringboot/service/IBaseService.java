package com.example.demospringboot.service;

import com.alibaba.fastjson.JSONObject;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author jiaks
 * @version E9
 * @Package com.example.demospringboot.service
 * @date 2020/10/16 11:13
 * @Copyright (c) 2001-2019 上海泛微网络科技股份有限公司
 */
public interface IBaseService {
    List<JSONObject> getDatas();
}
