package com.tsinghua.mem.dao;

import com.tsinghua.mem.pojo.achiTable;
import com.tsinghua.mem.pojo.achiTableExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
public interface achiTableMapper {
    long countByExample(achiTableExample example);

    int deleteByExample(achiTableExample example);

    int insert(achiTable record);

    int insertSelective(achiTable record);

    List<achiTable> selectByExample(achiTableExample example);

    int updateByExampleSelective(@Param("achiid") String achiid, @Param("achivalue") String achivalue);

    int updateByExample(@Param("record") achiTable record, @Param("example") achiTableExample example);
}