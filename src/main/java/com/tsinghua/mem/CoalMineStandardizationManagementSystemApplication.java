package com.tsinghua.mem;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.tsinghua.mem.dao") //需要在这指定或者在配置文件指定.xml文件路径
public class CoalMineStandardizationManagementSystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(CoalMineStandardizationManagementSystemApplication.class, args);
    }

}
