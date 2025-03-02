package org.example.config;

import org.example.singletoneBeans.EagerSingleton;
import org.example.singletoneBeans.LazySingleton;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

@Configuration
@ComponentScan(basePackages = "org.example")
public class ProjectConfig {

    @Bean
    public EagerSingleton eagerSingleton() {
        return new EagerSingleton();
    }

    @Bean
    @Lazy
    public LazySingleton lazySingleton() {
        return new LazySingleton();
    }
}
