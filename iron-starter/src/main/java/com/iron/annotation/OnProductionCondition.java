package com.iron.annotation;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

import javax.swing.*;

public class OnProductionCondition implements Condition {

    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        System.setProperty("java.awt.headless", "false");
        return JOptionPane.showConfirmDialog(null, "Is this production?") == 0;
    }
}
