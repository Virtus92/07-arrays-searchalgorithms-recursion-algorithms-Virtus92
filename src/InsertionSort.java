import java.util.Random;

public class InsertionSort {
    static Random r = new Random();

    public static void main(String[] args) {
        int[] chaos = new int[10];

        randomizeList(chaos);

        System.out.println("Unsortierte Liste:");
        print(chaos);

        System.out.println("\n\nSortierte Liste: ");
        sortList(chaos);
        print(chaos);
    }

    private static void randomizeList(int[] chaos) {
        for (int i = 0; i < chaos.length; i++) {
            chaos[i] = r.nextInt(100);
        }
    }

    private static void sortList(int[] chaos) {
        int temp;
        for (int i = 1; i < chaos.length; i++) {
            int j = i;
            temp = chaos[i];
            while (j > 0 && chaos[j - 1] > temp) {
                chaos[j] = chaos[j - 1];
                j--;
            }
            chaos[j] = temp;
        }
    }

    private static void print(int[] chaos) {
        for (int i = 0; i < chaos.length; i++) {
            System.out.printf("%4d", chaos[i]);
        }
    }
}
