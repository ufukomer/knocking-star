package com.knockingstar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Arrays;

/**
 * @author Ömer Ufuk Efendioglu
 */
@SpringBootApplication
public class KnockingStar {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(KnockingStar.class, args);

        String[] beanNames = ctx.getBeanDefinitionNames();
        Arrays.sort(beanNames);
        for (String beanName : beanNames) {
            System.out.println(beanName);
        }
    }
}
