public class displayTest {
   public static void main(String[] args) {
      int rowCount = 30;
      int windowSize = 600;
      int simulationMillisTicks = 100;
      
      display Display = new display(windowSize, rowCount);
      
      randomGrid Grid = new randomGrid();
      
      for(int ticks = 0; ticks < 10000; ++ticks) {
         long start = System.currentTimeMillis();
         
         Display.setGrid(Grid.fillRandom(rowCount));

         long end = System.currentTimeMillis();
         long pause = simulationMillisTicks - (end - start);
         Display.repaint();

         if(pause > 0) {
            try {
               Thread.sleep(pause);
            } catch (InterruptedException e) {
               return;
            }
         }
         System.out.println("step");
      }
   }
}