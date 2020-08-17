package zissen;

public class StringProcess {
  public static void main(String[] args) {
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < 1000; i++) {
      sb.append("Java").append("SQL");
    }
    String s = sb.toString();
    System.out.print(s);
  }
}