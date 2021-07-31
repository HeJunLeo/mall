package com.hejun.shop.buyer.controller.goods;

import com.hejun.common.voa.Result;
import com.hejun.shop.buyer.service.goods.GoodsCategoryService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
//  /buyer/category/get/parentId}
@RestController
@RequestMapping("category")
@Api(tags = "买家端-商品分类")
public class GoodsCateGoryController {
    @Autowired
    private GoodsCategoryService goodsCategoryService;


    @ApiOperation(value = "获取商品分类列表")
    @ApiImplicitParam(name = "parentId",value = "上级分类ID,全部分类为：0",required = true,dataType ="Long",paramType ="path")
    @GetMapping(value = "/get/{parentId}")
    public Result list(@PathVariable Long parentId){
        //业务逻辑 交过service去处理
        return goodsCategoryService.listAllChildren(parentId);
    }



}
