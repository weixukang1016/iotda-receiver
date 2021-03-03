package com.pvsoul.datacollection.iotdareceiver.feign;

import com.pvsoul.datacollection.iotdareceiver.dto.IotdaDataDto;
import com.pvsoul.datacollection.iotdareceiver.dto.ResultDto;
import feign.Headers;
import feign.RequestLine;

public interface RedirectFeign {
    @RequestLine("POST /receivedata")
    @Headers("Content-Type: application/json")
    public ResultDto redirect(IotdaDataDto data);
}
