package JDBC.example.learnJpaHibernate.course;

import JDBC.example.learnJpaHibernate.course.jdbc.CourseJdbcRepository;
import JDBC.example.learnJpaHibernate.course.jpa.CourseJpaRepository;
import JDBC.example.learnJpaHibernate.course.springDataJpa.CourseSpringDataJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {
//    @Autowired
//    private CourseJdbcRepository repository;
//    @Autowired
//    private CourseJpaRepository repository;
    @Autowired
    private CourseSpringDataJpaRepository repository;
    @Override
    public void run(String... args) throws  Exception {
//     repository.insert(new Course(1,"PatelJi","Ashish"));
//    repository.insert(new Course(2,"PatelJi","Ankit"));
//    repository.insert(new Course(3,"PatelJi","Manish"));
//
//
//         repository.deleteById(1);
       // Java's Object class provides a default toString() method that returns a string in the format of hash
        // if you want in any other format you need to override that by yourself

       //System.out.println("logging -------"+ repository.findById(2));

        // JPA ---->
     repository.save(new Course(1,"Java","Ashish"));
     repository.save(new Course(2,"C++","Ashish"));
     repository.save(new Course(3,"Python","Ashish"));
     repository.deleteById(1l); // by default integer is int that's why here specifying that it is long
     System.out.println("logging ......."+repository.findById(2l));
     System.out.println("logging ......."+repository.findAll());
     System.out.println("logging ......."+repository.findByAuthor("Ashish"));
     System.out.println("logging ......."+repository.count());





    }
}
