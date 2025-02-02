import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BMICalculatorTest {

    BMICalculator bmiCalculatorMax;
    BMICalculator bmiCalculatorSusi;
    BMICalculator bmiCalculatorCorey;
    BMICalculator bmiCalculatorAlex;
    BMICalculator bmiCalculatorSabine;

    @BeforeEach
    void setUp() {
        bmiCalculatorMax = new BMICalculator("Max", "Mustermann", 181, 59.5, 'M');
        bmiCalculatorSusi = new BMICalculator("Susi", "Sorglos", 170, 70.0, 'W');
        bmiCalculatorCorey = new BMICalculator("Corey", "Taylor", 180, 120.0, 'M');
        bmiCalculatorAlex = new BMICalculator("Alex", "Lustig", 196, 58.7, 'M');
        bmiCalculatorSabine = new BMICalculator("Sabine", "Müller", 158, 48.7, 'W');
    }

    @Test
    @DisplayName("Test Constructor: Firstname")
    void testFirstname() {
        assertEquals("Max", bmiCalculatorMax.getFirstname());
        assertEquals("Susi", bmiCalculatorSusi.getFirstname());
        assertEquals("Corey", bmiCalculatorCorey.getFirstname());
        assertEquals("Alex", bmiCalculatorAlex.getFirstname());
        assertEquals("Sabine", bmiCalculatorSabine.getFirstname());
    }

    @Test
    @DisplayName("Test Constructor: Lastname")
    void testLastname() {
        assertEquals("Mustermann", bmiCalculatorMax.getLastname());
        assertEquals("Sorglos", bmiCalculatorSusi.getLastname());
        assertEquals("Taylor", bmiCalculatorCorey.getLastname());
        assertEquals("Lustig", bmiCalculatorAlex.getLastname());
        assertEquals("Müller", bmiCalculatorSabine.getLastname());
    }

    @Test
    @DisplayName("Test Constructor: Body Height")
    void testBodyHeight() {
        assertEquals(181, bmiCalculatorMax.getBodyHeight());
        assertEquals(170, bmiCalculatorSusi.getBodyHeight());
        assertEquals(180, bmiCalculatorCorey.getBodyHeight());
        assertEquals(196, bmiCalculatorAlex.getBodyHeight());
        assertEquals(158, bmiCalculatorSabine.getBodyHeight());
    }

    @Test
    @DisplayName("Test Constructor: Body Weight")
    void testBodyWeight() {
        assertEquals(59.5, bmiCalculatorMax.getBodyWeight());
        assertEquals(70.0, bmiCalculatorSusi.getBodyWeight());
        assertEquals(120.0, bmiCalculatorCorey.getBodyWeight());
        assertEquals(58.7, bmiCalculatorAlex.getBodyWeight());
        assertEquals(48.7, bmiCalculatorSabine.getBodyWeight());
    }

    @Test
    @DisplayName("Test Constructor: Gender")
    void testGender() {
        assertEquals('M', bmiCalculatorMax.getGender());
        assertEquals('W', bmiCalculatorSusi.getGender());
        assertEquals('M', bmiCalculatorCorey.getGender());
        assertEquals('M', bmiCalculatorAlex.getGender());
        assertEquals('W', bmiCalculatorSabine.getGender());
    }

    @Test
    @DisplayName("Test Methode: calculateBMI")
    void testCalculateBMI() {
        assertEquals(24.22, bmiCalculatorSusi.calculateBMI());
        assertEquals(37.04, bmiCalculatorCorey.calculateBMI());
        assertEquals(18.16, bmiCalculatorMax.calculateBMI());
        assertEquals(15.28, bmiCalculatorAlex.calculateBMI());
        assertEquals(19.51, bmiCalculatorSabine.calculateBMI());
    }

    @Test
    @DisplayName("Test Methode: calculateBMICategory")
    void testCalculateBMICategory() {
        assertEquals(1, bmiCalculatorSusi.calculateBMICategory());
        assertEquals(2, bmiCalculatorCorey.calculateBMICategory());
        assertEquals(-1, bmiCalculatorMax.calculateBMICategory());
        assertEquals(-2, bmiCalculatorAlex.calculateBMICategory());
        assertEquals(0, bmiCalculatorSabine.calculateBMICategory());
    }


    @Test
    @DisplayName("Test Methode: getBMICategoryName")
    void testGetBMICategoryName() {
        assertEquals("Übergewicht", bmiCalculatorSusi.getBMICategoryName());
        assertEquals("Sehr starkes Übergewicht", bmiCalculatorCorey.getBMICategoryName());
        assertEquals("Untergewicht", bmiCalculatorMax.getBMICategoryName());
        assertEquals("Sehr starkes Untergewicht", bmiCalculatorAlex.getBMICategoryName());
        assertEquals("Normalgewicht", bmiCalculatorSabine.getBMICategoryName());
    }
}