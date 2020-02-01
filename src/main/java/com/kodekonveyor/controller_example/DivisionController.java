package com.kodekonveyor.controller_example;

import java.time.Clock;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

public class DivisionController {

  @Autowired
  ClockFactory clockFactory;
  @Autowired
  DivisionEntityRepository divisionEntityRepository;

  @GetMapping("/foo")
  public Long call(final DivideInputsDTO divideInputsDTO) {
    final DivisionEntity divisionEntity = new DivisionEntity();
    divisionEntity.setDividend(divideInputsDTO.getDividend());
    divisionEntity.setDivisor(divideInputsDTO.getDivisor());
    final long result =
        divideInputsDTO.getDividend() / divideInputsDTO.getDivisor();
    divisionEntity.setResult(result);
    final Clock clock = clockFactory.get();
    divisionEntity.setTime(clock.millis());
    divisionEntityRepository.save(divisionEntity);
    return result;
  }

}
