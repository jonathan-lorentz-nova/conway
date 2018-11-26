import java.awt.*;
import java.awt.event.*;

public class display extends Frame {
   private static final long serialVersionUID = 1L;
   private int size;
   private int rowCount;
   private boolean grid[][];
   
   public display(int size, int rowCount) {
      super("test");
      pack();
      setResizable(false);
      this.size = size;
      this.rowCount = rowCount;
      grid = new boolean[rowCount][rowCount];
      setSize(size, size);
      setVisible(true);
      addWindowListener(new WindowAdapter() { public void windowClosing(WindowEvent e) {dispose(); System.exit(0);} });
   }
   
   public void setGrid(boolean inGrid[][]) {
      grid = inGrid;
   }
   
   public void paint(Graphics g) {
      Graphics2D g2d = (Graphics2D)g;
      g2d.setColor(Color.black);
      g2d.fillRect(0, 0, size, size);
      int increment = size/rowCount;
      g2d.setColor(Color.white);
      for(int i = 0; i < rowCount; ++i) {
         for(int j = 0; j < rowCount; ++j) {
            if(grid[i][j]) {
               int x_coord = i*increment;
               int y_coord = j*increment;
               g2d.fillRect(x_coord, y_coord, increment, increment);
            }
         }
      } 
   }
}