package com.solidict.mycell.database.repository;

import com.solidict.mycell.database.entity.EndpointConsumptionLog;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface EndpointConsumptionLogRepository extends MongoRepository<EndpointConsumptionLog, String> {
}
