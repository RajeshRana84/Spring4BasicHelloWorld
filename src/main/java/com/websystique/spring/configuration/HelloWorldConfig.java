package com.websystique.spring.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Description;

import com.websystique.spring.domain.HelloWorld;
import com.websystique.spring.domain.HelloWorldImpl;

@Configuration
public class HelloWorldConfig {

	@Bean(name="helloWorldBean")
	@Description("This is a sample HelloWorld Bean")
	public HelloWorld helloWorld() {
		return new HelloWorldImpl();
	}

}


// Equivalent Spring Configuration file

//Above configuration is same as below Spring XML representaiton(let’s name it helloworld-config.xml):
//
//<beans xmlns="http://www.springframework.org/schema/beans"
//	xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
//	xsi:schemaLocation="http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans-4.0.xsd">
//
//	<bean id="helloWorldBean" class="com.websystique.spring.domain.HelloWorldImpl">
// 
//</beans>