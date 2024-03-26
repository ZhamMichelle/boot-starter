package com.iron.annotation;

import org.springframework.boot.autoconfigure.condition.AllNestedConditions;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Condition;

public class OnRavenConditional extends AllNestedConditions {
    public OnRavenConditional() {
        super(ConfigurationPhase.REGISTER_BEAN);
    }
    @ConditionalOnProperty("raven.where")
    public static class R{}

    @ConditionalOnProperty(value="raven.onProperty", havingValue = "true")
    public static class C{}
}
