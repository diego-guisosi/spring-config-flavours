package br.com.dixy.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import br.com.dixy.spring.configuration.SpringAppConfiguration;
import br.com.dixy.spring.service.MessagePrinter;

public class SpringApp {
	
	public static void main(String[] args) {
		try(AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringAppConfiguration.class)){
			MessagePrinter messagePrinter = applicationContext.getBean(MessagePrinter.class);
			messagePrinter.print();
		}
	}

}
