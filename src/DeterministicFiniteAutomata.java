import java.util.List;

public class DeterministicFiniteAutomata implements IFiniteAutomata {

  private final List<AutomataState> Q;
  private final Alphabet Σ;
  private final TransitionFunction δ;
  private final AutomataState q0;
  private final List<AutomataState> F;

  //TODO: enforce this
  ////INVARIANT: the transition function is deterministic --> maps each state to another and has
  //// exactly one outbound arrow for each σ in Σ
  public DeterministicFiniteAutomata(List<AutomataState> Q, Alphabet Σ, TransitionFunction δ,
      AutomataState q0, List<AutomataState> F) {
    this.Q = Q;
    this.Σ = Σ;
    this.δ = δ;
    this.q0 = q0;
    this.F = F;
  }

  public  TransitionFunction tf = (x, y) ->
  {
    return null;
  };

  @Override
  public AutomataState process(String inputString) {
    AutomataState currentState = q0;
    for(char c : inputString.toCharArray()) {
      currentState = δ.apply(currentState, c);
    }
    return currentState;
  }

  @Override
  public boolean accepts(String inputString) {
    return F.contains(process(inputString));
  }

  @Override
  public List<AutomataState> states() {
    return Q;
  }

  @Override
  public Alphabet alphabet() {
    return Σ;
  }

  @Override
  public TransitionFunction transitionFunction() {
    return δ;
  }

  @Override
  public AutomataState initialState() {
    return q0;
  }

  @Override
  public List<AutomataState> acceptStates() {
    return F;
  }
}
