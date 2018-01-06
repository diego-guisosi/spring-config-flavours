package br.com.dixy.spring.service;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.dixy.spring.repository.MessageRepository;

public class MessagePrinterImpl implements MessagePrinter {
	
	@Autowired
	private MessageRepository messageRepository;
	
	/* (non-Javadoc)
	 * @see br.com.dixy.spring.service.MessagePrinter#print(br.com.dixy.spring.service.Message)
	 */
	@Override
	public void print() {
		System.out.println(messageRepository.getText());
	}

}
