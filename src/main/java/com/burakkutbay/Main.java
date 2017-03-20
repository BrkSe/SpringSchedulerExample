package com.burakkutbay;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by hasanburakkutbay on 20.03.2017.
 */
public class Main {

    public static void main(String[] args) {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("springContext.xml");
    }
}
