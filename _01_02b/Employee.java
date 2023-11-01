package _01_02b;

public class Employee {

  public static void main(String[] args) {

    // Create a variable called age of type int and assign it the value 29.
    int age; // Declare the variable 'age' of type int
    age = 29; // Assign the value 29 to the 'age' variable

    // Print the age variable to the console.
    System.out.println(age);

    // Create a variable called isAManager of type boolean and assign it the value
    // true.
    boolean isAManager = true;

    // Print the isAManager variable to the console.
    System.out.print(isAManager);

    // Create a variable called yearsOfService of type double and assign it the
    // value 2.5.
    double yearsOfService; // Declare the variable 'yearsOfService' of type double
    yearsOfService = 2.5; // Assign the value 2.5 to the 'yearsOfService' variable
    // Print the yearsOfService variable to the console.

    System.out.println(yearsOfService); // Print the 'yearsOfService' variable to the console

    // Create a variable called baseSalary of type int and assign it the value 3000.
    int baseSalary; // Declare the variable 'baseSalary' of type int
    baseSalary = 3000; // Assign the value 3000 to the 'baseSalary' variable

    // Create a variable called overtimePayment of type int and assign it the value
    // 40.
    int overtimePayment = 40; // Declare and assign the variable 'overtimePayment' of type int with the value
                              // 40

    // Create a variable called totalPayment of type int and assign it to the value
    // of baseSalary added to overtimePayment.
    int totalPayment = baseSalary + overtimePayment;

    // Print the totalPayment variable to the console.
    System.out.println(totalPayment);

    // Create three variables all of type double on a single line.
    // They should be called firstBonus, secondBonus and thirdBonus and they should
    // be assigned the values 10.00, 22.00 and 35.00.
    double firstBonus = 10.00, secondBonus = 22.00, thirdBonus = 35.00;

    // Print out the sum of the variables called firstBonus, secondBonus and
    // thirdBonus.

    double sum = firstBonus + secondBonus + thirdBonus;
    System.out.println("Sum of bonuses: " + sum);

  }

}
