package com.tsinghua.mem.web.controller;

import com.tsinghua.mem.dto.ResponseCode;
import com.tsinghua.mem.service.FileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/api/oss/file")
public class FileApiController {
    @Autowired
    private FileService fileService;

    @PostMapping("fileUpload")
    public ResponseCode fileUpload(MultipartFile file){
        //获取上传文件(返回的为文件存储的路径)
        String url = fileService.fileUpload(file);
        return new ResponseCode(200,"上传成功",url);
    }

}
