package ru.mtuci.labwork2.model;
import javax.persistence.*;
import java.util.*;
@Entity
@Table(name = "basket")

public class Basket extends  BaseEntity {
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "client_id", nullable = false)
    private Client client;
    public Client getClient() {
        return client;
    }
    public void setClient(Client client) {
        this.client = client;
    }

    public Basket(){
    }
    public Basket(Long id) {
        super(id);
    }

    @Override
    public String toString() {
        return "Basket{" +
                "id=" + getId() +
                '}';
    }
}
