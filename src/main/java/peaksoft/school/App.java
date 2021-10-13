package peaksoft.school;

import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * Mamazhanov Ruslanbek!
 *
 */
public class App {
    public static void main( String[] args ) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml");

        Person person = context.getBean("animalPerson",Person.class);
        System.out.println(person.toString());
        person.animalMinus();
        person.animalPilus();
       context.close();
    }
}
