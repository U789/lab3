package ru.mtuci.labwork2;

import org.junit.Test;
import ru.mtuci.labwork2.model.Book;
import ru.mtuci.labwork2.repository.BookRepository;
import ru.mtuci.labwork2.model.Author;
import ru.mtuci.labwork2.repository.AuthorRepository;
import ru.mtuci.labwork2.model.Publisher;
import ru.mtuci.labwork2.repository.PublisherRepository;

public class TestBookRepository {
        BookRepository repository = new BookRepository();
        AuthorRepository authorRepository = new AuthorRepository();
        PublisherRepository publisherRepository = new PublisherRepository();
        @Test
        public void testCreate() throws Exception {
            Author author = new Author(null,"author@google.com",
                    "880-55-44","author.com","Test");
            Author createdAuthor = authorRepository.save(author);
            Publisher publisher = new Publisher(null,"880-66-44",
                    "publisher.com","TestPub");
            Publisher createdPublisher = publisherRepository.save(publisher);
            Book book = new Book(null,"Test Book",790.50);
            book.setAuthor(createdAuthor);
            book.setPublisher(createdPublisher);
           Book created = repository.save(book);
            System.out.println(created);
        }
    @Test
    public void testDelete() throws Exception {
        Author author = new Author(null,"author@google.com",
                "880-55-44","author.com","Test");
        Author createdAuthor = authorRepository.save(author);
        Publisher publisher = new Publisher(null,"880-66-44",
                "publisher.com","TestPub");
        Publisher createdPublisher = publisherRepository.save(publisher);
        Book book = new Book(null,"Test Book",790.50);
        book.setAuthor(createdAuthor);
        book.setPublisher(createdPublisher);
        Book created = repository.save(book);
        repository.delete(created.getId());
    }
    @Test
    public void testUpdate() {
        Author author = new Author(null,"author@google.com",
                "880-55-44","author.com","Test");
        Author createdAuthor = authorRepository.save(author);
        Publisher publisher = new Publisher(null,"880-66-44",
                "publisher.com","TestPub");
        Publisher createdPublisher = publisherRepository.save(publisher);
        Book book = new Book(null,"Test Book",790.50);
        book.setAuthor(createdAuthor);
        book.setPublisher(createdPublisher);
        Book created = repository.save(book);
        System.out.println(created);
        created.setBook_title("TestUpdate");
        Book updated = repository.save(book);
        System.out.println(updated);
    }
    @Test
    public void testGet() throws Exception {
        Author author = new Author(null,"author@google.com",
                "880-55-44","author.com","Test");
        Author createdAuthor = authorRepository.save(author);
        Publisher publisher = new Publisher(null,"880-66-44",
                "publisher.com","TestPub");
        Publisher createdPublisher = publisherRepository.save(publisher);
        Book book = new Book(null,"Test Book",790.50);
        book.setAuthor(createdAuthor);
        book.setPublisher(createdPublisher);
        Book created = repository.save(book);
        System.out.println(repository.get(created.getId()));
    }
}
