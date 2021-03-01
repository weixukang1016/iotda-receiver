package com.pvsoul.datacollection.iotdareceiver.service;

import com.pvsoul.datacollection.iotdareceiver.dto.ResultDto;
import com.pvsoul.datacollection.iotdareceiver.dto.TemperatureContentDto;

public interface TemperatureService {
    public ResultDto SaveData(TemperatureContentDto data);
}
