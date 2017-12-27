package com.jaxws.series.bottom.up.approach.service;

import javax.jws.WebService;

//need to configure the projects

@WebService(serviceName="BookService", endpointInterface="com.jaxws.series.bottom.up.approach.service.IBookService", portName="BookServicePort")
public class BookServiceImpl implements IBookService {

	public String getBookNameBasedOnISBN(String isbnNumber) {

		if(isbnNumber.equalsIgnoreCase("ISBN-2134")){
			return "Microbiology";
		}
		return "Invalid_ISBN_Number";
	}
}