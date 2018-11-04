package ru.mtuci.labwork2.model;


import javax.persistence.*;
import java.util.*;

@Entity
@Table(name = "book")

public class Book extends BaseEntity{
    private String book_title;
    private Double cost;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "Publisher_id", nullable = false)
    private Publisher publisher;
    public Publisher getPublisher() {
        return publisher;
    }
    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "Author_id", nullable = false)
    private Author author;
    public Author getAuthor() {
        return author;
    }
    public void setAuthor(Author author) {
        this.author = author;
    }


    public Book() {
    }
    public Book(Long id,
                String book_title, Double cost) {
        super(id);
        this.book_title = book_title;
        this.cost = cost;
    }

    public String getBook_title() {
        return book_title;
    }
    public void setBook_title(String book_title) {
        this.book_title = book_title;
    }

    public Double getCost() {
        return cost;
    }
    public void setCost(Double cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + getId() +
                ", Title ='" + book_title + '\'' +
                ", Cost ='" + cost + '\'' +
                '}';
 }
}
