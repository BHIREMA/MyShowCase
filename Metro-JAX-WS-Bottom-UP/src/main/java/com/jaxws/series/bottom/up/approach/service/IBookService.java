package com.jaxws.series.bottom.up.approach.service;

import javax.jws.WebService;

@WebService(name="IBookService")
public interface IBookService {

	public String getBookNameBasedOnISBN(String isbnNumber);
}