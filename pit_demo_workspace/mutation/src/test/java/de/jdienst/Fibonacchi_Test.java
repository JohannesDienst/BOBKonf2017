package de.jdienst;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import de.jdienst.Fibonacci;

/**
 * @author jdienst
 *
 */
public class Fibonacchi_Test
{

  private Fibonacci fib;

  @Before
  public void setup() {
    fib = new Fibonacci();
  }

  @Test public void seedValue0() {
    assertEquals(0, fib.calc(0));
  }

  @Test public void seedValue1() {
    assertEquals(1, fib.calc(1));
  }

  @Test public void seedValue2() {
    assertEquals(1, fib.calc(2));
  }

//  @Test public void value3() {
//    assertEquals(2, fib.calc(3));
//  }

//  @Test public void value11() {
//    assertEquals(89, fib.calc(11));
//  }
}
