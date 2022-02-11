package com.lykj.springcloud.data.dao;

import com.lykj.springcloud.data.entities.WorkFlowTable;

public interface WorkFlowTableMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(WorkFlowTable record);

    int insertSelective(WorkFlowTable record);

    WorkFlowTable selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(WorkFlowTable record);

    int updateByPrimaryKey(WorkFlowTable record);
}