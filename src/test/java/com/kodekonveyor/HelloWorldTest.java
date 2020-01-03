package com.kodekonveyor;

import java.io.PrintStream;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class HelloWorldTest {

  private static final String HELLO_WORLD = "Hello World!";
  private PrintStream newOut;

  @Test
  public void test_writing_out_hello_world() {
    newOut = Mockito.mock(PrintStream.class);
    System.setOut(newOut);

    WritingOut sayingSomething = new WritingOut();
    sayingSomething.write(HELLO_WORLD);
    Mockito.verify(newOut).println(HELLO_WORLD);
  }

}
