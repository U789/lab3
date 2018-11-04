package ru.mtuci.labwork2;
import org.junit.Test;
import ru.mtuci.labwork2.model.OrderedBook;
import ru.mtuci.labwork2.repository.OrderedBookRepository;
import ru.mtuci.labwork2.model.Basket;
import ru.mtuci.labwork2.repository.BasketRepository;
import ru.mtuci.labwork2.model.Book;
import ru.mtuci.labwork2.repository.BookRepository;
import ru.mtuci.labwork2.model.Client;
import ru.mtuci.labwork2.repository.ClientRepository;
import ru.mtuci.labwork2.model.Author;
import ru.mtuci.labwork2.repository.AuthorRepository;
import ru.mtuci.labwork2.model.Publisher;
import ru.mtuci.labwork2.repository.PublisherRepository;

public class TestOrderedBookRepository {
    OrderedBookRepository repository = new OrderedBookRepository();
    BasketRepository basketRepository = new BasketRepository();
    BookRepository bookRepository = new BookRepository();
    ClientRepository clientRepository = new ClientRepository();
    AuthorRepository authorRepository = new AuthorRepository();
    PublisherRepository publisherRepository = new PublisherRepository();

    @Test
    public void testCreate() throws Exception {
        Client client = new Client(null,"testClient","880055545");
        Client createdClient = clientRepository.save(client);

        Basket basket = new Basket(null);
        basket.setClient(createdClient);
        Basket basketcreated = basketRepository.save(basket);

        Author author = new Author(null, "Testov@test.com", "Test88",
                "Testovich.com", "Testovich");
        Author createdAuthor = authorRepository.save(author);

        Publisher publisher = new Publisher(null, "testPublisher",
                "testPublisher","testPublisher");
        Publisher publishercreated = publisherRepository.save(publisher);

        Book book = new Book(null,"TestOrderBook",880.50);
        book.setAuthor(createdAuthor);
        book.setPublisher(publishercreated);
        Book bookcreated = bookRepository.save(book);

        OrderedBook orderedBook = new OrderedBook(null,22);
        orderedBook.setBasket(basketcreated);
        orderedBook.setBook(bookcreated);
       OrderedBook created = repository.save(orderedBook);

        System.out.println(created);
    }
    @Test
    public void testDelete() throws Exception {
        Client client = new Client(null,"testClient","880055545");
        Client createdClient = clientRepository.save(client);

        Basket basket = new Basket(null);
        basket.setClient(createdClient);
        Basket basketcreated = basketRepository.save(basket);

        Author author = new Author(null, "Testov@test.com", "Test88",
                "Testovich.com", "Testovich");
        Author createdAuthor = authorRepository.save(author);

        Publisher publisher = new Publisher(null, "testPublisher",
                "testPublisher","testPublisher");
        Publisher publishercreated = publisherRepository.save(publisher);

        Book book = new Book(null,"TestOrderBook",880.50);
        book.setAuthor(createdAuthor);
        book.setPublisher(publishercreated);
        Book bookcreated = bookRepository.save(book);

        OrderedBook orderedBook = new OrderedBook(null,22);
        orderedBook.setBasket(basketcreated);
        orderedBook.setBook(bookcreated);
        OrderedBook created = repository.save(orderedBook);
        repository.delete(created.getId());
    }
    @Test
    public void testUpdate() {
        Client client = new Client(null,"testClient","880055545");
        Client createdClient = clientRepository.save(client);

        Basket basket = new Basket(null);
        basket.setClient(createdClient);
        Basket basketcreated = basketRepository.save(basket);

        Author author = new Author(null, "Testov@test.com", "Test88",
                "Testovich.com", "Testovich");
        Author createdAuthor = authorRepository.save(author);

        Publisher publisher = new Publisher(null, "testPublisher",
                "testPublisher","testPublisher");
        Publisher publishercreated = publisherRepository.save(publisher);

        Book book = new Book(null,"TestOrderBook",880.50);
        book.setAuthor(createdAuthor);
        book.setPublisher(publishercreated);
        Book bookcreated = bookRepository.save(book);

        OrderedBook orderedBook = new OrderedBook(null,22);
        orderedBook.setBasket(basketcreated);
        orderedBook.setBook(bookcreated);
        OrderedBook created = repository.save(orderedBook);
        System.out.println(created);
        bookcreated.setBook_title("TestUpdate");
        orderedBook.setBook(bookcreated);
        OrderedBook updated = repository.save(orderedBook);
        System.out.println(updated);
    }
    @Test
    public void testGet() throws Exception {
        Client client = new Client(null,"testClient","880055545");
        Client createdClient = clientRepository.save(client);

        Basket basket = new Basket(null);
        basket.setClient(createdClient);
        Basket basketcreated = basketRepository.save(basket);

        Author author = new Author(null, "Testov@test.com", "Test88",
                "Testovich.com", "Testovich");
        Author createdAuthor = authorRepository.save(author);

        Publisher publisher = new Publisher(null, "testPublisher",
                "testPublisher","testPublisher");
        Publisher publishercreated = publisherRepository.save(publisher);

        Book book = new Book(null,"TestOrderBook",880.50);
        book.setAuthor(createdAuthor);
        book.setPublisher(publishercreated);
        Book bookcreated = bookRepository.save(book);

        OrderedBook orderedBook = new OrderedBook(null,22);
        orderedBook.setBasket(basketcreated);
        orderedBook.setBook(bookcreated);
        OrderedBook created = repository.save(orderedBook);
        System.out.println(repository.get(created.getId()));
    }
}
