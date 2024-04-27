public class OddIntegersProduct {
    public static void main(String[] args) {
        int product = 1; 

        for (int i = 1; i <= 15; i++) {
            // Check if the number is odd
            if (i % 2 != 0) {
                product *= i; 
            }
        }

        // Print the product of the odd integers
        System.out.println("Product of odd integers from 1 to 15: " + product);
    }
}
