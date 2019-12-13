package com.solidict.mycell.database.repository;

import com.solidict.mycell.database.entity.Subscription;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface SubscriptionRepository extends MongoRepository<Subscription, String> {
}
