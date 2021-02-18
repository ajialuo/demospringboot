package com.example.demospringboot.service;

import com.alibaba.fastjson.JSONObject;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author jiaks
 * @version E9
 * @Package com.example.demospringboot.service
 * @date 2020/10/16 11:13
 *
 */
public interface IBaseService {
    List<JSONObject> getDatas();
}
