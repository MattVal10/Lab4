// Matthew Valencia

// CS 145 

// Lab 4 Payroll System Modifications 

// April 30th 2024

// youtube, W3 Schools 

// SalariedEmployee.java

// Concrete class representing a salaried employee, extends Employee
public class SalariedEmployee extends Employee {
   private double weeklySalary; // Employee's weekly salary

   // Constructor to initialize a SalariedEmployee object
   public SalariedEmployee(String firstName, String lastName,
                           String socialSecurityNumber, int month, int day, int year,
                           double weeklySalary) {
       super(firstName, lastName, socialSecurityNumber, month, day, year);

       if (weeklySalary < 0.0) {
           throw new IllegalArgumentException("Weekly salary must be >= 0.0");
       }

       this.weeklySalary = weeklySalary;
   }

   // Set the weekly salary
   public void setWeeklySalary(double weeklySalary) {
       if (weeklySalary < 0.0) {
           throw new IllegalArgumentException("Weekly salary must be >= 0.0");
       }

       this.weeklySalary = weeklySalary;
   }

   // Return the weekly salary
   public double getWeeklySalary() {
       return weeklySalary;
   }

   // Calculate the earnings for a salaried employee
   @Override
   public double earnings() {
       return getWeeklySalary();
   }

   // String representation of the SalariedEmployee object
   @Override
   public String toString() {
       return String.format("salaried employee: %s%n%s: $%,.2f",
               super.toString(), "weekly salary", getWeeklySalary());
   }
}

