package com.solidict.mycell.database.repository;

import com.solidict.mycell.database.entity.MenuItem;
import com.solidict.mycell.database.entity.NavBarItem;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface NavBarItemRepository extends MongoRepository<NavBarItem, String> {
}
