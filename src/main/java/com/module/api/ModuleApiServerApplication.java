package com.module.api;

import com.module.core.util.DateUtil;
import com.module.core.util.StringUtil;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ModuleApiServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ModuleApiServerApplication.class, args);
		StringUtil.getSHA256("asdsad");
		System.out.println(DateUtil.now());
	}

}
