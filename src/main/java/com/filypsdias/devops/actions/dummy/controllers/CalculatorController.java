package com.filypsdias.devops.actions.dummy.controllers;

import static com.filypsdias.devops.actions.dummy.constatns.UrlConstants.URI_CALCULATOR_OPERATION;

import com.filypsdias.devops.actions.dummy.services.CalculatorService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RequiredArgsConstructor
@RestController
public class CalculatorController {

  private final CalculatorService service;

  @GetMapping(value = URI_CALCULATOR_OPERATION)
  public int sumTwoValues(@PathVariable final String operation,
                          @RequestParam(name = "valueA") final String valueA,
                          @RequestParam(name = "valueB") final String valueB) {
    if ("sum".equals(operation)) {
      return service.sum(valueA, valueB);
    } else {
      return service.subtract(valueA, valueB);
    }
  }
}
