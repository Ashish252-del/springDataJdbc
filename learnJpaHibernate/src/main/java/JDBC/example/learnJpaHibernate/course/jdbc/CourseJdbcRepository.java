package JDBC.example.learnJpaHibernate.course.jdbc;

import JDBC.example.learnJpaHibernate.course.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CourseJdbcRepository {
    @Autowired
    private JdbcTemplate springJdbcTemplate;
    private static String INSERT_QUERY = " insert into course (id , name , author ) values (?,?,?)";
    private static String DELETE_QUERY = "delete from course where id = ?";
    private static String SELECT_QUERY = "select * from course where id = ?";
    public void insert (Course course) {
       // springJdbcTemplate.update(INSERT_QUERY);
        springJdbcTemplate.update(INSERT_QUERY,course.getId(), course.getName(), course.getAuthor());
    }
    public void deleteById (long id) {
        springJdbcTemplate.update(DELETE_QUERY,id);
    }
    public Course findById (long id) {
        // Result set will be a bean we need to map that in class
        // to work this properly we must have setter in our class
        // we must have default constructor as well for mapping
       return springJdbcTemplate.queryForObject(SELECT_QUERY, new BeanPropertyRowMapper<>(Course.class), id);
    }
 }
// notes --> If we want to execute this query while startup of this application for that purpose
// spring boot provides command line runner
