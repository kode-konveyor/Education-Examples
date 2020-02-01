package com.kodekonveyor.incrementor;

public class Incrementor {

  protected int increment(final int incremented) {
    if (0 > incremented)
      return incremented;
    else
      return 1 + incremented;
  }

}
