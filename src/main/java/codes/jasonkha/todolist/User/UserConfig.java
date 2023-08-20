package codes.jasonkha.todolist.User;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserConfig {

    @Bean
    CommandLineRunner commandLineRunner(UserRepository repository) {
        return args -> {
            User jason = new User("Jason", "jasonkha63@yahoo.com",LocalDate.of(1998, Month.JANUARY, 8));
            User tehya = new User("Tehya", "tehyag@yahoo.com",LocalDate.of(1997, Month.FEBRUARY, 13));
            
            repository.saveAll(List.of(jason, tehya));
        };
    }
}
