public class FirstTimeMethod {
  public static void main(String[] args) {
    hello("アイウエオ");
    System.out.println(add(num1(), add(50, 60)));
  }
  public static void hello(String name) {
    System.out.println(name + "さん、こんにちは");
  }
  public static int add(int num1, int num2) {
   int sum = num1 + num2;
   return sum;
  }
  public static int num1() {
    return 100;
  }
}