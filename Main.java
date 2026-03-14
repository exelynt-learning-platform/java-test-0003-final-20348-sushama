public class Main {

    private static final int ROWS = 6;

    public static void main(String[] args) {

        for(int i = 1; i <= ROWS; i++) {

            for(int j = 1; j <= i; j++) {

                int value = (i + j) % 2;

                System.out.print(value + " ");
            }

            System.out.println();
        }
    }
}
