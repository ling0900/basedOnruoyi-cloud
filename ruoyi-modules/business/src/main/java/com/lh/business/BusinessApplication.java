package com.lh.business;

import com.alibaba.cloud.sentinel.SentinelWebAutoConfiguration;
import com.ruoyi.common.swagger.annotation.EnableCustomSwagger2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * business服务
 *
 * @author lh
 */
@EnableCustomSwagger2
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class,
        SentinelWebAutoConfiguration.class})
public class BusinessApplication
{
    public static void main(String[] args)
    {
        SpringApplication.run(BusinessApplication.class, args);
        System.out.println(
                "(♥◠‿◠)ﾉﾞ  文件服务模块启动成功   ლ(´ڡ`ლ)ﾞ  \n" +
                " ||                ||         ||         \n" +
                " ||                ||         ||         \n" +
                " ||                ||         ||         \n" +
                " ||                |||||||||||||         \n" +
                " ||                ||         ||         \n" +
                " ||                ||         ||         \n" +
                " |||||||||         ||         ||         \n");
    }
}
