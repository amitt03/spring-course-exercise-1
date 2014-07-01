package springcourse.solutions.exercise1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author Amit Tal
 * @since 3/24/14
 */
public class Main {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Library library = context.getBean(Library.class);
        library.open();
        library.close();
        BookDao bookDao = context.getBean(BookDao.class);
        bookDao.checkConnection();
    }
}
