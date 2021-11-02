import java.util.function.BiFunction;

public interface TransitionFunction extends BiFunction<AutomataState, Character, AutomataState> {

  @Override
  AutomataState apply(AutomataState automataState, Character character);

}
