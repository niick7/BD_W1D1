package w1d1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Application {
  public static void main(String[] args) {
    Pairs pairs = new Pairs();
    List<String> words = new ArrayList<String>();
    try {
      File file = new File("testDataForW1D1.txt");
      Scanner scanner = new Scanner(file);
      while(scanner.hasNext()) {
        String line = scanner.nextLine();
        List<String> wordsInLine = Arrays.asList(line.split("[\\s-]+"));
        for(String word : wordsInLine) {
          word = trimWord(word);
          if(isWord(word))
            pairs.addPairFromKey(word);
        }
      }
      System.out.println(pairs);
    }
    catch(FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
  }

  public static String trimWord(String word) {
    word = word.replace(",", "");
    word = word.replace(".", "");
    word = word.replace("\"", "");
    return word;
  }

  public static boolean isWord(String word){
    if (word.equals(null) || "".equals(word) || Pattern.compile("[0-9]|_").matcher(word).find())
      return false;
    return true;
  }
}
