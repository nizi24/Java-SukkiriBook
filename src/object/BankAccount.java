package object;

public class BankAccount {
  String accountNumber;
  int balance;
  
  public BankAccount(String accountNumber, int balance) {
    this.accountNumber = accountNumber;
    this.balance = balance;
  }
  
  public String toString() {
    return "¥" + this.balance + "(口座番号:" + this.accountNumber + ")";
  }
  
  public boolean equals(BankAccount otherAccount) {
    String number = this.accountNumber.trim();
    if (number.equals(otherAccount.accountNumber)) {
      return true;
    } else {
      return false;
    }
  }
  
  public static void main(String[] args) {
    BankAccount a = new BankAccount("4649", 1592);
    System.out.println(a);
    BankAccount b = new BankAccount("4649", 1111);
    if (a.equals(b)) {
      System.out.println("等価です");
    }
  }
}