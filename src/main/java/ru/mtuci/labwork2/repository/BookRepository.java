package ru.mtuci.labwork2.repository;
import ru.mtuci.labwork2.model.Book;

public class BookRepository extends AbstractRepository<Book> {
    public BookRepository() {super(Book.class);}
}
