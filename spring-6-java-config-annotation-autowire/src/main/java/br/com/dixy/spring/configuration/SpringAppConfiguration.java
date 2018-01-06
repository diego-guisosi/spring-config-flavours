package br.com.dixy.spring.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import br.com.dixy.spring.repository.MessageRepository;
import br.com.dixy.spring.repository.MessageRepositoryImpl;
import br.com.dixy.spring.service.MessagePrinter;
import br.com.dixy.spring.service.MessagePrinterImpl;

@Configuration
public class SpringAppConfiguration {
	
	@Bean
	public MessageRepository messageRepository() {
		return new MessageRepositoryImpl();
	}
	
	@Bean
	public MessagePrinter messagePrinter() {
		return new MessagePrinterImpl();
	}
	
}
