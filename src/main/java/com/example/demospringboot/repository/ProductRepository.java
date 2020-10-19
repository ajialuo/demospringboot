package com.example.demospringboot.repository;

import com.example.demospringboot.domain.EsbProductSetting;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author jiaks
 * @version E9
 * @Package com.example.demospringboot.repository
 * @date 2020/10/16 18:24
 * @Copyright (c) 2001-2019 上海泛微网络科技股份有限公司
 */

@Repository
public interface ProductRepository extends JpaRepository<EsbProductSetting,Long> {
    //List<EsbProductSetting> findAll();
}
