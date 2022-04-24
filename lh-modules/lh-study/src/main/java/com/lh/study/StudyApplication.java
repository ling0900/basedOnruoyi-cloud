package com.lh.study;

import com.ruoyi.common.security.annotation.EnableRyFeignClients;
import com.ruoyi.common.security.annotation.EnableSchoolConfig;
import com.ruoyi.common.swagger.annotation.EnableCustomSwagger2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 学习模块
 * 
 * @author ruoyi
 */
@EnableSchoolConfig
@EnableCustomSwagger2
@EnableRyFeignClients
@SpringBootApplication
public class StudyApplication
{
    public static void main(String[] args)
    {
        SpringApplication.run(StudyApplication.class, args);

        System.out.println("^_^ study 学习 ^_^模块启动成功");
    }
}
