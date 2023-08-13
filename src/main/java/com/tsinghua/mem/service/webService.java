package com.tsinghua.mem.service;

import com.tsinghua.mem.dao.itemTableMapper;
import com.tsinghua.mem.dao.taskTableMapper;
import com.tsinghua.mem.dao.achiTableMapper;

import com.tsinghua.mem.pojo.*;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class webService {
    @Autowired
    taskTableMapper taskMapper;
    //根据achi、item、task三个表的数据，生成一个json文件，用于前端展示
    @Autowired
    itemTableMapper itemMapper;
    @Autowired
    achiTableMapper achiMapper;


    public List<taskTable> taskList() {
        return taskMapper.selectAll();
    }
    //分页查询tasktable
    public List<taskTable> taskTablesByPage(int start,int end){
        return taskMapper.selectAllByPage(start, end);
    }
    taskTableExample taskTableExample = new taskTableExample();
    itemTableExample itemTableExample = new itemTableExample();
    achiTableExample achiTableExample = new achiTableExample();


    //通过taskid 查询 tasktable
    public List<taskTable> selectByTaskid(String taskid){
        taskTableExample.createCriteria().andTaskidEqualTo(taskid);
        return taskMapper.selectByExample(taskTableExample);
    }

    //通过taskid 查询 itemtable
    public List<itemTable> selectItemByTaskid(String taskid){
        itemTableExample.createCriteria().andTaskidEqualTo(taskid);
        return itemMapper.selectByExample(itemTableExample);
    }
    //通过关联的itme查询achi
    public List<achiTable> selectAchiByItemid(String itemid){
        achiTableExample.createCriteria().andItemidEqualTo(itemid);
        return achiMapper.selectByExample(achiTableExample);
    }

    //update itemtable的 state字段
    public int updateItemState(String itemid,Integer state){
        itemTable item = new itemTable();
        item.setItemstate(state);
        itemTableExample.createCriteria().andItemidEqualTo(itemid);
        return itemMapper.updateByExampleSelective(item,itemTableExample);
    }

    //update 根据achiID写achiTable的achiValue字段接口
    public int updateAchiValue(String achiid,String achivalue){
        return achiMapper.updateByExampleSelective(achiid,achivalue);
    }

}