package com.kodekonveyor.controller_example;

public class DivideInputsDTOTestData {

  public static DivideInputsDTO get() {
    final DivideInputsDTO divideInputsDTO = new DivideInputsDTO();
    divideInputsDTO.setDividend(DivisionEntityTestData.DIVIDEND);
    divideInputsDTO.setDivisor(DivisionEntityTestData.DIVISOR);
    return divideInputsDTO;
  }

}
