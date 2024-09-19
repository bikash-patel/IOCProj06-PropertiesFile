package com.bikash.ClientTest;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.bikash.config.EmpConfig;
import com.bikash.sbeans.Properties;

public class ClientTest {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext acac=new AnnotationConfigApplicationContext(EmpConfig.class);
		Properties prop=acac.getBean("prop",Properties.class);
		System.out.println(prop);
		acac.close();
	}
}
