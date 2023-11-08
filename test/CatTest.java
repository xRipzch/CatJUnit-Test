import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CatTest {
    private Cat c;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        c = new Cat("Møffe", 'M', 8);

    }

    @org.junit.jupiter.api.Test
    void getName() {
        assertNotNull(c.getName());
        assertFalse(c.getName().isEmpty());
    }

    @Test
    void getGender() {
        assertTrue(c.getGender() == 'M' || c.getGender() == 'F');
    }

    @Test
    void getWeightInKg() {
        assertTrue(c.getWeightInKg() > 0 && c.getWeightInKg() <= 10);
    }
}