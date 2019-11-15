package com.ffcs.other;

import org.springframework.beans.factory.annotation.Autowired;

import com.ffcs.config.Test;
import com.ffcs.utils.SpringUtil;

public class OutValue {
	@Autowired
	private Test test;
	
	public void testOut1() {
		System.out.println("test1:"+test.getName1());
	}
	
	public void testOut2() {
		test = SpringUtil.getBean(Test.class);
		System.out.println("test1:"+test.getName1());
	}
}
