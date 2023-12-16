package com.dolsoft.licensing_service.web.repository;

import com.dolsoft.licensing_service.support.jpa.CustomJpaRepository;
import com.dolsoft.licensing_service.web.entity.Author;
import com.dolsoft.licensing_service.web.entity.Book;
import com.dolsoft.licensing_service.web.entity.BookAuthor;

/**
 * <b>BookAuthor Repository</b><br>
 * You can use NamedQuery or Query annotation here.<br>
 * 
 * 
 * @author Wenbo Wang (jackie-1685@163.com)
 */
public interface BookAuthorRepository extends CustomJpaRepository<BookAuthor, Long> {

	public BookAuthor findByBookAndAuthor(Book book, Author author);

	public void deleteByAuthor(Author author);

	public void deleteByBook(Book book);
}
