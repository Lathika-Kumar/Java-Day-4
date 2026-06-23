package kce;

public class ex10 {

    public static void main(String[] args) {

        String rollNo = "101";
        String age = "19";
        String mobile = "9876543210";
        String cgpa = "8.7";
        char section = 'A';

        try {

            int roll = Integer.parseInt(rollNo);

            int ageValue = Integer.parseInt(age);

            double cgpaValue = Double.parseDouble(cgpa);

            boolean isLetter = Character.isLetter(section);

            boolean mobileValid = true;

            for (int i = 0; i < mobile.length(); i++) {

                if (!Character.isDigit(mobile.charAt(i))) {
                    mobileValid = false;
                    break;
                }
            }

            char lower = Character.toLowerCase(section);

            char upper = Character.toUpperCase(section);

            String ageString = Integer.toString(ageValue);

            System.out.println("Roll No: " + roll);
            System.out.println("Age: " + ageString);
            System.out.println("CGPA: " + cgpaValue);
            System.out.println("Section is Letter: " + isLetter);
            System.out.println("Mobile Number Valid: " + mobileValid);
            System.out.println("Lowercase Section: " + lower);
            System.out.println("Uppercase Section: " + upper);

            if (isLetter && mobileValid) {
                System.out.println("Student Details Valid");
            } else {
                System.out.println("Student Details Invalid");
            }

        } catch (NumberFormatException e) {

            System.out.println("Invalid number conversion");
        }
    }
}