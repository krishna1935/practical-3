public class Pyramid {
    public static void main(String[] args) {

        // ===== Pattern 1: Number Pyramid =====
        int rows = 5;
        int num = 1;

        for (int i = 1; i <= rows; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num++;

                // Reset after 9
                if (num == 10) {
                    num = 1;
                }
            }
            System.out.println();
        }
        // ===== Pattern 2: Inverted Star Pyramid =====
        int starRows = 6;

        for (int i = starRows; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
