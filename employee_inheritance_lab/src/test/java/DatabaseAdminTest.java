import org.junit.Before;
import org.junit.Test;
import techStaff.DatabaseAdmin;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    DatabaseAdmin databaseAdmin;

    @Before
    public void before() {
        databaseAdmin = new DatabaseAdmin("TJ", "TJ123456", 100000.00);
    }

    @Test
    public void canRaiseSalary(){
        databaseAdmin.raiseSalary(2500.00);
        assertEquals(102500.00, databaseAdmin.getSalary(), 0.01);
    }

    @Test
    public void canPayBonus(){
        assertEquals(1000.00, databaseAdmin.payBonus(), 0.01);
    }
}
