// Main Class
public class InvalidAgeProtector {

    // Method to check eligibility
    public static void checkEligibility(int age)
            throws InvalidAgeException {

        if (age < 18) {
            throw new InvalidAgeException(
                    "You are not eligible to vote. Age must be 18 or above."
            );
        }

        System.out.println("You are eligible to vote.");
    }

    // Main method
    public static void main(String[] args) {

        int age = 16; // Example age

        try {
            checkEligibility(age);
        }
        catch (InvalidAgeException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}