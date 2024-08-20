package JDBC.example.learnJpaHibernate.course.jpa;

import JDBC.example.learnJpaHibernate.course.Course;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

@Repository
@Transactional // whenever you want to query with jdbc you need to use transactional annotation
public class CourseJpaRepository {
    @PersistenceContext // similar to autowired but more specific
   private EntityManager entityManager;

    public void insert(Course course) {
        entityManager.merge(course);
    }
    public void deleteById (long id) {
        Course course = entityManager.find(Course.class,id);
        entityManager.remove(course);
    }
    public Course findById (long id) {
        return entityManager.find(Course.class, id);
    }
}
