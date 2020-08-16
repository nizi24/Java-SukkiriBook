package object;
import java.util.*;

public class Collection {
  public static void main(String[] args) {
    List<Integer> integerList = new ArrayList<>();
    integerList.add(10);
    integerList.add(20);
    integerList.add(30);
    for (int i : integerList) {
      System.out.println(i);
    }
    System.out.println(integerList.size());
    integerList.remove(0);
    System.out.println(integerList.size());
    
    Iterator i = integerList.iterator();
    while (i.hasNext()) {
      System.out.println(i.next());
    }
    HashMap<Integer, String> hash = new HashMap<>();
    hash.put(1, "あ");
    hash.put(2, "い");
    HashMap<Integer, String> hash2 = new HashMap<>();
    hash2.put(1, "か");
    hash2.put(2, "き");
    for (int key : hash.keySet()) {
      System.out.println(hash.get(key));
    }
    
    List<HashMap> hashList = new ArrayList<>();
    hashList.add(hash);
    hashList.add(hash2);
    for (HashMap h : hashList) {
      System.out.println(h.get(1));
    }
  }
}