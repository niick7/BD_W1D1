package w1d1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Mapper {
  List<Pair> pairs;
  public Mapper() {
    this.pairs = new ArrayList<>();
  }

  public void addPairFromKey(String key) {
    Pair pair = new Pair(key.toLowerCase());
    pairs.add(pair);
  }

  @Override
  public String toString() {
    String str = "";
    Collections.sort(pairs, (x, y) -> x.compareTo(y));
    for(Pair p : pairs) {
      str += p;
    }
    return str;
  }
}
