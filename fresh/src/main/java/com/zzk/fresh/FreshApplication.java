package com.zzk.fresh;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "org.sang.mybatis.mapper")
public class FreshApplication {
    public static void main(String[] args) {
        SpringApplication.run(FreshApplication.class, args);
    }
}
