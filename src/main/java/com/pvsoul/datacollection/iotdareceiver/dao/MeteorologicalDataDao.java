package com.pvsoul.datacollection.iotdareceiver.dao;

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
public class MeteorologicalDataDao implements Serializable {
    private static final long serialVersionUID = -3989294027170290096L;

    @JsonProperty("topic")
    private String topic;

    @JsonProperty("content")
    private MeteorologicalContentDao content;
}
