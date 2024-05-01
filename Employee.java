// Matthew Valencia

// CS 145 

// Lab 4 Payroll System Modifications 

// April 30th 2024

// youtube, W3 Schools 

// Abstract superclass representing an employee
public abstract class Employee {
   private final String firstName; // Employee's first name
   private final String lastName; // Employee's last name
   private final String socialSecurityNumber; // Employee's SSN
   private final Date birthDate; // Employee's birth date

   // Constructor to initialize an Employee object
   public Employee(String firstName, String lastName,
                   String socialSecurityNumber, int month, int day, int year) {
       this.firstName = firstName;
       this.lastName = lastName;
       this.socialSecurityNumber = socialSecurityNumber;
       birthDate = new Date(month, day, year);
   }

   // Return first name
   public String getFirstName() {
       return firstName;
   }

   // Return last name
   public String getLastName() {
       return lastName;
   }

   // Return social security number
   public String getSocialSecurityNumber() {
       return socialSecurityNumber;
   }

   // Return birth date
   public Date getBirthDate() {
       return birthDate;
   }

   // Abstract method to calculate earnings, to be implemented by subclasses
   public abstract double earnings();

   // String representation of the Employee object
   @Override
   public String toString() {
       return String.format("%s %s%n%s: %s%n%s: %s",
               getFirstName(), getLastName(),
               "social security number", getSocialSecurityNumber(),
               "birth date", getBirthDate());
   }
}




