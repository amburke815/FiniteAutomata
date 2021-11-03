import java.util.Arrays;
import java.util.Scanner;
import javax.swing.tree.TreeNode;

/** 
 *         --1-->
 * M1: (q0)       ((q1))
 *         <--0--
 */
public class Main {
  public static void main(String [] args) {
    Set<AutomataState> M1States = new Set<AutomataState>(
        Arrays.asList(
            new AutomataState("q0", 0, false),
            new AutomataState("q1", 1, true)
        )
    );
    Alphabet M1Alphabet = new Alphabet(new Set<Character>('0', '1'));
    TransitionFunction M1TransitionFunction = new M1TransitionFunction();
    AutomataState M1InitialState = M1States.get(0);
    Set<AutomataState> M1AcceptStates = new Set<AutomataState>(M1States.get(1));

    IFiniteAutomata M1 = new DeterministicFiniteAutomata(
        M1States, M1Alphabet, M1TransitionFunction, M1InitialState, M1AcceptStates);

    Scanner s = new Scanner(System.in);
    while (s.hasNext()) {
      String inp = s.next();
      boolean validInput = true;
      for(char c : inp.toCharArray()) {
        validInput &= M1Alphabet.getMembers().contains(c);
      }
      if (!validInput) {
        System.out.println("invalid input, must contain only alphabet members: " + M1Alphabet);
        s.next();
      }
      String messageToUser = M1.accepts(inp) ?
          "M1 accepts the input " + inp + ". Finished in state " + M1.process(inp) :
          "M1 rejects the input " + inp + ". Finished in state " + M1.process(inp);

      System.out.println(messageToUser);
    }
  }
}
