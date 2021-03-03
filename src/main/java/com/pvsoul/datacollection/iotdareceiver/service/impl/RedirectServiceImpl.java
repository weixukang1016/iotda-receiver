package com.pvsoul.datacollection.iotdareceiver.service.impl;

import com.pvsoul.datacollection.iotdareceiver.dto.IotdaDataDto;
import com.pvsoul.datacollection.iotdareceiver.dto.ResultDto;
import com.pvsoul.datacollection.iotdareceiver.feign.RedirectFeign;
import com.pvsoul.datacollection.iotdareceiver.service.RedirectService;
import feign.Feign;
import feign.jackson.JacksonDecoder;
import feign.jackson.JacksonEncoder;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class RedirectServiceImpl implements RedirectService {
    @Override
    public ResultDto redirect(IotdaDataDto data) {
        //TODO 目前先固定转发给远东电站，后续需要建立设备表，根据DeviceId来转发网站
        String baseUrl = "http://yuandong:8080/api/iotda";
        //String baseUrl = "http://localhost:8080/api/iotda";
        RedirectFeign redirectFeign = Feign.builder().encoder(new JacksonEncoder()).decoder(new JacksonDecoder())
                .target(RedirectFeign.class, baseUrl);
        ResultDto resultDto = redirectFeign.redirect(data);
        return resultDto;
    }
}
