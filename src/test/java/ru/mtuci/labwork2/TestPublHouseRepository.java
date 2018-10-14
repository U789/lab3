package ru.mtuci.labwork2;

import org.junit.Test;
import ru.mtuci.labwork2.model.Author;
import ru.mtuci.labwork2.model.PublHouse;
import ru.mtuci.labwork2.repository.AuthorRepository;
import ru.mtuci.labwork2.repository.PublHouseRepository;

public class TestPublHouseRepository {
    PublHouseRepository repository = new PublHouseRepository();
    @Test
    public void testCreate() throws Exception {
        PublHouse publHouse = new PublHouse(null, "testPublHouse");
        PublHouse created = repository.save(publHouse);
        System.out.println(created);
    }
    @Test
    public void testDelete() throws Exception
    {
        PublHouse publHouse = new PublHouse(null,"testPublHouse");
        PublHouse created = repository.save(publHouse);
        repository.delete(created.getId());
    }
    @Test
    public void testUpdate()
    {
        PublHouse publHouse = new PublHouse(null,"testPublHouse");
        PublHouse created = repository.save(publHouse);
        created.setName("TestUpdate");
        PublHouse updated = repository.save(publHouse);
        System.out.println(updated);
    }
    @Test
    public void testGet() throws Exception {
        PublHouse publHouse = new PublHouse(null,"testPublHouse");
        PublHouse created = repository.save(publHouse);
        System.out.println(repository.get(created.getId()));
    }
}
