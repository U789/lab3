package ru.mtuci.labwork2.repository;
import ru.mtuci.labwork2.model.Author;

public class AuthorRepository extends AbstractRepository<Author> {
    public AuthorRepository()
    {
        super(Author.class);
    }
}
