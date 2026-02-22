public class FullPyramid {
    public static void main(String[] args) {

        // ===== Pattern 1: Full Star Pyramid =====
        int rows = 5;

        for (int i = 1; i <= rows; i++) {

            // spaces
            for (int j = i; j < rows; j++) {
                System.out.print(" ");
            }

            // stars
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }

            System.out.println();
        }
        // ===== Pattern 2: Alphabet Inverted Pyramid =====
        for (int i = rows; i >= 1; i--) {

            // spaces
            for (int s = rows; s > i; s--) {
                System.out.print(" ");
            }

            char ch = 'A';

            // alphabets
            for (int j = 1; j <= i; j++) {
                System.out.print(ch + " ");
                ch++;
            }

            System.out.println();
        }
    }
}
