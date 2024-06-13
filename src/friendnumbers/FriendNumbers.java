package friendnumbers;

public class FriendNumbers {

    public static boolean areFriens(int x, int y) {
        boolean control = false;
        int sumOfX = 0;
        int sumOfY = 0;
        for (int i = 1; i < x; i++) {
            if (x % i == 0) {
                sumOfX += i;
            }
        }
        for (int i = 1; i < y; i++) {
            if (y % i == 0) {
                sumOfY += i;
            }
        }
        if (sumOfX == y && sumOfY == x) {
            control = true;
        }
        return control;
    }

    public static void main(String[] args) {

    }

}
