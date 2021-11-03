import java.util.List;

public interface IFiniteAutomata {

  AutomataState process(String inputString);

  boolean accepts(String inputString);

  Set<AutomataState> states();

  Alphabet alphabet();

  TransitionFunction transitionFunction();

  AutomataState initialState();

  Set<AutomataState> acceptStates();

}
