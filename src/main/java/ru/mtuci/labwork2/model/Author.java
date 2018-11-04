package ru.mtuci.labwork2.model;
import java.util.*;
import javax.persistence.*;
@Entity
@Table(name = "author")

public class Author extends BaseEntity {
        private String email_address;
        private String phone_number;
        private String website;
        private String name;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "author")
    Set<Book> book;
    public Set<Book> getBook() {
        return book;
    }
    public void setBook(Set<Book> book) {
        this.book = book;
    }

        public Author() {
        }
        public Author(Long id, String email_address,
                      String phone_number, String website, String name) {
            super(id);
            this.email_address = email_address;
            this.phone_number = phone_number;
            this.website = website;
            this.name = name;
        }

        public String getEmail_address() {
            return email_address;
        }
        public void setEmail_address(String email_address) { this.email_address = email_address; }

        public String getPhone_number() { return phone_number; }
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
        public void setName(String name) { this.name = name; }

        @Override
        public String toString() {
            return "Author{" +
                    "id=" + getId() +
                    ", name='" + name + '\'' +
                    ", email_address='" + email_address + '\'' +
                    ", phone_number='" + phone_number + '\'' +
                    ", websute='" + website + '\'' +
                    '}';
        }
    }
