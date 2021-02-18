package com.example.demospringboot.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author jiaks
 * @version E9
 * @Package com.example.demospringboot.domain
 * @date 2020/10/16 17:55
 *
 */

@Entity(name = "esb_product_setting")
@Data //自动添加setter和getter方法，依赖lombok
public class EsbProductSetting {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String productCode;
    private String productName;
    private String organization;
    private String company;
    private String productStatus;
    private String createDate;
    private String createTime;
    private String modifyDate;
    private String modifyTime;

}
