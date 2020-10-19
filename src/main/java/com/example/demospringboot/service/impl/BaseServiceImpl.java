package com.example.demospringboot.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.example.demospringboot.service.IBaseService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author jiaks
 * @version E9
 * @Package com.example.demospringboot.service.impl
 * @date 2020/10/16 11:16
 * @Copyright (c) 2001-2019 上海泛微网络科技股份有限公司
 */
@RefreshScope
@Service
public class BaseServiceImpl implements IBaseService {

    @Value("${nacos.config}")
    private String hello;

    @Override
    public List<JSONObject> getDatas() {
        List<JSONObject> res = new ArrayList<>();
        JSONObject obj = new JSONObject();
        obj.put("name",hello);
        res.add(obj);
        return res;
    }
}
