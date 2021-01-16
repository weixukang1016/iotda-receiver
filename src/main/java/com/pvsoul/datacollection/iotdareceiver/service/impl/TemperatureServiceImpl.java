package com.pvsoul.datacollection.iotdareceiver.service.impl;

import com.pvsoul.datacollection.iotdareceiver.dao.ResultDao;
import com.pvsoul.datacollection.iotdareceiver.dao.TemperatureContentDao;
import com.pvsoul.datacollection.iotdareceiver.entity.TemperatureData;
import com.pvsoul.datacollection.iotdareceiver.mapper.MeteorologicalDataMapper;
import com.pvsoul.datacollection.iotdareceiver.mapper.TemperatureDataMapper;
import com.pvsoul.datacollection.iotdareceiver.service.TemperatureService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;

@Service
@Slf4j
public class TemperatureServiceImpl implements TemperatureService {

    @Autowired
    private TemperatureDataMapper temperatureDataMapper;

    @Override
    @Transactional(rollbackFor = Exception.class)
    public ResultDao SaveData(TemperatureContentDao content) {
        ResultDao resultDao = new ResultDao();
        Date now = new Date();
        String deviceId = content.getDeviceId();

        if (content.getTemperature0() != null) {
            TemperatureData temperatureData = getTemperatureData(0, deviceId, content.getTemperature0(), now);
            temperatureDataMapper.insert(temperatureData);
        }
        if (content.getTemperature1() != null) {
            TemperatureData temperatureData = getTemperatureData(1, deviceId, content.getTemperature1(), now);
            temperatureDataMapper.insert(temperatureData);
        }
        if (content.getTemperature2() != null) {
            TemperatureData temperatureData = getTemperatureData(2, deviceId, content.getTemperature2(), now);
            temperatureDataMapper.insert(temperatureData);
        }
        if (content.getTemperature3() != null) {
            TemperatureData temperatureData = getTemperatureData(3, deviceId, content.getTemperature3(), now);
            temperatureDataMapper.insert(temperatureData);
        }
        if (content.getTemperature4() != null) {
            TemperatureData temperatureData = getTemperatureData(4, deviceId, content.getTemperature4(), now);
            temperatureDataMapper.insert(temperatureData);
        }
        if (content.getTemperature5() != null) {
            TemperatureData temperatureData = getTemperatureData(5, deviceId, content.getTemperature5(), now);
            temperatureDataMapper.insert(temperatureData);
        }
        if (content.getTemperature6() != null) {
            TemperatureData temperatureData = getTemperatureData(6, deviceId, content.getTemperature6(), now);
            temperatureDataMapper.insert(temperatureData);
        }
        if (content.getTemperature7() != null) {
            TemperatureData temperatureData = getTemperatureData(7, deviceId, content.getTemperature7(), now);
            temperatureDataMapper.insert(temperatureData);
        }
        if (content.getTemperature8() != null) {
            TemperatureData temperatureData = getTemperatureData(8, deviceId, content.getTemperature8(), now);
            temperatureDataMapper.insert(temperatureData);
        }
        if (content.getTemperature9() != null) {
            TemperatureData temperatureData = getTemperatureData(9, deviceId, content.getTemperature9(), now);
            temperatureDataMapper.insert(temperatureData);
        }
        return resultDao;
    }

    private TemperatureData getTemperatureData(int index, String deviceId, Float temperature, Date createtime) {

        String id = UUID.randomUUID().toString();
        TemperatureData temperatureData = new TemperatureData();
        temperatureData.setId(id);
        temperatureData.setIndex(index);
        temperatureData.setDeviceId(deviceId);
        temperatureData.setTemperature(temperature);
        temperatureData.setCreateTime(createtime);
        return temperatureData;
    }
}