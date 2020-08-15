package object;

public class Main {
  public static void main(String[] args) {
    Hero h = new Hero("ミナト");
    System.out.println(h.name + "を生み出しました!");
    h.sleep();
    Hero h2 = new Hero();
    System.out.println(h2.name);
  }
}