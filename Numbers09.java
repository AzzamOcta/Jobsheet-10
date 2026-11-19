import java.util.Arrays;

public class Numbers09 {
    public static void main(String[] args) {
        int[][] myNumbers = new int[3][];

        myNumbers[0] = new int[7];
        myNumbers[1] = new int[3];
        myNumbers[2] = new int[1];

        int[][] salinan = myNumbers; 
        salinan[0][0] = 99; 
        System.out.println(myNumbers[0][0]);
        
        System.out.println(myNumbers.length + ", " + myNumbers[0].length);

        for (int i = 0; i < myNumbers.length; i++) {
            System.out.println(Arrays.deepToString(myNumbers));
        }

        for (int i = 0; i < myNumbers.length; i++) {
            System.out.println("Panjang baris ke-" + (i + 1) + ": " + myNumbers [i]. length);
        }

    }
}
