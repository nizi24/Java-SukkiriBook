public class Methods {
  public static void main(String[] args) {
    introduceOneself();
    email("こんにちは", "test@example.com", "はじめまして!");
    email("test2@example.com", "こんにちは");
    System.out.println(calcTriangleArea(20.2, 16.3));
    System.out.println(calcCircleArea(328.3));
  }
  public static void introduceOneself() {
    String name = "太郎";
    int age = 22;
    double height = 174.5;
    char zodiac = '寅';
    System.out.println(name + "です。");
    System.out.println(age + "歳です。");
    System.out.println(height + "cmです");
    System.out.println("十二支は" + zodiac + "です");
  }
  public static void email(String title, String address, String text) {
    System.out.println(address + "に、以下のメールを送信しました");
    System.out.println("件名:" + title);
    System.out.println("本文:" + text);
  }
  public static void email(String address, String text) {
    System.out.println(address + "に、以下のメールを送信しました");
    System.out.println("件名:無題");
    System.out.println("本文:" + text);
  }
  public static double calcTriangleArea(double bottom, double height) {
    double area = bottom * height / 2;
    return area;
  }
  public static double calcCircleArea(double radius) {
    double area = radius * radius * 3.14;
    return area;
  }
}