import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BMICalculatorTest {

    BMICalculator bmiCalculatorMax;
    BMICalculator bmiCalculatorSusi;
    BMICalculator bmiCalculatorCorey;

    @BeforeEach
    void setUp() {
        bmiCalculatorMax = new BMICalculator("Max", "Mustermann", 181, 81.9, 'M');
        bmiCalculatorSusi = new BMICalculator("Susi", "Sorglos", 170, 70.0, 'W');
        bmiCalculatorCorey = new BMICalculator("Corey", "Taylor", 180, 120.0, 'M');
    }

    @Test
    @DisplayName("Test Constructor: Firstname")
    void testFirstname() {
        assertEquals("Max", bmiCalculatorMax.getFirstname());
    }

    @Test
    @DisplayName("Test Constructor: Lastname")
    void testLastname() {
        assertEquals("Mustermann", bmiCalculatorMax.getLastname());
    }

    @Test
    @DisplayName("Test Constructor: Body Height")
    void testBodyHeight() {
        assertEquals(181, bmiCalculatorMax.getBodyHeight());
    }

    @Test
    @DisplayName("Test Constructor: Body Weight")
    void testBodyWeight() {
        assertEquals(81.9, bmiCalculatorMax.getBodyWeight());
    }

    @Test
    @DisplayName("Test Constructor: Gender")
    void testGender() {
        assertEquals('M', bmiCalculatorMax.getGender());
    }

    @Test
    @DisplayName("Test Methode: calculateBMI")
    void testCalculateBMI() {
        assertEquals(24.22, bmiCalculatorSusi.calculateBMI());
    }

    @Test
    @DisplayName("Test Methode: calculateBMI")
    void testTwoCalculateBMI() {
        assertEquals(37.04, bmiCalculatorCorey.calculateBMI());
    }

    @Test
    @DisplayName("Test Methode: calculateBMICategory")
    void testCalculateBMICategory() {
        assertEquals(1, bmiCalculatorSusi.calculateBMICategory());
    }

    @Test
    @DisplayName("Test Methode: calculateBMICategory")
    void testTwoCalculateBMICategory() {
        assertEquals(2, bmiCalculatorCorey.calculateBMICategory());
    }

    @Test
    @DisplayName("Test Methode: getBMICategoryName")
    void testGetBMICategoryName() {
        assertEquals("Übergewicht", bmiCalculatorSusi.getBMICategoryName());
    }

    @Test
    @DisplayName("Test Methode: getBMICategoryName")
    void testTwoGetBMICategoryName() {
        assertEquals("Sehr starkes Übergewicht", bmiCalculatorCorey.getBMICategoryName());
    }






}