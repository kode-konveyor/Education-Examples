package com.kodekonveyor.controller_example;

import java.time.Clock;

import org.springframework.stereotype.Service;

@Service
@InterfaceClass
public class ClockFactory {

  private static final Clock SYSTEM_UTC = Clock.systemUTC();

  Clock get() {
    return SYSTEM_UTC;
  }
}
