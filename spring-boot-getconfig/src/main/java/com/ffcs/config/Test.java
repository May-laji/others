package com.ffcs.config;

import java.util.jar.Attributes.Name;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Component
@Data
@ConfigurationProperties(prefix = "test")
@PropertySource("classpath:config.yml")
public class Test {
	
	@Value("${name}")
	private  String name1;
	
	
}
