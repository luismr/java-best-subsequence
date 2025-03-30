import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    
    @Test
    void testBasicCase() {
        int[] A = {1, 2, 3, 4, 5};
        assertEquals(2, Main.solve(5, A, 3));
    }
    
    @Test
    void testSingleElement() {
        int[] A = {1};
        assertEquals(0, Main.solve(1, A, 1));
    }
    
    @Test
    void testInvalidK() {
        int[] A = {1, 2, 3};
        assertEquals(0, Main.solve(3, A, 4));
    }
    
    @Test
    void testNegativeNumbers() {
        int[] A = {-1, 2, -3, 4, -5};
        assertEquals(4, Main.solve(5, A, 3));
    }
    
    @Test
    void testEqualNumbers() {
        int[] A = {1, 1, 1, 1, 1};
        assertEquals(0, Main.solve(5, A, 3));
    }
} 