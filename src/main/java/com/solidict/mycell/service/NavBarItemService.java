package com.solidict.mycell.service;

import com.solidict.mycell.database.entity.NavBarItem;
import com.solidict.mycell.database.repository.NavBarItemRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NavBarItemService {

    private final NavBarItemRepository navBarItemRepository;

    public NavBarItemService(NavBarItemRepository navBarItemRepository) {
        this.navBarItemRepository = navBarItemRepository;
    }

    public List<NavBarItem> getAll() {
        return navBarItemRepository.findAll();
    }
}
