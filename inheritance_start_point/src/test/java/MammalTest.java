import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MammalTest {

    Mammal mammal;

    @Before
    public void before() {
        mammal = new Mammal("Mufasa");
    }

    @Test
    public void canTalk(){
        assertEquals("Wow I can talk", mammal.talk("talk"));
    }
}
