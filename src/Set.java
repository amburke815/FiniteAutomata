import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class Set<X> {
  private final List<X> members;

  // INVARIANT: sets do not contain duplicate members. This class lets me mimic Java's
  // Set<T> and HashSet<T> while still indexing elements
  public Set(List<X> members) {
    if (containsDuplicates(members)) {
      throw new IllegalArgumentException("contains duplicates, try again"); // TODO handle this better
    }
    this.members = members;
  }

  public Set(X... members) {
    this(Arrays.asList(members));
  }

  public X get(int idx) {
    return members.get(idx);
  }

  public int size() {
    return members.size();
  }

  public void add(X toAdd) {
    if (members.contains(toAdd)) {
      return;
    }

    members.add(toAdd);
  }

  public List<X> getMembers() {
    return this.members;
  }

  public boolean contains(X containsMe) {
    boolean contained = false;

    for (X x : members) {
      contained |= x.equals(containsMe);
    }

    return contained;
  }

  private static <X> boolean containsDuplicates(List<X> toTest) {
    return new HashSet<>(toTest).size() !=  toTest.size();
  }

}
