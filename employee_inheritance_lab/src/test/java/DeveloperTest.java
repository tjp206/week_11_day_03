import org.junit.Before;
import org.junit.Test;
import techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer developer;

    @Before
    public void before() {
        developer = new Developer("TJ", "TJ123456", 100000.00);
    }

    @Test
    public void canRaiseSalary(){
        developer.raiseSalary(2500.00);
        assertEquals(102500.00, developer.getSalary(), 0.01);
    }

    @Test
    public void canPayBonus(){
        assertEquals(1000.00, developer.payBonus(), 0.01);
    }
}
