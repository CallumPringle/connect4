import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	String[][] grid = new String[8][8];
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid.length; j++) {
                grid[i][j] = "0";
            }

        }
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid.length; j++) {
                System.out.println(grid[i][j]);
            }}
    }
}
