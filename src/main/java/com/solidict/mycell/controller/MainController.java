package com.solidict.mycell.controller;

import com.solidict.mycell.service.LogService;
import com.solidict.mycell.service.MenuItemService;
import com.solidict.mycell.service.NavBarItemService;
import com.solidict.mycell.service.SubscriptionService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@AllArgsConstructor
public class MainController {

    private final NavBarItemService navBarItemService;
    private final MenuItemService menuItemService;
    private final SubscriptionService subscriptionService;
    private final LogService logService;

    @GetMapping("/nav-bar-items")
    private ResponseEntity getAllNavBarItems() {
        return ResponseEntity.ok(navBarItemService.getAll());
    }

    @GetMapping("/menu-items")
    private ResponseEntity getAllMenuItems() {
        return ResponseEntity.ok(menuItemService.getAll());
    }

    @GetMapping("/subscriptions")
    private ResponseEntity getAllSubscriptions() {
        return ResponseEntity.ok(subscriptionService.getAll());
    }
}
