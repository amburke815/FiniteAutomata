public class AutomataState {

  private final String identifier;
  private final int index;
  private final boolean isAcceptState;


  public AutomataState(String identifier, int index, boolean isAcceptState) {
    this.identifier = identifier;
    this.index = index;
    this.isAcceptState = isAcceptState;
  }

}
