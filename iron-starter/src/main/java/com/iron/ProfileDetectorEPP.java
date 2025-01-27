package com.iron;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.env.EnvironmentPostProcessor;
import org.springframework.core.env.ConfigurableEnvironment;

public class ProfileDetectorEPP implements EnvironmentPostProcessor {
    @Override
    public void postProcessEnvironment(ConfigurableEnvironment environment, SpringApplication application) {
        if (environment.getActiveProfiles().length == 0) {
            if (getTemperature() < -272) {
                environment.setActiveProfiles("winterishere");
            } else {
                environment.setActiveProfiles("winteriscoming");
            }
        }
    }

    private int getTemperature() {
        return -200;
    }
}
