import java.util.List;

public class DeterministicFiniteAutomata implements IFiniteAutomata {

  private final Set<AutomataState> Q;
  private final Alphabet Σ;
  private final TransitionFunction δ;
  private final AutomataState q0;
  private final Set<AutomataState> F;

  //TODO: enforce this
  ////INVARIANT: the transition function is deterministic --> maps each state to another and has
  //// exactly one outbound arrow for each σ in Σ
  public DeterministicFiniteAutomata(Set<AutomataState> Q, Alphabet Σ, TransitionFunction δ,
      AutomataState q0, Set<AutomataState> F) {
    this.Q = Q;
    this.Σ = Σ;
    this.δ = δ;
    this.q0 = q0;
    // INVARIANT: q0 is a member of Q
    if (!Q.contains(q0))
      Q.add(q0);

    this.F = F;
  }

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
    return process(inputString).isAcceptState();
  }

  @Override
  public Set<AutomataState> states() {
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
  public Set<AutomataState> acceptStates() {
    return F;
  }
}
