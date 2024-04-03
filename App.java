// Source code is decompiled from a .class file using FernFlower decompiler.
import java.awt.Component;
import javax.swing.JFrame;

public class App {
   public App() {
   }

   public static void main(String[] args) throws Exception {
      int boardwidth = 600;
      int boardheight = 600;
      JFrame frame = new JFrame("Snake");
      frame.setVisible(true);
      frame.setSize(boardwidth, boardheight);
      frame.setLocationRelativeTo((Component)null);
      frame.setResizable(false);
      frame.setDefaultCloseOperation(3);
      SnakeGame snakeGame = new SnakeGame(boardwidth, boardheight);
      frame.add(snakeGame);
      frame.pack();
      snakeGame.requestFocus();
   }
}
