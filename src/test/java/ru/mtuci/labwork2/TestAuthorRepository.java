package ru.mtuci.labwork2;

import org.junit.Test;
import ru.mtuci.labwork2.model.Author;
import ru.mtuci.labwork2.repository.AuthorRepository;


public class TestAuthorRepository {

    AuthorRepository repository = new AuthorRepository();

    @Test
    public void testCreate() throws Exception {
        Author author = new Author(null, "Testov@test.com", "Test88",
                "Testovich.com", "Testovich");
        Author created = repository.save(author);
        System.out.println(created);
    }

    @Test
    public void testDelete() throws Exception {
        Author author = new Author(null, "Testov@test.com", "Test88",
                "Testovich.com", "Testovich");
        Author created = repository.save(author);
        repository.delete(created.getId());
    }
    @Test
    public void testUpdate() {
        Author author = new Author(null, "Testov@test.com", "Test88",
                "Testovich.com", "Testovich");
        Author created = repository.save(author);
        System.out.println(created);
        created.setName("TestUpdate");
        Author updated = repository.save(author);
        System.out.println(updated);
    }
    @Test
    public void testGet() throws Exception {
        Author author = new Author(null, "Testov@test.com", "Test88",
                "Testovich.com", "Testovich");
        Author created = repository.save(author);
        System.out.println(repository.get(created.getId()));
    }

}
