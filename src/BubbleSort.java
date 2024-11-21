import java.util.Random;

public class BubbleSort {
    public static void main(String[] args) {
        Random r = new Random();
        int[] toSort = new int[10];

        System.out.println("Ungeordnete Liste: ");
        for (int i=0; i< toSort.length; i++) {
            toSort[i] = r.nextInt(100);
            System.out.printf("%3d", toSort[i]);
        }

        System.out.println("\n Geordnete Liste: ");
        for (int i=0; i<toSort.length; i++) {
            for (int j=0; j<toSort.length-1; j++) {
                if (toSort[j] > toSort[j+1]) {
                    int temp = toSort[j+1];
                    toSort[j+1] = toSort[j];
                    toSort[j] = temp;
                }
            }
        }

        for (int i=0; i< toSort.length; i++) {
            System.out.printf("%3d", toSort[i]);
        }

    }
}
