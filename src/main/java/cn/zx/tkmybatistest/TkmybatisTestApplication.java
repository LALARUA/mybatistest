package cn.zx.tkmybatistest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@MapperScan(basePackages = "cn.zx.tkmybatistest.mapper")
@SpringBootApplication
public class TkmybatisTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(TkmybatisTestApplication.class, args);
    }

}
