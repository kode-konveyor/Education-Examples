package com.kodekonveyor.controller_example;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.time.Clock;

public class ClockFactoryStubs {

  public static void behaviour(final ClockFactory clockFactory) {
    final Clock clock = mock(Clock.class);
    when(clock.millis()).thenReturn(DivisionEntityTestData.TIME);
    when(clockFactory.get()).thenReturn(clock);
  }

}
