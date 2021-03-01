package com.pvsoul.datacollection.iotdareceiver.service;

import com.pvsoul.datacollection.iotdareceiver.dto.IotdaDataDto;
import com.pvsoul.datacollection.iotdareceiver.dto.ResultDto;

public interface RedirectService {
    ResultDto redirect(IotdaDataDto data);
}
