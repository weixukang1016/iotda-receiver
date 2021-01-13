package com.pvsoul.datacollection.iotdareceiver.config;

import com.pvsoul.datacollection.iotdareceiver.provider.RuntimeExceptionProvider;
import com.pvsoul.datacollection.iotdareceiver.provider.ValidationExceptionProvider;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.boot.autoconfigure.jersey.ResourceConfigCustomizer;
import org.springframework.context.annotation.Configuration;


/**
 * Jersey配置类
 *
 */
@Configuration
public class JerseyConfig implements ResourceConfigCustomizer {

    @Override
    public void customize(ResourceConfig config) {
        //config.packages("com.pvsoul.datacollection.iotdareceiver.resource");
        config.register(com.pvsoul.datacollection.iotdareceiver.resource.DataReceiveResource.class);
        config.registerClasses(ValidationExceptionProvider.class);
        config.registerClasses(RuntimeExceptionProvider.class);
    }
}