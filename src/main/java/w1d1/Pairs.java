package w1d1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Pairs {
  List<Pair> pairs;
  List<String> wordsInLowerCase;
  public Pairs() {
    this.pairs = new ArrayList<Pair>();
    this.wordsInLowerCase = new ArrayList<String>();
  }

  public void addPairFromKey(String key) {
    if (!wordsInLowerCase.contains(key.toLowerCase())) {
      wordsInLowerCase.add(key.toLowerCase());
      Pair pair = new Pair(key);
      pairs.add(pair);
    }
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
