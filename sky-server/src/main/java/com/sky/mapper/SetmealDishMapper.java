package com.sky.mapper;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SetmealDishMapper {
    /**
     * 根据菜品Id查询套餐Id
     * @param dishIds
     * @return
     */
    //动态SQL
    List<Long> getSetmealIdsByDishIds(List<Long> dishIds);
}
