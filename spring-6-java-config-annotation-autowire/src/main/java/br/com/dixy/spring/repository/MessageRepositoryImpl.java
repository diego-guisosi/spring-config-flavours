package br.com.dixy.spring.repository;

public class MessageRepositoryImpl implements MessageRepository {
	
	@Override
	public String getText() {
		return "Hello World!";
	}

}
