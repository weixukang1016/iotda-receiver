package com.pvsoul.datacollection.iotdareceiver.service;

import com.pvsoul.datacollection.iotdareceiver.dao.ResultDao;
import com.pvsoul.datacollection.iotdareceiver.dao.TemperatureContentDao;

public interface TemperatureService {
    public ResultDao SaveData(TemperatureContentDao data);
}
