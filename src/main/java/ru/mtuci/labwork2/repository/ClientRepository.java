package ru.mtuci.labwork2.repository;

import ru.mtuci.labwork2.model.Client;

public class ClientRepository extends AbstractRepository<Client> {
    public ClientRepository()
    {
        super(Client.class);
    }
}
