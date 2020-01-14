package com.kodekonveyor.controller_example;

import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import com.kodekonveyor.annotations.TestedBehaviour;
import com.kodekonveyor.annotations.TestedService;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
@RunWith(MockitoJUnitRunner.class)
@TestedBehaviour("Persistence")
@TestedService("DivisionController")
public class DivisionControllerPersistenceTest
    extends DivisionControllerTestBase {

  @Override
  @BeforeEach
  void setUp() {
    super.setUp();
    divisionController.call(DivideInputsDTOTestData.get());
  }

  @Test
  @DisplayName("the value of the division is persisted")
  void test() {
    verify(divisionEntityRepository)
        .save(DivisionEntityTestData.getIdUninitialized());
  }
}
