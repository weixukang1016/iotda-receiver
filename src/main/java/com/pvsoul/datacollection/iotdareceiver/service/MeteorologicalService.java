package com.pvsoul.datacollection.iotdareceiver.service;

import com.pvsoul.datacollection.iotdareceiver.dto.MeteorologicalContentDto;
import com.pvsoul.datacollection.iotdareceiver.dto.ResultDto;

public interface MeteorologicalService {

    public ResultDto SaveData(MeteorologicalContentDto data);
}
