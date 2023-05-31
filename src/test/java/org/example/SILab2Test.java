import org.junit.Test;
import static org.junit.Assert.*;

public class SILab2Test {

    @Test
    public void testEveryBranch() {
        // Test funkcija
        assertEquals(SILab2.function(2), "EVEN");
        assertEquals(SILab2.function(3), "ODD");
    }

    @Test
    public void testMultipleCondition() {
        // Test funkcija
        assertEquals(SILab2.function(4), "EVEN");
        assertEquals(SILab2.function(9), "ODD");
    }

}