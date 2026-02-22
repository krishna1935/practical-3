public class OddNumbers {
    public static void main(String[] args) {

        int sum = 0;
        int count = 0;

        System.out.println("Odd numbers between 1 to 50:");

        // Print odd numbers
        for (int i = 1; i <= 50; i += 2) {
            System.out.print(i + " ");
            sum += i;
            count++;
        }

        // Minimum three odd numbers
        System.out.println("\n\nThree Minimum Odd Numbers: 1, 3, 5");

        // Maximum three odd numbers
        System.out.println("Three Maximum Odd Numbers: 45, 47, 49");

        // Average calculation
        double average = (double) sum / count;
        System.out.println("Average of Odd Numbers: " + average);
    }
}
