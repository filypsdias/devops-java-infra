package com.filypsdias.devops.actions.dummy.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class CalculatorServiceTest {

  @Autowired
  private CalculatorService service;

  @Test
  public void addShouldReturnAddedValues() {
    //given
    final String a = "10";
    final String b = "15";

    //then
    int result = service.sum(a, b);
    Assertions.assertEquals(25, result);
  }

  @Test
  public void subShouldReturnSubtractedValues() {
    //given
    final String a = "10";
    final String b = "15";

    //then
    int result = service.subtract(a, b);
    Assertions.assertEquals(-5, result);
  }
}
