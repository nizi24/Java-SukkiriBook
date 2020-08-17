package zissen;

public class StrongBox<E> {
  private E content;
  KeyType keyType;
  int trialTime;
  public E get() {
    this.trialTime++;
    int requiredTime = 0;
    switch (keyType) {
    case PADLOCK:
      requiredTime = 1024;
      break;
    case BUTTON:
      requiredTime = 10000;
      break;
    case DIAL:
      requiredTime = 30000;
      break;
    case FINGER:
      requiredTime = 1000000;
      break;
    }
    if (requiredTime <= trialTime) {
      return this.content;
    }
    return null;
  }
  public void set(E content) {
    this.content = content;
  }
  public StrongBox(KeyType keyType) {
    this.trialTime = 0;
    this.keyType = keyType;
  }
}