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
            this.repository.save(new Person("Aokiji", "Kuzan", "aokiji_kuzan@onepiece.com"));
            this.repository.save(new Person("Akainu", "Sakazuki", "akainu_sakazuki@onepiece.com"));
            this.repository.save(new Person("Roronoa", "Zoro", "roronoa_zoro@onepiece.com"));
            this.repository.save(new Person("Franky", "Cyborg", "franky_cyborg@onepiece.com"));
            this.repository.save(new Person("Hendi", "Santika", "hendisantika@konohagakure.com"));
            this.repository.save(new Person("Uzumaki", "Naruto", "uzumaki_naruto@konohagakure.com"));
            this.repository.save(new Person("Hatake", "Kakashi", "kakahis_hatake@konohagakure.com"));
            this.repository.save(new Person("Sakura", "Haruno", "sakura_haruno@konohagakure.com"));
            this.repository.save(new Person("Sasuke", "Uchiha", "sasuke_uchiha@konohagakure.com"));
        }
    }
}
