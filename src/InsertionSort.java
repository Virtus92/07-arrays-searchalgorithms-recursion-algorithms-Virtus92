import java.util.Random;

public class InsertionSort {
    public static void main(String[] args) {
        Random r = new Random();
        int[] chaos = new int[10];

        for (int i = 0; i < chaos.length; i++) {
            chaos[i] = r.nextInt(100);
        }


        System.out.println("Unsortierte Liste: ");
        for (int chao : chaos) {
            System.out.printf("%4d", chao);
        }

        System.out.println("\n\nSortierte Liste: ");
        for (int i = 0; i < chaos.length; i++) {
            for (int j = 0; j < chaos.length - 1; j++) {
                if (chaos[j] > chaos[j + 1]) {
                    int temp = chaos[j+1];
                    chaos[j+1] = chaos[j];
                    chaos[j] = temp;
                }
            }
        }
        for (int i = 0; i < chaos.length; i++) {
            System.out.printf("%4d", chaos[i]);
        }

    }
}
