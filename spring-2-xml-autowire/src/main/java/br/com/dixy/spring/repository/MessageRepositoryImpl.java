package br.com.dixy.spring.repository;

public class MessageRepositoryImpl implements MessageRepository {
	
	private String text;

	@Override
	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
	
}
