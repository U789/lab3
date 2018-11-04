package ru.mtuci.labwork2.model;

import javax.persistence.*;
@Entity
@Table(name = "orderedbook")

public class OrderedBook extends BaseEntity{
    private int quanity;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "Book_id", nullable = false)
    private Book book;
    public Book getBook() {
        return book;
    }
    public void setBook(Book book) {
        this.book = book;
    }

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "Basket_id", nullable = false)
    private Basket basket;
    public Basket getBasket() {
        return basket;
    }
    public void setBasket(Basket basket) {
        this.basket = basket;
    }

    public OrderedBook() {
    }
    public OrderedBook(Long id, int quanity) {
        super(id);
        this.quanity = quanity;
    }

    public int getQuanity() {
        return quanity;
    }
    public void setQuanity(int quanity) {
        this.quanity = quanity;
    }

    @Override
    public String toString() {
        return  "id=" + getId() +
                ", quanity ='" + quanity + '\'' +
                '}';
    }
}
