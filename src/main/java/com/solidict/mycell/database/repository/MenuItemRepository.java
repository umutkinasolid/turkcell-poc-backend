package com.solidict.mycell.database.repository;

import com.solidict.mycell.database.entity.MenuItem;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface MenuItemRepository extends MongoRepository<MenuItem, String> {
}
