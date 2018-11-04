package ru.mtuci.labwork2.model;
import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "Client")

public class Client extends BaseEntity {
    private String name;
    private String phone_number;

   @OneToMany(fetch = FetchType.LAZY, mappedBy="client")
    Set<Basket> basket;

    public Set<Basket> getBasket() {
        return basket;
    }
    public void setBasket(Set<Basket> basket) {
        this.basket = basket;
    }

    public Client(){
    }
    public Client(Long id, String name, String phone_number) {
        super(id);
        this.name = name;
        this.phone_number = phone_number;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getPhone_number() {
        return phone_number;
    }
    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + getId() +
                ", Name='" + name + '\'' +
                ", Phone_number='" + phone_number + '\'' +
                '}';
    }
}
