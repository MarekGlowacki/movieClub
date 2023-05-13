package online.javafun.movieclub;

import online.javafun.movieclub.storage.FileStorageProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(FileStorageProperties.class)
public class MovieClubApplication {

    public static void main(String[] args) {
        SpringApplication.run(MovieClubApplication.class, args);
    }

}
