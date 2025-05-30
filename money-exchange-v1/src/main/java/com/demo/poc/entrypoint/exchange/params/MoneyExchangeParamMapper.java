package com.demo.poc.entrypoint.exchange.params;

import java.util.Map;

import com.demo.poc.commons.core.validations.ParamMapper;

import org.springframework.stereotype.Component;

@Component
public class MoneyExchangeParamMapper implements ParamMapper {

  @Override
  public Object map(Map<String, String> params) {
    return MoneyExchangeParam.builder()
        .baseCode(params.get("baseCode"))
        .targetCode(params.get("targetCode"))
        .build();
  }

  @Override
  public boolean supports(Class<?> paramClass) {
    return MoneyExchangeParam.class.isAssignableFrom(paramClass);
  }
}
