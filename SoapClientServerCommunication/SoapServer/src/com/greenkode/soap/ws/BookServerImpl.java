package com.greenkode.soap.ws;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import com.greenkode.soap.ws.DBConnection;

import java.sql.ResultSet;
import java.sql.SQLException;
import javax.jws.WebService;

@WebService(endpointInterface = "com.greenkode.soap.ws.BookServer")
public class BookServerImpl implements BookServer {
	
	//create Cache
	private List<Book> cache = Collections.synchronizedList(new ArrayList<Book>());
	
	public BookServerImpl(){
		//add Books to the Cache
		cache.add(new Book("George RR Martin","A Game of Thrones"));
		cache.add(new Book("George RR Martin","A Clash of Kings"));
		cache.add(new Book("George RR Martin","A Storm of Swords"));
		cache.add(new Book("George RR Martin","A feast for Crows"));
		cache.add(new Book("George RR Martin","A Dance with Dragons"));
		cache.add(new Book("George RR Martin","The Winds of Winter"));
		cache.add(new Book("George RR Martin","A Dream of Spring"));
		
		cache.add(new Book("Matthew Reilly", "Ice Station"));
		cache.add(new Book("Matthew Reilly", "Area 7"));
		cache.add(new Book("Matthew Reilly", "Scarecrow"));
		cache.add(new Book("Matthew Reilly", "Hell Island"));
	}
	

	/* (non-Javadoc)
	 * @see com.greenkode.soap.ws.BookServer#getAllBooks()
	 */
	@Override
	public List<Book> getAllBooks(){
		return cache;
	}
}
