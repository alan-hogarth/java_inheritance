import Management.Director;
import Management.Manager;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class DirectorTest {

    Director director;

    @Before
    public void before(){
        director = new Director("The basement", "Gil", "9786NNN", 9000, 5000.5);
    }

    @Test
    public void hasDeptName() {
        assertEquals("The basement", director.getDeptName());
    }

    @Test
    public void hasName() {
        assertEquals("Gil", director.getName());
    }

    @Test
    public void hasNINumber() {
        assertEquals("9786NNN", director.getNiNumber());
    }

    @Test
    public void hasSalary() {
        assertEquals(9000, director.getSalary());
    }

    @Test
    public void canRaiseSalary() {
        assertEquals(13500.0, director.raiseSalary(0.5));
    }

    @Test
    public void canPayBonus() {
        assertEquals(90, director.payBonus());
    }

    @Test
    public void hasBudget(){
        assertEquals(5000.5, director.getBudget());

    }
}
