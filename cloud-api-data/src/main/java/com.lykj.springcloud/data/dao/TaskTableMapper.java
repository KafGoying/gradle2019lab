package com.lykj.springcloud.data.dao;

import com.lykj.springcloud.data.entities.TaskTable;

public interface TaskTableMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TaskTable record);

    int insertSelective(TaskTable record);

    TaskTable selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TaskTable record);

    int updateByPrimaryKey(TaskTable record);
}