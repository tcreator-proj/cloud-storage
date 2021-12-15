package ru.tcreator.cloudstorage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CloudStorageApplication {

    public static void main(String[] args) {
        System.out.println("Сборка 1");
        SpringApplication.run(CloudStorageApplication.class, args);
    }

}
