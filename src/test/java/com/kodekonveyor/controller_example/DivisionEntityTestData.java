package com.kodekonveyor.controller_example;

public class DivisionEntityTestData {

  public static Long DIVIDEND = 6L;
  public static Long DIVISOR = 2L;
  public static Long ID = 42L;
  public static final long RESULT = 3L;

  public static DivisionEntity get() {
    final DivisionEntity divisionEntity = new DivisionEntity();
    divisionEntity.setDividend(DivisionEntityTestData.DIVIDEND);
    divisionEntity.setDivisor(DivisionEntityTestData.DIVISOR);
    divisionEntity.setId(ID);
    divisionEntity.setResult(RESULT);
    return divisionEntity;
  }

  public static DivisionEntity getIdUninitialized() {
    final DivisionEntity divisionEntity = get();
    divisionEntity.setId(null);
    return divisionEntity;
  }

}
