package com.example.moduleapiserver;

import com.example.modulecore.util.DateUtil;
import com.example.modulecore.util.StringUtil;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ModuleApiServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ModuleApiServerApplication.class, args);
		StringUtil.test();

		System.out.println(DateUtil.now());
	}

}
