package com.filypsdias.devops.actions.dummy.services.impl;

import com.filypsdias.devops.actions.dummy.services.CalculatorService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@RequiredArgsConstructor
@Service
public class CalculatorServiceImpl implements CalculatorService {

  @Override
  public int sum(String a, String b) {
    return Integer.parseInt(a) + Integer.parseInt(b);
  }

  @Override
  public int subtract(String a, String b) {
    return Integer.parseInt(a) - Integer.parseInt(b);
  }
}
