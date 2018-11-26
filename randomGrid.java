import java.util.Random;

public class randomGrid {
   Random randomDevice = new Random();
   public boolean[][] fillRandom(int size) {
      boolean grid[][] = new boolean[size][size];
      for(int i = 0; i < size; ++i) {
         for(int j = 0; j < size; ++j) {
            grid[i][j] = randomDevice.nextBoolean();
         }
      }
      return grid;
   }
}