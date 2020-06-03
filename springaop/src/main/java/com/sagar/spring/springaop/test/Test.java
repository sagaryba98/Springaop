package com.sagar.spring.springaop.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sagar.spring.springaop.ProductService;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/sagar/spring/springaop/test/config.xml");
		ProductService productService = (ProductService) context.getBean("productService");
		productService.multipley(4, 5);
		System.out.println(productService.multipley(4, 5));
	}

}
