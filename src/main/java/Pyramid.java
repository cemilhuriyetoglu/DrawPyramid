public class Pyramid {

    public static void drawPyramid(int lineCount) {

        for (int i = 1; i <= lineCount; i++) {

            for (int s = 1; s <= lineCount - i; s++) {
                System.out.print(" ");
            }

            for (int a = 1; a < 2 * i; a++) {

                System.out.print("*");
            }
            System.out.print("\n");

        }
    }
}






