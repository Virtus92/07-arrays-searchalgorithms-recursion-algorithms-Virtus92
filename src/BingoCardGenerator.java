import java.util.ArrayList;
import java.util.Random;

public class BingoCardGenerator {

    private static void generateCard(ArrayList bingoTemp, String[][] bingoCard) {
        Random r = new Random();
        int[] intervals = {16, 31, 46, 61, 76};
        int start = 1;

        for (int end : intervals) {
            for (int i = 0; i < 5; i++) {
                int num;
                do {
                    num = r.nextInt(start, end);
                } while (bingoTemp.contains(num));
                bingoTemp.add(num);
            }
            start = end;
        }
        bingoTemp.sort(null);

        int counter = 0;
        for (int i = 0; i < bingoCard[0].length; i++) {
            for (int j = 0; j < bingoCard.length; j++) {
                if (i == 2 && j == 2) {
                    bingoCard[j][i] = " ";
                } else {
                    bingoCard[j][i] = String.valueOf(bingoTemp.get(counter));
                    counter++;
                }
            }
        }
    }
    public static void main(String[] args) {
        String[][] bingoCard = new String[5][5];
        ArrayList<Integer> bingoTemp = new ArrayList<>();

        generateCard(bingoTemp, bingoCard);

        for (int x = 0; x < bingoCard.length; x++) {
            for (int y = 0; y < bingoCard.length; y++) {
                if (x == 2 && y == 2) {
                    System.out.printf("%4s", " ");
                } else {
                    System.out.printf("%4s", bingoCard[x][y]);
                }
            }
            System.out.println();
        }

    }
}
