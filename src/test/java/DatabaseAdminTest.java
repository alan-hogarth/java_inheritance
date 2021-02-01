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
            assertEquals(3000.0, databaseAdmin.raiseSalary(0.5));
        }

        @Test
        public void canPayBonus() {
            assertEquals(20, databaseAdmin.payBonus());
        }


}
