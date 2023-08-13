package com.tsinghua.mem.web.controller;

import com.tsinghua.mem.dto.ResponseCode;
import com.tsinghua.mem.service.webService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/web")
public class webController {

    @Autowired
    webService service;
    @RequestMapping("/select/achiTable/itemid")
    @ResponseBody
    public ResponseCode selectAchiByItemid(String itemid){
        return new ResponseCode(200, "查询成功",service.selectAchiByItemid(itemid));
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
    @RequestMapping("/select/taskTableAll")
    @ResponseBody
    public ResponseCode selectAll(){
        return new ResponseCode(200, "查询成功", service.taskList());
    }
    @GetMapping(value = "/select/taskTablepage")
    @ResponseBody
    public ResponseCode taskTablesByPage(@RequestParam("start")int start, @RequestParam("end")int end){
        return new ResponseCode(200, "查询成功", service.taskTablesByPage(start, end).toString());
    }

}
