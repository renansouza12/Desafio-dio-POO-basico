import java.time.LocalDate;

import br.com.dio.desafio.domain.Bootcamp;
import br.com.dio.desafio.domain.Conteudo;
import br.com.dio.desafio.domain.Course;
import br.com.dio.desafio.domain.Dev;
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

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setName("Bootcamp java");
        bootcamp.setDescription("Description java bootcamp developer");
        bootcamp.getContents().add(course1);
        bootcamp.getContents().add(course2);

        Dev dev01 = new Dev();
        dev01.setName("Charlie");
        dev01.subscribeBootcamp(bootcamp);
        System.out.println("Contents subcribed Charlie " + dev01.getContents());
        dev01.progress();
        System.out.println("Contents finished Charlie " + dev01.getContentsDone());
        System.out.println("XP: " + dev01.calculeXp());

        Dev dev02 = new Dev();
        dev02.setName("Ellie");
        dev02.subscribeBootcamp(bootcamp);
        System.out.println("Contents subcribed Ellie" + dev02.getContents());
        dev02.progress();
        dev02.progress();
        dev02.progress();
        System.out.println("Contents finished Ellie " + dev02.getContentsDone());
        System.out.println("XP: " + dev02.calculeXp());

    }

}