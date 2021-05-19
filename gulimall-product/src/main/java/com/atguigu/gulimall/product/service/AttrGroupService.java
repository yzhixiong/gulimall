package com.atguigu.gulimall.product.service;

import com.atguigu.gulimall.product.entity.AttrGroupEntity;
import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.common.utils.PageUtils;

import java.util.Map;

/**
 * 属性分组
 *
 * @author yzx
 * @email yzx01010@163.com
 * @date 2021-05-19 13:32:27
 */
public interface AttrGroupService extends IService<AttrGroupEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

