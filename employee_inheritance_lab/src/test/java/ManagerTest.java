import management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void before() {
        manager = new Manager("TJ", "TJ123456", 100000.00, "IT");
    }

    @Test
    public void canRaiseSalary(){
        manager.raiseSalary(2500.00);
        assertEquals(102500.00, manager.getSalary(), 0.01);
    }

    @Test
    public void canPayBonus(){
       assertEquals(1000.00, manager.payBonus(), 0.01);
    }
}
