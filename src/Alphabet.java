

public class Alphabet {
  private final Set<Character> members;

  public Alphabet(Set<Character> members) {
    this.members = members;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }

    if (!(o instanceof Alphabet)) {
      return false;
    }

    Alphabet anotherAlphabet = (Alphabet) o;

    if (this.members.size() != anotherAlphabet.members.size()) {
      return false;
    }

    boolean sameAlphabet = true;
    for (int i = 0; i < this.members.size(); i++) {
      sameAlphabet &= this.members.get(i).equals(anotherAlphabet.members.get(i));
    }

    return sameAlphabet;
  }

  @Override
  public String toString() {
    String toStringed = "{";

    for (int i = 0; i < members.size() - 1; i++) {
      toStringed += members.get(i).toString() + ",";
    }

    return toStringed + members.get(members.size() - 1) + "}";
  }

  public Set<Character> getMembers() {
    return members;
  }
}
