package com.ffcs;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.ffcs.utils.SpringUtil;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootGetconfigApplicationTests {
	@Autowired
	private com.ffcs.config.Test test;
	
	@Test
	public void contextLoads() {
		System.out.println(test.getName1());
		//无法自动注入需要自己获取对象
		test = SpringUtil.getBean(com.ffcs.config.Test.class);
		System.out.println(test.getName1());
	}

}
