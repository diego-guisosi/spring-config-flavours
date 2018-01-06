package br.com.dixy.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import br.com.dixy.spring.service.MessagePrinter;

public class SpringApp {
	
	public static void main(String[] args) {
		try(ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml")){
			MessagePrinter messagePrinter = applicationContext.getBean(MessagePrinter.class);
			messagePrinter.print();
		}
	}

}
