package com.kodekonveyor.controller_example;

import static org.junit.jupiter.api.Assertions.assertEquals;

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
@TestedBehaviour("Basic")
@TestedService("DivisionController")
public class DivisionControllerBasicTest extends DivisionControllerTestBase {

  @Test
  @DisplayName("The two numbers in the parameter are divided")
  void test() {
    final DivideInputsDTO divideInputsDTO = DivideInputsDTOTestData.get();
    assertEquals(
        DivisionEntityTestData.RESULT,
        divisionController.call(divideInputsDTO)
    );
  }
}
