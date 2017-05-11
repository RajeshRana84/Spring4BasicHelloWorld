package com.websystique.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.websystique.spring.configuration.HelloWorldConfig;
import com.websystique.spring.domain.HelloWorld;

public class AppMain {

	public static void main(String args[]) {
		
		// For Spring configuration with XML
		//AbstractApplicationContext context = new ClassPathXmlApplicationContext("helloworld-config.xml");
		
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(HelloWorldConfig.class);
		HelloWorld bean = (HelloWorld) context.getBean("helloWorldBean");
		bean.sayHello("Spring 4");
		context.close();

	}

}
