
import java.util.LinkedHashSet;
import java.util.SequencedCollection;

class SequencedCollectionSample {

  public static void main(String[] args) {
    SequencedCollection<String> sc = new LinkedHashSet<>();
    sc.add("First");
    sc.add("Second");
    sc.add("First");
    System.out.println(sc);
  }

}

