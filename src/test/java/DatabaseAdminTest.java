import org.junit.Before;
import org.junit.Test;
import techStaff.DatabaseAdmin;

import static junit.framework.TestCase.assertEquals;

public class DatabaseAdminTest {

        DatabaseAdmin databaseAdmin;

        @Before
        public void before() {
            databaseAdmin = new DatabaseAdmin("Kronos", "XY123456M", 2000);
        }

        @Test
        public void canGetName(){
            assertEquals("Kronos", databaseAdmin.getName());
        }

        @Test
        public void canGetNINumber() {
            assertEquals("XY123456M", databaseAdmin.getNiNumber());

        }

        @Test
        public void canGetSalary() {
            assertEquals(2000, databaseAdmin.getSalary());
        }

        @Test
        public void canRaiseSalary() {
            databaseAdmin.raiseSalary(1000.0);
            assertEquals(3000, databaseAdmin.getSalary());
        }

        @Test
        public void canPayBonus() {
            assertEquals(20, databaseAdmin.payBonus());
        }


}
