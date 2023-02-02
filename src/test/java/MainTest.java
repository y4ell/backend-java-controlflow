import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import java.io.PrintStream;
import org.junit.jupiter.api.Test;

public class MainTest {

  @Test
  public void testA_IfStatement() {
    PrintStream mockedPrintStream = mock(PrintStream.class);
    System.setOut(mockedPrintStream);
    A_IfStatements.main(new String[]{});
    verify(mockedPrintStream).println("Even");
    verify(mockedPrintStream).println("Te betalen: 116.4795");
    verify(mockedPrintStream).println("10 > 8");
  }

  @Test
  public void testB_WhileLoops() {
    PrintStream mockedPrintStream = mock(PrintStream.class);
    System.setOut(mockedPrintStream);
    B_WhileLoops.main(new String[]{});
    verify(mockedPrintStream).println(1);
    verify(mockedPrintStream).println(2);
    verify(mockedPrintStream).println(3);
    verify(mockedPrintStream, times(2)).println(4);
    verify(mockedPrintStream).println(5);
    verify(mockedPrintStream).println(6);
    verify(mockedPrintStream).println(7);
    verify(mockedPrintStream).println(8);
    verify(mockedPrintStream).println(9);
    verify(mockedPrintStream).println(10);
    verify(mockedPrintStream).println("Size = 20 x 3");
    verify(mockedPrintStream).println("Size = 19 x 2");
    verify(mockedPrintStream).println("Size = 18 x 1");
  }

  @Test
  public void testC_ForLoops() {
    PrintStream mockedPrintStream = mock(PrintStream.class);
    System.setOut(mockedPrintStream);
    C_ForLoops.main(new String[]{});
    verify(mockedPrintStream, times(3)).println(3);
    verify(mockedPrintStream, times(4)).println(2);
    verify(mockedPrintStream).println(1);
    verify(mockedPrintStream).println("Lift off!");
    verify(mockedPrintStream).println('a');
    verify(mockedPrintStream).println('b');
    verify(mockedPrintStream).println('c');
    verify(mockedPrintStream).println('d');
    verify(mockedPrintStream).println('e');
    verify(mockedPrintStream).println('f');
    verify(mockedPrintStream).println('g');
    verify(mockedPrintStream).println('h');
    verify(mockedPrintStream).println('i');
    verify(mockedPrintStream).println('j');
    verify(mockedPrintStream).println('k');
    verify(mockedPrintStream).println('l');
    verify(mockedPrintStream).println('m');
    verify(mockedPrintStream).println('n');
    verify(mockedPrintStream).println('o');
    verify(mockedPrintStream).println('p');
    verify(mockedPrintStream).println('q');
    verify(mockedPrintStream).println('r');
    verify(mockedPrintStream).println('s');
    verify(mockedPrintStream).println('t');
    verify(mockedPrintStream).println('u');
    verify(mockedPrintStream).println('v');
    verify(mockedPrintStream).println('w');
    verify(mockedPrintStream).println('x');
    verify(mockedPrintStream).println('y');
    verify(mockedPrintStream).println('z');
    verify(mockedPrintStream).println('A');
    verify(mockedPrintStream).println('B');
    verify(mockedPrintStream).println('C');
    verify(mockedPrintStream).println('D');
    verify(mockedPrintStream).println('E');
    verify(mockedPrintStream).println('F');
    verify(mockedPrintStream).println('G');
    verify(mockedPrintStream).println('H');
    verify(mockedPrintStream).println('I');
    verify(mockedPrintStream).println('J');
    verify(mockedPrintStream).println('K');
    verify(mockedPrintStream).println('L');
    verify(mockedPrintStream).println('M');
    verify(mockedPrintStream).println('N');
    verify(mockedPrintStream).println('O');
    verify(mockedPrintStream).println('P');
    verify(mockedPrintStream).println('Q');
    verify(mockedPrintStream).println('R');
    verify(mockedPrintStream).println('S');
    verify(mockedPrintStream).println('T');
    verify(mockedPrintStream).println('U');
    verify(mockedPrintStream).println('V');
    verify(mockedPrintStream).println('W');
    verify(mockedPrintStream).println('X');
    verify(mockedPrintStream).println('Y');
    verify(mockedPrintStream).println('Z');
    verify(mockedPrintStream).println(4);
    verify(mockedPrintStream).println(6);
    verify(mockedPrintStream).println(8);
    verify(mockedPrintStream).println(0);
    verify(mockedPrintStream).println(9);
  }


  @Test
  public void testD_SwitchStatements() {
    PrintStream mockedPrintStream = mock(PrintStream.class);
    System.setOut(mockedPrintStream);
    D_SwitchStatements.main(new String[]{});
    verify(mockedPrintStream).println("=one");
    verify(mockedPrintStream).println("PepsiCo");
  }

  @Test
  public void bonus() {
    PrintStream mockedPrintStream = mock(PrintStream.class);
    System.setOut(mockedPrintStream);
    E_Combining_Bonus.main(new String[]{});
    verify(mockedPrintStream, times(3)).println(4);
    verify(mockedPrintStream, times(2)).println(2);
    verify(mockedPrintStream).println(6);
    verify(mockedPrintStream).println(52);
    verify(mockedPrintStream).println(178);
    verify(mockedPrintStream).println(14);
    verify(mockedPrintStream).println(406);
  }
}
