import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HumanTest {

    Human human;

    @Before
    public void before() {
        human = new Human("TJ");
    }

    @Test
    public void canEat(){
        assertEquals("I love to eat sushi", human.eat("sushi"));
    }

    @Test
    public void canBreathe() {
        assertEquals("I love breathing air", human.breathe("air"));
    }

    @Test
    public void canTalk(){
        assertEquals("Wow I can talk", human.talk("talk"));
    }

    @Test
    public void canWalk(){
        assertEquals("Look at me I can walk", human.walk("walk"));
    }
}
