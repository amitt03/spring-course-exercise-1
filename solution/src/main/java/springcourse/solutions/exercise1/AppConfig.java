package springcourse.solutions.exercise1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Amit Tal
 * @since 3/24/14
 */
@Configuration
public class AppConfig {

    @Bean
    public BookDao bookDao() {
        return new BookDao();
    }

    @Bean
    public Library library() {
        return new Library();
    }
}