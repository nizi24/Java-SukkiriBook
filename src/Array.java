public class Array {
  public static void main(String[] args) {
    int[] numbers = new int[5];
    for (int i = 0; i < numbers.length; i++) {
      System.out.println(numbers[i]);
    }
    int[] numbers2 = { 20, 30, 40, 50, 60 };
    int sum = 0;
    for (int i = 0; i < numbers2.length; i++) {
      System.out.println(numbers2[i]);
      sum += numbers2[i];
    }
    System.out.println(sum);
  }
}