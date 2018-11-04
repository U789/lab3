package ru.mtuci.labwork2.repository;

import ru.mtuci.labwork2.model.Basket;

public class BasketRepository extends AbstractRepository<Basket> {
    public BasketRepository()
    {
        super(Basket.class);
    }
}
