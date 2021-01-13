package com.pvsoul.datacollection.iotdareceiver.service;

import com.pvsoul.datacollection.iotdareceiver.dao.MeteorologicalContentDao;
import com.pvsoul.datacollection.iotdareceiver.dao.ResultDao;

public interface DataReceiveService {

    public ResultDao SaveData(MeteorologicalContentDao data);
}
