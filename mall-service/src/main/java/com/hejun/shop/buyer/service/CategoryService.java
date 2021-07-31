package com.hejun.shop.buyer.service;

import com.hejun.shop.model.buyer.vo.CategoryVO;

import java.util.List;

public interface CategoryService {
    /**
     * 根据父id获取对应的商品分类列表
     *
     */

    List<CategoryVO> findCategoryTree(Long parentId);

}
