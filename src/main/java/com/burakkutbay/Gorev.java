package com.burakkutbay;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * Created by hasanburakkutbay on 20.03.2017.
 */
@Component
public class Gorev {

    private int sayac=0;

    @Scheduled(cron = "*/10 * * * * *")
    public void calistirGorev() {
        sayac++;
        System.out.println("Program Çalıştı : İş Görevi : " +  sayac+" Zaman : " + new Date());
    }
}
