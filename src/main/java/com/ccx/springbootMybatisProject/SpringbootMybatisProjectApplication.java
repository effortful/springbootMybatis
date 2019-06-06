package com.ccx.springbootMybatisProject;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.ccx.springbootMybatisProject.mapper.")
public class SpringbootMybatisProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootMybatisProjectApplication.class, args);
	}

}
