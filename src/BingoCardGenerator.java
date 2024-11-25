import java.util.ArrayList;
import java.util.Random;

public class BingoCardGenerator {

    private static String[][] generateCard() {
        Random r = new Random();
        String[][] bingoCard = new String[5][5];
        ArrayList<Integer> bingoTemp = new ArrayList<>();
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
        return bingoCard;
    }
    public static void main(String[] args) {

        String[][] bingoCard = generateCard();

        for (int x = 0; x < bingoCard.length; x++) {
            for (int y = 0; y < bingoCard.length; y++) {
                    System.out.printf("%4s", bingoCard[x][y]);
            }
            System.out.println();
        }

    }
}
