package com.iron;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.List;

@Data
@ConfigurationProperties("raven")
public class RavenProperties {
    List<String> where;
    boolean onProperty;

    public List<String> getWhere() {
        return where;
    }

    public boolean isOnProperty() {
        return onProperty;
    }

    public void setWhere(List<String> where) {
        this.where = where;
    }

    public void setOnProperty(boolean onProperty) {
        this.onProperty = onProperty;
    }
}
