package ru.mtuci.labwork2;

import org.junit.Test;
import ru.mtuci.labwork2.model.Client;
import ru.mtuci.labwork2.repository.ClientRepository;

public class TestClientRepository {
    ClientRepository repository = new ClientRepository();

    @Test
    public void testCreate() throws Exception {
        Client client = new Client(null, "TestClient", "880055545");
        Client created = repository.save(client);
        System.out.println(created);
    }
    @Test
    public void testDelete() throws Exception {
        Client client = new Client(null, "TestClient", "880055545");
        Client created = repository.save(client);
        repository.delete(created.getId());
    }
    @Test
    public void testUpdate() {
        Client client = new Client(null, "TestClient", "880055545");
        Client created = repository.save(client);
        System.out.println(created);
        created.setName("TestUpdate");
        Client updated = repository.save(client);
        System.out.println(updated);
    }
    @Test
    public void testGet() throws Exception {
        Client client = new Client(null, "TestClient", "880055545");
        Client created = repository.save(client);
        System.out.println(repository.get(created.getId()));
    }
}
