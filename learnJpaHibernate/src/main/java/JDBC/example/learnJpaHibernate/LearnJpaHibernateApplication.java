package JDBC.example.learnJpaHibernate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LearnJpaHibernateApplication {

	public static void main(String[] args) {

		SpringApplication.run(LearnJpaHibernateApplication.class, args);
	}

}
// notes --> Basically we are using H2 in memory database it will be acting as non-sql db
// for the set-up we need to add commands in application.properties
// and for the table creation in db we need to add .sql file in resources
// after doing the first line setup when you run the project and in web need to hit url with end point /h2-console
// in application.properties configure db as well
// now to create table in db make file schema.sql in resources folder

// why need of jpa --> look with spring jdbc we reduce java code but sql query code is too much to reduce that need to use orm
// in jpa basically we directly map our class to tables of database
// for mapping we need to make our class as entity and column annotation for the field of class to mapped with table