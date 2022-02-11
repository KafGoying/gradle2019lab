package com.lykj.springcloud.data.dao;

import com.lykj.springcloud.data.entities.TaskTemple;

public interface TaskTempleMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TaskTemple record);

    int insertSelective(TaskTemple record);

    TaskTemple selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TaskTemple record);

    int updateByPrimaryKey(TaskTemple record);
}