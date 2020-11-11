import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AnimalTest {

        Animal animal;

        @Before
        public void before() {
            animal = new Animal("Simba");
        }

        @Test
        public void canEat(){
            assertEquals("I love to eat rabbits", animal.eat("rabbits"));
        }

        @Test
        public void canBreathe() {
            assertEquals("I love breathing air", animal.breathe("air"));
        }
    }
