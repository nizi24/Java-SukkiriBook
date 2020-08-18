package zissen;

public class Launcher {
  public static void main(String[] args) {
    String fqcn = args[0];
    String controlStr = args[1];
    Runtime runtime = Runtime.getRuntime();
    long currentMemory = runtime.totalMemory() - runtime.freeMemory();
    System.out.println("現在の使用メモリ:" + (currentMemory /1024 / 1024) + "MB");
  }
}