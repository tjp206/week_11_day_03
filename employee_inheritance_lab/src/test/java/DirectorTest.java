import management.Director;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director;

    @Before
    public void before() {
        director = new Director("TJ", "TJ123456", 100000.00, "IT", 5000.00);
    }

    @Test
    public void canRaiseSalary(){
        director.raiseSalary(2500.00);
        assertEquals(102500.00, director.getSalary(), 0.01);
    }

    @Test
    public void canPayBonus(){
        assertEquals(2000.00, director.payBonus(), 0.01);
    }

    @Test
    public void hasBudget(){
        assertEquals(5000.00, director.getBudget(), 0.01);
    }

    @Test
    public void preventNegativeValue() {
        director.raiseSalary(-2500.00);
        assertEquals(100000.00, director.getSalary(), 0.01);
    }

    @Test
    public void updateNameIfNotNull() {
        director.setName(null);
        assertEquals("TJ", director.getName());
    }
}
