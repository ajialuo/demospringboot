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
 *
 */

@Repository
public interface ProductRepository extends JpaRepository<EsbProductSetting,Long> {
    //List<EsbProductSetting> findAll();
}
