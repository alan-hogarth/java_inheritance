import Management.Manager;
import org.junit.Before;
import org.junit.Test;
import staff.Employee;
import techStaff.Developer;

import static junit.framework.TestCase.assertEquals;

public class EmployeeTest {

    Employee employee;

    @Before
    public void before(){
        employee = new Manager("The Vortex", "Zardoz", "XY123456M", 4000);
    }

    @Test
    public void hasDeptName() {
        employee = new Manager("The Event Horizon", "Puck", "XY123456M", 5000);
        Manager manager = (Manager) employee;
        assertEquals("The Event Horizon", manager.getDeptName());
    }

    @Test
    public void hasName() {
        assertEquals("Zardoz", employee.getName());
    }

    @Test
    public void hasNINumber() {
        assertEquals("XY123456M", employee.getNiNumber());
    }

    @Test
    public void hasSalary() {
        assertEquals(4000, employee.getSalary());
    }

    @Test
    public void canRaiseSalary() {
        employee.raiseSalary(2000.0);
       assertEquals(6000, employee.getSalary());
    }

    @Test
    public void canChangeName(){
        employee.setName("Klaus");
        assertEquals("Klaus", employee.getName());
    }

    @Test
    public void cantChangeName(){
        employee.setName("");
        assertEquals("Zardoz", employee.getName());
    }

    @Test
    public void canPayBonus() {
        assertEquals(40, employee.payBonus());
    }
}
