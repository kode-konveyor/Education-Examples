package com.kodekonveyor.controller_example;

import org.springframework.beans.factory.annotation.Autowired;

public class DivisionController {

  @Autowired
  DivisionEntityRepository divisionEntityRepository;

  public Long call(final DivideInputsDTO divideInputsDTO) {
    final DivisionEntity divisionEntity = new DivisionEntity();
    divisionEntity.setDividend(divideInputsDTO.getDividend());
    divisionEntity.setDivisor(divideInputsDTO.getDivisor());
    final long result =
        divideInputsDTO.getDividend() / divideInputsDTO.getDivisor();
    divisionEntity.setResult(result);
    divisionEntityRepository.save(divisionEntity);
    return result;
  }

}
