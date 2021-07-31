package com.hejun.shop.model.buyer.pojo;

import io.swagger.models.auth.In;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Category {
    private Long id;
    private String name;
    private Long parentId;
    private Integer level;
    private Integer sortOrder;
    private Double commissionRate;
    private String image;
    private Boolean supportChannel;
    private Integer status;
    private Long createTime;
    private Long updateTime;
}
