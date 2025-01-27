package com.iron;

import com.iron.annotation.ConditionOnProduct;
import com.iron.annotation.ConditionalOnRaven;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(RavenProperties.class)
public class IronConfiguration {

    @Bean
    @ConditionOnProduct
    @ConditionalOnRaven
    @ConditionalOnMissingBean
    public RavenListener ravenListener(RavenProperties r) {
        return new RavenListener(r);
    }
}
