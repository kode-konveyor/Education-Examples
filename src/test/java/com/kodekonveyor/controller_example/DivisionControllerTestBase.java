package com.kodekonveyor.controller_example;

import org.junit.jupiter.api.BeforeEach;
import org.mockito.InjectMocks;
import org.mockito.Mock;

public class DivisionControllerTestBase {

  @InjectMocks
  DivisionController divisionController;

  @Mock
  DivisionEntityRepository divisionEntityRepository;

  @BeforeEach
  void setUp() {
    DivisionEntityRepositoryStubs.behaviour(divisionEntityRepository);
  }

}
