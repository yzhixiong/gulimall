package com.atguigu.gulimall.product.dao;

import com.atguigu.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author yzx
 * @email yzx01010@163.com
 * @date 2021-05-19 13:32:27
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
