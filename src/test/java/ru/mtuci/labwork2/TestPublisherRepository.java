package ru.mtuci.labwork2;

import org.junit.Test;
import ru.mtuci.labwork2.model.Publisher;
import ru.mtuci.labwork2.repository.PublisherRepository;

public class TestPublisherRepository {
    PublisherRepository repository = new PublisherRepository();
    @Test
    public void testCreate() throws Exception {
        Publisher publisher = new Publisher(null, "testPublisher",
                "testPublisher","testPublisher");
        Publisher created = repository.save(publisher);
        System.out.println(created);
    }
    @Test
    public void testDelete() throws Exception {
        Publisher publisher = new Publisher(null, "testPublisher",
                "testPublisher","testPublisher");
        Publisher created = repository.save(publisher);
        repository.delete(created.getId());
    }
    @Test
    public void testUpdate() {
        Publisher publisher = new Publisher(null, "testPublisher",
                "testPublisher","testPublisher");
        Publisher created = repository.save(publisher);
        System.out.println(created);
        created.setName("TestUpdate");
        Publisher updated = repository.save(publisher);
        System.out.println(updated);
    }
    @Test
    public void testGet() throws Exception {
        Publisher publisher = new Publisher(null, "testPublisher",
                "testPublisher","testPublisher");
        Publisher created = repository.save(publisher);
        System.out.println(repository.get(created.getId()));
    }
}
