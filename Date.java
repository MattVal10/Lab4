// Matthew Valencia

// CS 145 

// Lab 4 Payroll System Modifications 

// April 30th 2024

// youtube, W3 Schools 

public class Date {
    private int month; // 1-12
    private int day; // 1-31 based on month
    private int year; // any year

    // Constructor to initialize the Date object with a given month, day, and year
    public Date(int month, int day, int year) {
        // Validate the month
        if (month < 1 || month > 12) {
            throw new IllegalArgumentException("Month must be between 1 and 12");
        }

        // Validate the day based on the month
        if (day < 1 || day > 31) {
            throw new IllegalArgumentException("Day must be between 1 and 31");
        }

        // Check for February and leap years
        if (month == 2 && day > 29) {
            throw new IllegalArgumentException("Invalid day for February");
        }

        // Check for months with 30 days
        if (month == 4 || month == 6 || month == 9 || month == 11) {
            if (day > 30) {
                throw new IllegalArgumentException("Invalid day for the given month");
            }
        }

        // Initialize the Date object if all validations pass
        this.month = month;
        this.day = day;
        this.year = year;
    }

    // Getter method for the month
    public int getMonth() {
        return month;
    }

    // Getter method for the day
    public int getDay() {
        return day;
    }

    // Getter method for the year
    public int getYear() {
        return year;
    }

    // String representation of the Date object
    public String toString() {
        return month + "/" + day + "/" + year;
    }
}


