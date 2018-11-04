package ru.mtuci.labwork2.model;

import javax.persistence.*;
import java.util.*;

@Entity
@Table(name = "publisher")

public class Publisher extends BaseEntity {
    private String name;
    private String phone_number;
    private String website;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "publisher")
    Set<Book> book;
    public Set<Book> getBook() {
        return book;
    }
    public void setBook(Set<Book> book) {
        this.book = book;
    }

    public Publisher() {
    }
    public Publisher(Long id, String phone_number,String website,String name) {
        super(id);
        this.phone_number = phone_number;
        this.website = website;
        this.name = name;
    }
    public String getPhone_number() {
        return phone_number;
    }
    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public String getWebsite() {
        return website;
    }
    public void setWebsite(String website) {
        this.website = website;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Publisher{" +
                "id=" + getId() +
                ", name ='" + name + '\'' +
                ", Phone_number ='" + phone_number + '\'' +
                ", Website ='" + website + '\'' +
                '}';
    }
}
