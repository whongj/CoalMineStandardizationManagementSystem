package com.tsinghua.mem.dao;

import com.tsinghua.mem.pojo.itemTable;
import com.tsinghua.mem.pojo.itemTableExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
public interface itemTableMapper {
    long countByExample(itemTableExample example);

    int deleteByExample(itemTableExample example);

    int insert(itemTable record);

    int insertSelective(itemTable record);

    List<itemTable> selectByExample(itemTableExample example);

    int updateByExampleSelective(@Param("record") itemTable record, @Param("example") itemTableExample example);

    int updateByExample(@Param("record") itemTable record, @Param("example") itemTableExample example);
}