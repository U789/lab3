package ru.mtuci.labwork2.model;

import javax.persistence.*;
@Entity
@Table(name = "author2")

public class Author extends BaseEntity {
        private String lastname;
        private String firstname;
        private String patronym;
        @ManyToOne(fetch = FetchType.EAGER)
        @JoinColumn(name = "id_PublHouse", nullable = false)
        private PublHouse publhouse;
        public PublHouse getPublHouse() {
            return publhouse;
        }
        public void setPublhouse(PublHouse publhouse) {
            this.publhouse = publhouse;
        }
        public Author() {
        }
        public Author(Long id, String lastname,
                      String firstname, String patronym) {
            super(id);
            this.lastname = lastname;
            this.firstname = firstname;
            this.patronym = patronym;
        }

        public String getLastname() {
            return lastname;
        }
        public void setLastname(String lastname) {
            this.lastname = lastname;
        }
        public String getFirstname() {
            return firstname;
        }
        public void setFirstname(String firstname) {
            this.firstname = firstname;
        }
        public String getPatronym() {
            return patronym;
        }
        public void setPatronym(String patronym) {
            this.patronym = patronym;
        }
        @Override
        public String toString() {
            return "Author{" +
                    "id=" + getId() +
                    ", lastname='" + lastname + '\'' +
                    ", firstname='" + firstname + '\'' +
                    ", patronym='" + patronym + '\'' +
                    '}';
        }
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
           Author author = (Author) o;
            if (lastname != null ? !lastname.equals(author.lastname) : author.lastname != null) return false;
            if (firstname != null ? !firstname.equals(author.firstname) : author.firstname != null) return false;
            return patronym != null ? patronym.equals(author.patronym) : author.patronym == null;
        }
        @Override
        public int hashCode() {
            int result = super.hashCode();
            result = 31 * result + (lastname != null ? lastname.hashCode() : 0);
            result = 31 * result + (firstname != null ? firstname.hashCode() : 0);
            result = 31 * result + (patronym != null ? patronym.hashCode() : 0);
            return result;
        }
    }
