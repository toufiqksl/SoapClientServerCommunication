package com.greenkode.soap.client;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import com.greenkode.soap.ws.Book;
import com.greenkode.soap.ws.BookServer;

public class BookClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			URL url = new URL("http://toufiq:8080/SoapServer/BookServerImplService?wsdl");
			QName qname = new QName("http://ws.soap.greenkode.com/","BookServerImplService");
			Service service = Service.create(url, qname);
			
			BookServer eif = service.getPort(BookServer.class);
			
			List<Book> list = eif.getAllBooks();
			for(Book book : list){
				System.out.println("----------------------");
				System.out.println("Author : " + book.getAuthor());
				System.out.println("Name : " + book.getName());
			}
			System.out.println("**********************************************");
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
