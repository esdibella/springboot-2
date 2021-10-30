package com.promineotech.jeep.service;

import java.util.List;
import org.springframework.stereotype.Service;
import com.promineotech.jeep.entity.Jeep;
import lombok.extern.slf4j.Slf4j;


@Service
@Slf4j
public class defaultJeepsSalesService implements JeepSalesService {

  public List<Jeep> fetchJeeps(String model, String trim) {
    log.info("The fetchJeeps method was called with model={} and trim ={}", model, trim);
    return null;
  }

}
