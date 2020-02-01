package com.kodekonveyor.incrementor;

import org.junit.jupiter.api.BeforeEach;

public class IncrementorTestBase {

  protected Incrementor incrementor;

  @BeforeEach
  void setUp() {
    incrementor = new Incrementor();
  }

}
