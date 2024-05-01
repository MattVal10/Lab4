// Matthew Valencia

// CS 145 

// Lab 4 Payroll System Modifications 

// April 30th 2024

// youtube, W3 Schools 

public class CommissionEmployee extends Employee {
    private double grossSales; // gross weekly sales
    private double commissionRate; // commission percentage

    // Constructor for CommissionEmployee
    public CommissionEmployee(String firstName, String lastName,
                              String socialSecurityNumber, int month, int day, int year, double grossSales,
                              double commissionRate) {
        // Calling the constructor of the superclass (Employee)
        super(firstName, lastName, socialSecurityNumber, month, day, year);
        // Checking if the gross sales and commission rate are valid
        if (grossSales < 0.0) {
            throw new IllegalArgumentException(
                    "Gross sales must be >= 0.0");
        }

        if (commissionRate <= 0.0 || commissionRate >= 1.0) {
            throw new IllegalArgumentException(
                    "Commission rate must be > 0.0 and < 1.0");
        }

        this.grossSales = grossSales;
        this.commissionRate = commissionRate;
    }

    // Setter for gross sales
    public void setGrossSales(double grossSales) {
        // Checking if the gross sales is valid
        if (grossSales < 0.0) {
            throw new IllegalArgumentException(
                    "Gross sales must be >= 0.0");
        }

        this.grossSales = grossSales;
    }

    // Getter for gross sales
    public double getGrossSales() {
        return grossSales;
    }

    // Setter for commission rate
    public void setCommissionRate(double commissionRate) {
        // Checking if the commission rate is valid
        if (commissionRate <= 0.0 || commissionRate >= 1.0) {
            throw new IllegalArgumentException(
                    "Commission rate must be > 0.0 and < 1.0");
        }

        this.commissionRate = commissionRate;
    }

    // Getter for commission rate
    public double getCommissionRate() {
        return commissionRate;
    }

    // Calculating earnings based on gross sales and commission rate
    public double earnings() {
        return getCommissionRate() * getGrossSales();
    }

    // Overriding the toString method to include commission employee details
    @Override
    public String toString() {
        return String.format("%s: %s %s%n%s: %s%n%s: %.2f%n%s: %.2f",
                "commission employee", getFirstName(), getLastName(),
                "social security number", getSocialSecurityNumber(),
                "gross sales", getGrossSales(),
                "commission rate", getCommissionRate());
    }
}

 