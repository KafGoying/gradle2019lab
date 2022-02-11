package com.lykj.springcloud.data.dao;

import com.lykj.springcloud.data.entities.WorkFlowTemple;

public interface WorkFlowTempleMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(WorkFlowTemple record);

    int insertSelective(WorkFlowTemple record);

    WorkFlowTemple selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(WorkFlowTemple record);

    int updateByPrimaryKey(WorkFlowTemple record);
}