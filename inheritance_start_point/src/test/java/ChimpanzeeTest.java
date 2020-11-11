import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ChimpanzeeTest {

    Chimpanzee chimpanzee;

    @Before
    public void before() {
        chimpanzee = new Chimpanzee("Kong");
    }

    @Test
    public void canEat(){
        assertEquals("I love to eat banana", chimpanzee.eat("banana"));
    }

    @Test
    public void canBreathe() {
        assertEquals("I love breathing air", chimpanzee.breathe("air"));
    }

    @Test
    public void canTalk(){
        assertEquals("Wow I can talk", chimpanzee.talk("talk"));
    }

    @Test
    public void canWalk(){
        assertEquals("Look at me I can walk", chimpanzee.walk("walk"));
    }
}
