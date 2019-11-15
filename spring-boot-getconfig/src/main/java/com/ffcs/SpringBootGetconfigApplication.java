package com.ffcs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ffcs.config.Test;
import com.ffcs.other.OutValue;

@SpringBootApplication
public class SpringBootGetconfigApplication {
	

	public static void main(String[] args) {
		SpringApplication.run(SpringBootGetconfigApplication.class, args);
		
		OutValue o = new OutValue();
		//需要获取实例对象
		//o.testOut1();
		o.testOut2();
	}

}
