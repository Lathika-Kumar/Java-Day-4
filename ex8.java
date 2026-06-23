package kce;

import java.util.Scanner;
class InvalidAge extends Exception {
    InvalidAge(String msg) {
        super(msg);
    }
}
public class ex8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        try {
            if (age < 18) {
                throw new InvalidAge("Age should be 18 and above");
            }
            System.out.println("Eligible for registration");
        } catch (InvalidAge e) {

            System.out.println(e.getMessage());
        }
        sc.close();
    }
}