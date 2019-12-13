package com.solidict.mycell.service;

import com.solidict.mycell.database.entity.EndpointConsumptionLog;
import com.solidict.mycell.database.repository.EndpointConsumptionLogRepository;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

@Service
public class LogService {

    private final EndpointConsumptionLogRepository endpointConsumptionLogRepository;

    public LogService(EndpointConsumptionLogRepository endpointConsumptionLogRepository) {
        this.endpointConsumptionLogRepository = endpointConsumptionLogRepository;
    }

    public List<EndpointConsumptionLog> getAll() {
        return endpointConsumptionLogRepository.findAll();
    }

    @Async
    public void saveRequestLog(String path, Map<String, String[]> params, Map<String, String> headers, LocalDateTime dateTime){
        EndpointConsumptionLog log = new EndpointConsumptionLog();
        log.setPath(path);
        log.setParams(params);
        log.setHeaders(headers);
        log.setDate(dateTime);
        endpointConsumptionLogRepository.save(log);
    }


}
