package com.kodekonveyor.incrementor;

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
@TestedBehaviour("Incrementing")
@TestedService("Incrementor")
public class IncrementorTest extends IncrementorTestBase {

  @Test
  void test1() {
    assertEquals(
        IncrementorTestData.INCREMENTED_POSITIVE,
        incrementor.increment(IncrementorTestData.POSITIVE)
    );
  }

  @Test
  @DisplayName("Incrementor leaves negative numbers alone")
  void test2() {
    assertEquals(
        IncrementorTestData.INCREMENTED_NEGATIVE,
        incrementor.increment(IncrementorTestData.NEGATIVE)
    );
  }
}
