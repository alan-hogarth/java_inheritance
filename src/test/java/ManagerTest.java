import Management.Manager;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void before(){
        manager = new Manager("The Vortex", "Zardoz", "XY123456M", 4000);
    }

    @Test
    public void hasDeptName() {
        assertEquals("The Vortex", manager.getDeptName());
    }

    @Test
    public void hasName() {
        assertEquals("Zardoz", manager.getName());
    }

    @Test
    public void hasNINumber() {
        assertEquals("XY123456M", manager.getNiNumber());
    }

    @Test
    public void hasSalary() {
        assertEquals(4000, manager.getSalary());
    }

    @Test
    public void canRaiseSalary() {
       assertEquals(6000.0, manager.raiseSalary(0.5));
    }

    @Test
    public void canPayBonus() {
        assertEquals(40, manager.payBonus());
    }
}
