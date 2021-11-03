public class AutomataState {

  private final String identifier;
  private final int index;
  private final boolean isAcceptState;


  public AutomataState(String identifier, int index, boolean isAcceptState) {
    this.identifier = identifier;
    this.index = index;
    this.isAcceptState = isAcceptState;
  }

  public String getIdentifier() {
    return identifier;
  }

  public int getIndex() {
    return index;
  }

  public boolean isAcceptState() {
    return isAcceptState;
  }

  @Override
  public String toString() {
    return identifier;
  }
}
