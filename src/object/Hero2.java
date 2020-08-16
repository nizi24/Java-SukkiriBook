package object;
import java.util.*;

public class Hero2 {
  private String name;
  private int subjugations;
  public String getName() { return this.name; }
  public void setName(String name) { this.name = name; }
  public void setSubjugations(int subjugations) { this.subjugations = subjugations; }
  public int getSubjugations() { return this.subjugations; }
  public Hero2(String name, int subjugations) {
    this.name = name;
  }
  
  public static void main(String[] args) {
    Hero2 h1 = new Hero2("斎藤", 3);
    Hero2 h2 = new Hero2("鈴木", 7);
    List<Hero2> heros = new ArrayList<>();
    heros.add(h1);
    heros.add(h2);
    for (Hero2 h : heros) {
      System.out.println(h.getName());
    }
  }
}