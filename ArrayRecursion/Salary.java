// Given is an Array of Employee Salary, add the tax 10% in each salary and return the new array which contains (salary + tax).

import java.util.*;

public class Salary {

    public static double[] addTaxToSalaries(double[] salaries) {
        double[] salariesWithTax = new double[salaries.length];
        for (int i = 0; i < salaries.length; i++) {
            salariesWithTax[i] = salaries[i] + (0.1 * salaries[i]); // Add 10% tax
        }
        return salariesWithTax;
    }

    public static void main(String[] args) {

        double[] salaries = { 1000, 2000, 3000 };
        double[] salariesWithTax = addTaxToSalaries(salaries);

        System.out.println("Salaries with tax:");
        for (int i = 0; i < salariesWithTax.length; i++) {
            System.out.println(salariesWithTax[i]);
        }

    }
}