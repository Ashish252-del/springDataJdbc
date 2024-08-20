package JDBC.example.learnJpaHibernate.course;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity // we have used this annotation from jpa api (jakarta.persistence) as jpa is like an interface
// so we have used hibernate implementation of jpa that's why hibernate will be also available in jar files 
public class Course {
    @Id
    private  long id;
   // @Column since the name is matching that's why not using annotation
    private String name;
    private String author;

    public Course(long id, String name, String author) {
        this.id = id;
        this.name = name;
        this.author = author;
    }

    // Default constructor
    public Course() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
    @Override
    public String toString() {
        return "Course{" +
                "id=" + this.id +
                ", name='" + this.name + '\'' +
                ", author='" + this.author + '\'' +
                '}';
    }


}
