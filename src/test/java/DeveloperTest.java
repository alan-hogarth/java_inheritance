import org.junit.Before;
import org.junit.Test;
import techStaff.Developer;

import static junit.framework.TestCase.assertEquals;

public class DeveloperTest {


    Developer developer;

    @Before
    public void before() {
        developer = new Developer("Brian", "XY123456M", 3000);
    }

    @Test
    public void canGetName(){
        assertEquals("Brian", developer.getName());
    }

    @Test
    public void canGetNINumber() {
        assertEquals("XY123456M", developer.getNiNumber());

    }

    @Test
    public void canGetSalary() {
        assertEquals(3000, developer.getSalary());
    }

    @Test
    public void canRaiseSalary() {
        developer.raiseSalary(1500.0);
        assertEquals(4500, developer.getSalary());
    }

    @Test
    public void canPayBonus() {
        assertEquals(30, developer.payBonus());
    }
}
