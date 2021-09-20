package com.iqmsoft.react;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

import com.iqmsoft.react.entity.Person;
import com.iqmsoft.react.repository.PersonRepository;

@SpringBootApplication
public class PersonReactApplication {

    public static void main(String[] args) {
        SpringApplication.run(PersonReactApplication.class, args);
    }

    @Component
    public class DatabaseLoader implements CommandLineRunner {

        private final PersonRepository repository;

        @Autowired
        public DatabaseLoader(PersonRepository repository) {
            this.repository = repository;
        }

        @Override
        public void run(String... strings) {
            this.repository.save(new Person("Test1", "Test1", "test1@test1.com"));
            this.repository.save(new Person("Test2", "Test2", "test2@test2.com"));
            this.repository.save(new Person("Test3", "Test3", "test3@test3.com"));
            this.repository.save(new Person("Test4", "Test4", "test4@test4.com"));
            this.repository.save(new Person("Test5", "Test5", "test5@test5.com"));
            this.repository.save(new Person("Test6", "Test6", "test6@test6.com"));
            this.repository.save(new Person("Test7", "Test7", "test7@test7.com"));
            this.repository.save(new Person("Test8", "Test8", "test8@test8.com"));
            this.repository.save(new Person("Test9", "Test9", "test9@test9.com"));
        }
    }
}
