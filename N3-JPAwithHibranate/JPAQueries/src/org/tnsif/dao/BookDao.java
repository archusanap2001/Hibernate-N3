package org.tnsif.dao;

import java.util.List;

import org.tnsif.entites.Book;




public interface BookDao 
{
	public abstract Book getBookById(int id);
	public abstract List<Book>getBookByTitle(String title);
	public abstract List<Book>getAuthorBooks(String author);
	public abstract List<Book>getBookInPriceRange(double low,double high);
	public abstract List<Book>getAllBooks();
	public abstract Long getBookCount();
	

}
