package com.greenkode.soap.ws;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface BookServer {

	@WebMethod
	public abstract List<Book> getAllBooks();

}