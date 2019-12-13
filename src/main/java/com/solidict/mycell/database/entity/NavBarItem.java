package com.solidict.mycell.database.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
public class NavBarItem {
    @Id
    private String id;
    private String label;
    private String imageUrl;
}
