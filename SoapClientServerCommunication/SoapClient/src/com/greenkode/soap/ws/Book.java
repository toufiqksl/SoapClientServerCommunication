package com.greenkode.soap.ws;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Book {
	private String author;
	private String name;
	
	public Book(){
		
	}
	
	public Book(String author, String name){
		this.author = author;
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
