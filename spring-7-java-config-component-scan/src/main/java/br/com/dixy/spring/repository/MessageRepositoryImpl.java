package br.com.dixy.spring.repository;

import org.springframework.stereotype.Repository;

@Repository
public class MessageRepositoryImpl implements MessageRepository {
	
	@Override
	public String getText() {
		return "Hello World!";
	}

}
