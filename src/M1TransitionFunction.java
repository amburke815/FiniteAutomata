import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class M1TransitionFunction implements TransitionFunction {

  private final Set<AutomataState> M1States = new Set<AutomataState>(
      Arrays.asList(
          new AutomataState("q0", 0, false),
          new AutomataState("q1", 1, true)
      )
  );
  // TODO: see if you can implement the transition function using a hashmap or some
  // combination of data structures that yield a well-defined function of
  @Override
  public AutomataState apply(AutomataState automataState, Character character) {
    if (automataState.getIdentifier().equals("q0")) {
      return character == '0' ? M1States.get(0) : M1States.get(1);
    }
    else {
      return character == '0' ? M1States.get(1) : M1States.get(0);
    }
  }
}
