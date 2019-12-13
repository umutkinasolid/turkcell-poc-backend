package com.solidict.mycell.database.entity;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.Map;

@Data
public class EndpointConsumptionLog {
    private String path;
    private Map<String, String[]> params;
    private Map<String, String> headers;
    private LocalDateTime date;
}
