package ru.mtuci.labwork2.model;

import javax.persistence.*;
import java.util.*;

@Entity
@Table(name = "publhouse")

public class PublHouse extends BaseEntity {

        private String name;
        // Long id_chief;
        @OneToMany(fetch = FetchType.LAZY, mappedBy = "publhouse")
        Set<Author> author;
        public Set<Author> getAuthor() {
            return author;
        }
        public void setAuthor(Set<Author> author) {
            this.author = author;
        }
        public PublHouse() {
        }
        public PublHouse(Long id, String name) {
            super(id);
            this.name = name;
        }
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
        @Override
        public String toString() {
            return "Author{" +
                    "id=" + getId() +
                    ", name='" + name + '\'' +
                    '}';
        }
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            PublHouse publHouse = (PublHouse) o;
            return name != null ? name.equals(publHouse.name) : publHouse.name == null;
        }
        @Override
        public int hashCode() {
            int result = super.hashCode();
            result = 31 * result + (name != null ? name.hashCode() : 0);
            return result;
        }


}
