package com.pvsoul.datacollection.iotdareceiver.resource;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.pvsoul.datacollection.iotdareceiver.dao.IotdaDataDao;
import com.pvsoul.datacollection.iotdareceiver.dao.MeteorologicalContentDao;
import com.pvsoul.datacollection.iotdareceiver.dao.ResultDao;
import com.pvsoul.datacollection.iotdareceiver.service.DataReceiveService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

//@Api(value = "DataReceiveResource")
@Path("api/datareceive")
@Component
@Slf4j
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class DataReceiveResource {

    @Autowired
    private DataReceiveService dataReceiveService;

    @POST
    @Path("/meteorological")
    //@ApiOperation("接收气象数据")
    public Response pushData(@Context HttpServletRequest request, IotdaDataDao data) {

        log.info(JSONObject.toJSONString(data));
        MeteorologicalContentDao content = JSON.toJavaObject(data.getNotifyData().getBody().getContent(), MeteorologicalContentDao.class);
        ResultDao resultDao = dataReceiveService.SaveData(content);
        return Response.status(Response.Status.OK).entity(resultDao).build();
    }

}
