// Matthew Valencia

// CS 145 

// Lab 4 Payroll System Modifications 

// April 30th 2024

// youtube, W3 Schools 

// HourlyEmployee.java

// Concrete class representing an hourly employee, extends Employee
public class HourlyEmployee extends Employee {
   private double wage; // Employee's hourly wage
   private double hours; // Hours worked by the employee

   // Constructor to initialize an HourlyEmployee object
   public HourlyEmployee(String firstName, String lastName,
                         String socialSecurityNumber, int month, int day, int year,
                         double wage, double hours) {
       super(firstName, lastName, socialSecurityNumber, month, day, year);

       if (wage < 0.0) {
           throw new IllegalArgumentException("Hourly wage must be >= 0.0");
       }

       if (hours < 0.0 || hours > 168.0) {
           throw new IllegalArgumentException("Hours worked must be >= 0.0 and <= 168.0");
       }

       this.wage = wage;
       this.hours = hours;
   }

   // Set the hourly wage
   public void setWage(double wage) {
       if (wage < 0.0) {
           throw new IllegalArgumentException("Hourly wage must be >= 0.0");
       }

       this.wage = wage;
   }

   // Return the hourly wage
   public double getWage() {
       return wage;
   }

   // Set the hours worked
   public void setHours(double hours) {
       if (hours < 0.0 || hours > 168.0) {
           throw new IllegalArgumentException("Hours worked must be >= 0.0 and <= 168.0");
       }

       this.hours = hours;
   }

   // Return the hours worked
   public double getHours() {
       return hours;
   }

   // Calculate the earnings for an hourly employee
   @Override
   public double earnings() {
       if (getHours() <= 40) {
           return getWage() * getHours();
       } else {
           return 40 * getWage() + (getHours() - 40) * getWage() * 1.5;
       }
   }

   // String representation of the HourlyEmployee object
   @Override
   public String toString() {
       return String.format("hourly employee: %s%n%s: $%,.2f; %s: %,.2f",
               super.toString(), "hourly wage", getWage(),
               "hours worked", getHours());
   }
}

 