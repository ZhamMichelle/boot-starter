package com.iron;

import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Component;

//происходит до создания контекста
@Component
public class ProfileCheckApplicationContextInitializer implements ApplicationContextInitializer {
    @Override
    public void initialize(ConfigurableApplicationContext applicationContext) {
        if (applicationContext.getEnvironment().getActiveProfiles().length == 0) {
            throw new RuntimeException("No way without profile!");
        }
    }
}
