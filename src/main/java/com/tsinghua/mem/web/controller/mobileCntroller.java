package com.tsinghua.mem.web.controller;

import com.tsinghua.mem.dto.ResponseCode;
import com.tsinghua.mem.service.webService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/mobile")
public class mobileCntroller {

    @Autowired
    webService service;
    @RequestMapping(value = "/update/itemTable/state", method = RequestMethod.POST)
    @ResponseBody
    public ResponseCode updateitemTableState(String itemid,Integer state){
        int result = service.updateItemState(itemid, state);
        if (result == 1)
            return new ResponseCode(200, "success",null);
        else
            return new ResponseCode(500, "fail",null);
    }

    @RequestMapping("/select/achiTable/itemid")
    @ResponseBody
    public ResponseCode selectAchiByItemid(String itemid){
        return new ResponseCode(200, "查询成功", service.selectAchiByItemid(itemid));
    }

    @RequestMapping("/select/itemTable/taskid")
    @ResponseBody
    public ResponseCode selectItemByTaskid(String taskid){
        return new ResponseCode(200, "查询成功",service.selectItemByTaskid(taskid));
    }
    @RequestMapping("/select/taskTable/taskid")
    @ResponseBody
    public ResponseCode selectByTaskid(String taskid){
        return new ResponseCode(200, "查询成功",service.selectByTaskid(taskid));
    }
    @RequestMapping("/select/taskTable")
    @ResponseBody
    public String taskList(){
        return service.taskList().toString();
    }
    @GetMapping(value = "/select/taskTablepage")
    @ResponseBody
    public ResponseCode taskTablesByPage(@RequestParam("start")int start, @RequestParam("end")int end){
        return new ResponseCode(200, "查询成功", service.taskTablesByPage(start, end).toString());
    }
    @RequestMapping("/select/taskTableAll")
    @ResponseBody
    public ResponseCode selectAll(){
        return new ResponseCode(200, "查询成功", service.taskList());
    }

    @RequestMapping(value = "/update/achiTableValue", method = RequestMethod.POST)
    @ResponseBody
    public ResponseCode updateAchiValue(String achiid,String achivalue){
        int result = service.updateAchiValue(achiid, achivalue);
        if (result == 1)
            return new ResponseCode(200, "更新成功", null);
        else
            return new ResponseCode(500, "更新失败，请检查数据", null);
    }
}
