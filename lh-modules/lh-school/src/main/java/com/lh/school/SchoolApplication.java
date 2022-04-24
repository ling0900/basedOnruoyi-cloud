package com.lh.school;

import com.ruoyi.common.security.annotation.EnableRyFeignClients;
import com.ruoyi.common.security.annotation.EnableSchoolConfig;
import com.ruoyi.common.swagger.annotation.EnableCustomSwagger2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 系统模块
 * 
 * @author ruoyi
 */
@EnableSchoolConfig
@EnableCustomSwagger2
@EnableRyFeignClients
@SpringBootApplication
public class SchoolApplication
{
    public static void main(String[] args)
    {
        SpringApplication.run(SchoolApplication.class, args);

        System.out.println("^_^school^_^模块启动成功");
    }
}
