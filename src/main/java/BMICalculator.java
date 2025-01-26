public class BMICalculator {

    private String firstname;
    private String lastname;
    private int bodyHeight;
    private double bodyWeight;
    private char gender;

    public BMICalculator(String firstname, String lastname, int bodyHeight, double bodyWeight, char gender) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.bodyHeight = bodyHeight;
        this.bodyWeight = bodyWeight;
        this.gender = Character.toUpperCase(gender);
    }

    public double calculateBMI() {
        double bmi = bodyWeight / Math.pow((bodyHeight /100.0), 2);
        return round(bmi);
    }

    private double round(double value) {
        return Math.round(value * 100.0) / 100.0;
    }

    public int calculateBMICategory() {
        double BMI = calculateBMI();

        if (gender == 'M') {
            if (BMI < 16.0) {
                return -2;
            } else if (BMI <= 18.4) {
                return -1;
            } else if (BMI <= 24.9) {
                return 0;
            } else if (BMI <= 34.9) {
                return 1;
            } else {
                return 2;
            }
        } else {
            if (BMI < 15.0) {
                return -2;
            } else if (BMI <= 17.4) {
                return -1;
            } else if (BMI <= 23.9) {
                return 0;
            } else if (BMI <= 33.9) {
                return 1;
            } else {
                return 2;
            }
        }
    }

    public String getBMICategoryName() {
        switch (calculateBMICategory()) {
            case (-2):
                return "Sehr starkes Untergewicht";
            case (-1):
                return "Untergewicht";
            case (0):
                return "Normalgewicht";
            case (1):
                return "Übergewicht";
            case (2):
                return "Sehr starkes Übergewicht";
            default:
                return "Keine gültige Eingabe";
        }
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public int getBodyHeight() {
        return bodyHeight;
    }

    public double getBodyWeight() {
        return bodyWeight;
    }

    public char getGender() {
        return gender;
    }

    public void setBodyHeight(int bodyHeight) {
        this.bodyHeight = bodyHeight;
    }

    public void setBodyWeight(double bodyWeight) {
        this.bodyWeight = bodyWeight;
    }
}
