import java.util.List;

public interface IFiniteAutomata {

  AutomataState process(String inputString);

  boolean accepts(String inputString);

  List<AutomataState> states();

  Alphabet alphabet();

  TransitionFunction transitionFunction();

  AutomataState initialState();

  List<AutomataState> acceptStates();

}
