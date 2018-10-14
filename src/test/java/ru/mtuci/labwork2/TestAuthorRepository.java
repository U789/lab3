package ru.mtuci.labwork2;

import org.junit.Test;
import ru.mtuci.labwork2.model.Author;
import ru.mtuci.labwork2.model.PublHouse;
import ru.mtuci.labwork2.repository.AuthorRepository;
import ru.mtuci.labwork2.repository.PublHouseRepository;

public class TestAuthorRepository {

    AuthorRepository repository = new AuthorRepository();
    PublHouseRepository publHouseRepository = new PublHouseRepository();
    @Test
    public void testCreate() throws Exception {
        PublHouse publHouse = new PublHouse(null,"testPublHouse");
        PublHouse createdPublHouse = publHouseRepository.save(publHouse);

        Author author = new Author(null, "Testov", "Test", "Testovich");
        author.setPublhouse(createdPublHouse);
        Author created = repository.save(author);
        System.out.println(created);
    }
    @Test
    public void testDelete() throws Exception
    {
        PublHouse publHouse = new PublHouse(null,"testPublHouse");
        PublHouse createdPublHouse = publHouseRepository.save(publHouse);

        Author author = new Author(null, "Testov", "Test", "Testovich");
        author.setPublhouse(createdPublHouse);
        Author created = repository.save(author);
        repository.delete(created.getId());
    }
    @Test
    public void testUpdate()
    {
        PublHouse publHouse = new PublHouse(null,"testPublHouse");
        PublHouse createdPublHouse = publHouseRepository.save(publHouse);

        Author author = new Author(null, "Testov", "Test", "Testovich");
        author.setPublhouse(createdPublHouse);
        Author created = repository.save(author);
        created.setFirstname("TestUpdate");
        Author updated = repository.save(author);
        System.out.println(updated);
    }
    @Test
    public void testGet() throws Exception {
        PublHouse publHouse = new PublHouse(null,"testPublHouse");
        PublHouse createdPublHouse = publHouseRepository.save(publHouse);

        Author author = new Author(null, "Testov", "Test", "Testovich");
        author.setPublhouse(createdPublHouse);
        Author created = repository.save(author);
        System.out.println(repository.get(created.getId()));
    }
}
