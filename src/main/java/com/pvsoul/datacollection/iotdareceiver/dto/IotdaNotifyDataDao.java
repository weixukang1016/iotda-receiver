package com.pvsoul.datacollection.iotdareceiver.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@Getter
@Setter
@ToString
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class IotdaNotifyDataDao implements Serializable {
    private static final long serialVersionUID = -222753328497208510L;

    @JsonProperty("header")
    private IotdaHeaderDto header;

    @JsonProperty("body")
    private IotdaBodyDto body;

}
