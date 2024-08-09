import java.time.LocalDate;

import br.com.dio.desafio.domain.Course;
import br.com.dio.desafio.domain.Mentorship;

public class App {
    public static void main(String[] args) throws Exception {
        var course1 = new Course();
        course1.setTitle("java course");
        course1.setDescription("Course description");
        course1.setWorkload(8);

        var course2 = new Course();
        course2.setTitle("js course");
        course2.setDescription("Course description js");
        course2.setWorkload(4);

        var mentorship = new Mentorship();
        mentorship.setTitle("Java mentorship");
        mentorship.setDescription("Java mentorship description");
        mentorship.setDate(LocalDate.now());
    }

}