package com.solidict.mycell;

import com.solidict.mycell.database.entity.MenuItem;
import com.solidict.mycell.database.entity.NavBarItem;
import com.solidict.mycell.database.entity.Subscription;
import com.solidict.mycell.database.entity.enums.SubscriptionColor;
import com.solidict.mycell.database.entity.enums.SubscriptionPeriod;
import com.solidict.mycell.database.repository.EndpointConsumptionLogRepository;
import com.solidict.mycell.database.repository.MenuItemRepository;
import com.solidict.mycell.database.repository.NavBarItemRepository;
import com.solidict.mycell.database.repository.SubscriptionRepository;
import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.config.EnableMongoAuditing;

@SpringBootApplication
@EnableMongoAuditing
@AllArgsConstructor
public class MyCellApplication implements CommandLineRunner{

    private NavBarItemRepository navBarItemRepository;
    private MenuItemRepository menuItemRepository;
    private SubscriptionRepository subscriptionRepository;
    private EndpointConsumptionLogRepository endpointConsumptionLogRepository;

    public static void main(String[] args) {
        SpringApplication.run(MyCellApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        navBarItemRepository.deleteAll();
        menuItemRepository.deleteAll();
        subscriptionRepository.deleteAll();
        endpointConsumptionLogRepository.deleteAll();

        NavBarItem navBarItem = new NavBarItem();
        navBarItem.setLabel("TL Yükle");
        navBarItem.setImageUrl("https://i.ibb.co/c6LfmnD/tl-yukle.png");

        NavBarItem navBarItem1 = new NavBarItem();
        navBarItem1.setLabel("Bildirimler");
        navBarItem1.setImageUrl("https://i.ibb.co/F0hXv0P/bildirim.png");

        NavBarItem navBarItem2 = new NavBarItem();
        navBarItem2.setLabel("Ana Sayfa");
        navBarItem2.setImageUrl("https://i.ibb.co/X3vfmyX/anasayfa.png");

        NavBarItem navBarItem3 = new NavBarItem();
        navBarItem3.setLabel("Search");
        navBarItem3.setImageUrl("https://i.ibb.co/FXsWpwL/search.png");

        NavBarItem navBarItem4 = new NavBarItem();
        navBarItem4.setLabel("Bize Sor");
        navBarItem4.setImageUrl("https://i.ibb.co/7yhYPPd/bize-sor.png");

        navBarItemRepository.save(navBarItem);
        navBarItemRepository.save(navBarItem1);
        navBarItemRepository.save(navBarItem2);
        navBarItemRepository.save(navBarItem3);
        navBarItemRepository.save(navBarItem4);

        MenuItem menuItem = new MenuItem();
        menuItem.setLabel("HAT SİPARİŞİM");

        MenuItem menuItem1 = new MenuItem();
        menuItem1.setLabel("SIK SORULAN SORULAR");

        MenuItem menuItem2 = new MenuItem();
        menuItem2.setLabel("MYCELL ASİSTAN");

        menuItemRepository.save(menuItem);
        menuItemRepository.save(menuItem1);
        menuItemRepository.save(menuItem2);

        Subscription subscriptionSmall = new Subscription();
        subscriptionSmall.setName("MyCell Small");
        subscriptionSmall.setColor(SubscriptionColor.ORANGE);
        subscriptionSmall.setAppCount(1);
        subscriptionSmall.setDataGigabytes(3);
        subscriptionSmall.setDigitalServiceMinutes(500);
        subscriptionSmall.setSmsCount(1000);
        subscriptionSmall.setCallMinutes(500);
        subscriptionSmall.setPeriod(SubscriptionPeriod.MONTH);
        subscriptionSmall.setPrice(30);

        Subscription subscriptionMedium = new Subscription();
        subscriptionMedium.setName("MyCell Medium");
        subscriptionMedium.setColor(SubscriptionColor.PINK);
        subscriptionMedium.setAppCount(4);
        subscriptionMedium.setDataGigabytes(6);
        subscriptionMedium.setDigitalServiceMinutes(750);
        subscriptionMedium.setSmsCount(1000);
        subscriptionMedium.setCallMinutes(500);
        subscriptionMedium.setPeriod(SubscriptionPeriod.MONTH);
        subscriptionMedium.setPrice(50);

        Subscription subscriptionLarge = new Subscription();
        subscriptionLarge.setName("MyCell Large");
        subscriptionLarge.setColor(SubscriptionColor.PURPLE);
        subscriptionLarge.setAppCount(10);
        subscriptionLarge.setDataGigabytes(10);
        subscriptionLarge.setDigitalServiceMinutes(1000);
        subscriptionLarge.setSmsCount(1000);
        subscriptionLarge.setCallMinutes(500);
        subscriptionLarge.setPeriod(SubscriptionPeriod.MONTH);
        subscriptionLarge.setPrice(70);

        subscriptionRepository.save(subscriptionSmall);
        subscriptionRepository.save(subscriptionMedium);
        subscriptionRepository.save(subscriptionLarge);
    }
}
