import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PersonTest {

    Person person;

    @Before
    public void before() {
        person = new Person("TJ", "G21");
    }

    @Test
    public void hasName() {
        assertEquals("TJ", person.getName());
    }

    @Test
    public void hasCohort() {
        assertEquals("G21", person.getCohort());
    }

    @Test
    public void canChangeName() {
        person.setName("JT");
        assertEquals("JT", person.getName());
    }

    @Test
    public void canChangeCohort() {
        person.setCohort("G211");
        assertEquals("G211", person.getCohort());
    }

    @Test
    public void canTalk() {
        assertEquals("I love Java", person.talk("Java"));
    }
}
