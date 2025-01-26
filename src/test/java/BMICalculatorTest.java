import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BMICalculatorTest {

    BMICalculator bmiCalculator = new BMICalculator("Max", "Mustermann", 181, 81.9, 'M');

    @Test
    @DisplayName("Test Constructor: Firstname")
    void testFirstname() {
        assertEquals("Max", bmiCalculator.getFirstname());
    }

    @Test
    @DisplayName("Test Constructor: Lastname")
    void testLastname() {
        assertEquals("Mustermann", bmiCalculator.getLastname());
    }

    @Test
    @DisplayName("Test Constructor: Body Height")
    void testBodyHeight() {
        assertEquals(181, bmiCalculator.getBodyHeight());
    }

    @Test
    @DisplayName("Test Constructor: Body Weight")
    void testBodyWeight() {
        assertEquals(81.9, bmiCalculator.getBodyWeight());
    }

    @Test
    @DisplayName("Test Constructor: Gender")
    void testGender() {
        assertEquals('M', bmiCalculator.getGender());
    }


}