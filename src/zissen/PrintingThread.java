package zissen;
import java.util.*;

public class PrintingThread extends Thread {
  public synchronized void run() {
    for (int i = 0; i < 10; i++) {
      System.out.print(i);
    }
  }
  
  public static void main(String[] args) {
    System.out.println("なにか入力してください");
    Thread t = new PrintingThread();
    t.start();
    new Scanner(System.in).hasNextLine();
  }
}