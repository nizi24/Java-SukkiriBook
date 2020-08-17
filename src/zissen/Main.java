package zissen;

public class Main {
  public static void main(String[] args) {
    Func1 isOdd = FuncList::isOdd;
    System.out.println(isOdd.call(3));
    FuncList funcList = new FuncList();
    Func2 addNamePrefix = funcList::addNamePrefix;
    System.out.println(addNamePrefix.call(true, "ミナト"));
    
    Func1 func1 = x -> x % 2 == 1;
    Func2 func2 = (male, name) -> {
      if (male) { return "Mr." + name; }
      return "Ms." + name;
    };
    System.out.println(func1.call(4));
    System.out.println(addNamePrefix.call(false, "アサカ"));
  }
}