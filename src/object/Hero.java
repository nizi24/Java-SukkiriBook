package object;

public class Hero {
  String name;
  int hp;
  
  public void sleep() {
    this.hp = 100;
    System.out.println(this.name + "は、眠って回復した！");
  }
  public Hero() {
    this("仮");
  }
  public Hero(String name) {
    this.hp = 100;
    this.name = name;
  }
}