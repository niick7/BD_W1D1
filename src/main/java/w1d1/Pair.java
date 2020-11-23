package w1d1;

public class Pair {
  String key;
  int value = 1;

  public Pair(String key) {
    this.key = key;
  }

  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public int getValue() {
    return value;
  }

  public int compareTo(Pair p) {
    return this.key.toLowerCase().compareTo(p.key.toLowerCase());
  }

  @Override
  public String toString() {
    return "(" + key + ", " + value +")\n";
  }
}
