package ru.mtuci.labwork2;

import org.junit.Test;
import ru.mtuci.labwork2.model.Basket;
import ru.mtuci.labwork2.model.Client;
import ru.mtuci.labwork2.repository.BasketRepository;
import ru.mtuci.labwork2.repository.ClientRepository;

public class TestBasketRepository {
    BasketRepository repository = new BasketRepository();
    ClientRepository clientRepository = new ClientRepository();
    @Test
    public void testCreate() throws Exception {
        Client client = new Client(null,"testClient","880055545");
        Client createdClient = clientRepository.save(client);
        Basket basket = new Basket(null);
        basket.setClient(createdClient);
        Basket created = repository.save(basket);
        System.out.println(created);
    }
    @Test
    public void testDelete() throws Exception {
        Client client = new Client(null,"testClient","880055545");
        Client createdClient = clientRepository.save(client);
        Basket basket = new Basket(null);
        basket.setClient(createdClient);
        Basket created = repository.save(basket);
        repository.delete(created.getId());
    }
    @Test
    public void testUpdate() {
        Client client = new Client(null,"testClient","880055545");
        Client createdClient = clientRepository.save(client);
        Basket basket = new Basket(null);
        basket.setClient(createdClient);
        Basket created = repository.save(basket);
        System.out.println(created);
        createdClient.setName("TestUpdate");
        basket.setClient(createdClient);
        Basket updated = repository.save(basket);
        System.out.println(updated);
    }
    @Test
    public void testGet() throws Exception {
        Client client = new Client(null,"testClient","880055545");
        Client createdClient = clientRepository.save(client);
        Basket basket = new Basket(null);
        basket.setClient(createdClient);
        Basket created = repository.save(basket);
        System.out.println(repository.get(created.getId()));
    }
}
