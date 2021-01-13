package com.pvsoul.datacollection.iotdareceiver.service.impl;

import com.pvsoul.datacollection.iotdareceiver.dao.MeteorologicalContentDao;
import com.pvsoul.datacollection.iotdareceiver.dao.ResultDao;
import com.pvsoul.datacollection.iotdareceiver.entity.MeteorologicalData;
import com.pvsoul.datacollection.iotdareceiver.mapper.MeteorologicalDataMapper;
import com.pvsoul.datacollection.iotdareceiver.service.DataReceiveService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.UUID;

@Service
@Slf4j
public class DataReceiveServiceImpl implements DataReceiveService {

    @Autowired
    private MeteorologicalDataMapper meteorologicalDataMapper;

    @Override
    @Transactional(rollbackFor = Exception.class)
    public ResultDao SaveData(MeteorologicalContentDao content) {
        ResultDao resultDao = new ResultDao();
        Date now = new Date();
        String id = UUID.randomUUID().toString();
        MeteorologicalData meteorologicalData = new MeteorologicalData();
        meteorologicalData.setId(id);
        meteorologicalData.setDeviceId(content.getDeviceId());
        meteorologicalData.setTemperature(content.getTemperature());
        meteorologicalData.setHumidity(content.getHumidity());
        meteorologicalData.setRainFall(content.getRainFall());
        meteorologicalData.setWindDirection(content.getWindDirection());
        meteorologicalData.setWindSpeed(content.getWindSpeed());
        meteorologicalData.setPressure(content.getPressure());
        meteorologicalData.setIrradiance(content.getIrradiance());
        meteorologicalData.setCreateTime(now);
        meteorologicalDataMapper.insert(meteorologicalData);

        return resultDao;
    }
}
