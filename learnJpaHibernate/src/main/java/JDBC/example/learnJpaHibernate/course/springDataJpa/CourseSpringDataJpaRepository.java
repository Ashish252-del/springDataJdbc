package JDBC.example.learnJpaHibernate.course.springDataJpa;

import JDBC.example.learnJpaHibernate.course.Course;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

// in interface first parameter is like which entity we want to manage and second one is
// data type of primary key of that entity
public interface CourseSpringDataJpaRepository extends JpaRepository<Course,Long> {
// well as JpaRepository provides some inbuild methods but we can add our custom method as well
// for that we need to follow naming convention followed by attributes
   List<Course> findByAuthor(String author);
}
