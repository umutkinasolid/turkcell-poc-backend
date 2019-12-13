package com.solidict.mycell.database.entity;

import com.solidict.mycell.database.entity.enums.SubscriptionColor;
import com.solidict.mycell.database.entity.enums.SubscriptionPeriod;
import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
public class Subscription {
    @Id
    private String id;
    private SubscriptionColor color;
    private String name;
    private int appCount;
    private int dataGigabytes;
    private int digitalServiceMinutes;
    private int smsCount;
    private int callMinutes;
    private SubscriptionPeriod period;
    private double price;
}
