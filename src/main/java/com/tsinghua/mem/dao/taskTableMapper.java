package com.tsinghua.mem.dao;

import com.tsinghua.mem.pojo.TaskPage;
import com.tsinghua.mem.pojo.taskTable;
import com.tsinghua.mem.pojo.taskTableExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
public interface taskTableMapper {
    long countByExample(taskTableExample example);

    int deleteByExample(taskTableExample example);

    int insert(taskTable record);

    int insertSelective(taskTable record);

    List<taskTable> selectByExample(taskTableExample example);

    int updateByExampleSelective(@Param("record") taskTable record, @Param("example") taskTableExample example);

    int updateByExample(@Param("record") taskTable record, @Param("example") taskTableExample example);

    //查询所有tasktable
    List<taskTable> selectAll();

    //分页查询tasktable
    List<taskTable> selectAllByPage(int start,int end);


    List<TaskPage> selectTaskPage();

}