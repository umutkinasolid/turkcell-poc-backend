package com.solidict.mycell.database.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
public class MenuItem {
    @Id
    private String id;
    private String label;
}
