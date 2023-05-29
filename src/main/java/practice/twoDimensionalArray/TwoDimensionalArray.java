package practice.twoDimensionalArray;

public class TwoDimensionalArray {

    public static final char SYMBOL = 'X';

    public static char[][] getTwoDimensionalArray(int size) {
        char[][] figureIks = new char[size][size];
        int value = size - 1;
        for (int x = 0; x < size; x++) {
            for (int y = 0; y < size; y++) {
                if (y == x || y == value) {
                    figureIks[x][y] = SYMBOL;
                } else {
                    figureIks[x][y] = ' ';
                }
            }
            value = value - 1;
        }
        return figureIks;
    }
}
