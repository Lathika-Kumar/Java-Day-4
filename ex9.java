package kce;

public class ex9 {

    public static void main(String[] args) {

        String age = "21";
        String mark = "89.5";
        int salary = 35000;
        double percentage = 87.75;
        char section = 'A';

        int ageInt = Integer.parseInt(age);

        double markDouble = Double.parseDouble(mark);

        String salaryStr = Integer.toString(salary);

        String percentageStr = Double.toString(percentage);

        Integer n1 = 50;
        Integer n2 = 50;

        System.out.println("Compare: " + n1.compareTo(n2));

        System.out.println("Maximum: " + Integer.max(25, 50));

        System.out.println("Minimum: " + Integer.min(25, 50));

        Integer obj1 = 100;
        int value1 = obj1.intValue();

        Double obj2 = 45.8;
        double value2 = obj2.doubleValue();

        System.out.println("Is Letter: " + Character.isLetter(section));

        System.out.println("Age = " + ageInt);
        System.out.println("Mark = " + markDouble);
        System.out.println("Salary = " + salaryStr);
        System.out.println("Percentage = " + percentageStr);
        System.out.println("Integer Value = " + value1);
        System.out.println("Double Value = " + value2);
    }
}