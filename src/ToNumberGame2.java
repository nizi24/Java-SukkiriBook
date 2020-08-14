public class ToNumberGame2 {
  public static void main(String[] args) {
    int[] numbers = { 3, 4, 9 };
    System.out.println("1桁の数字を入力してください");
    int input = new java.util.Scanner(System.in).nextInt();
    boolean correct = false;
    for (int value : numbers) {
      if (value == input) {
        correct = true;
        break;
      }
    }
    if (correct) {
      System.out.println("アタリ！");
    } else {
      System.out.println("ハズレ!");
    }
  }
}