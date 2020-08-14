public class Calc {
  public static void main(String[] args) {
    int a = 10; int b = 2;
    int total = CalcLogic.add(a, b);
    int delta = CalcLogic.sub(a, b);
    System.out.println("足すと" + total + "、引くと" + delta);
  }
}