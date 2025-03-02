package org.example;

import org.example.config.ProjectConfig;
import org.example.model.Clothing;
import org.example.service.ClothingService;
import org.example.singletoneBeans.EagerSingleton;
import org.example.singletoneBeans.LazySingleton;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        EagerSingleton eagerSingleton = context.getBean(EagerSingleton.class);

        System.out.println("Before getting LazySingleton...");
        LazySingleton lazySingleton = context.getBean(LazySingleton.class);
        System.out.println("After getting LazySingleton...");

        // Getting service of clothing
        ClothingService clothingService = context.getBean(ClothingService.class);

        // Adding clothing
        clothingService.addClothing(new Clothing(1, "T-Shirt", 1000, "Casual"));
        clothingService.addClothing(new Clothing(2, "Jeans", 3000, "Denim"));

        // Getting all clothing
        System.out.println("All clothing: " + clothingService.getAllClothing());

    }
}
