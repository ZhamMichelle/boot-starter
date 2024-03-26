package kz.zhami.bootstarter;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;

@Data
@ConfigurationProperties("ironbank")
@Component
public class ProphetProperties {
    List<String> whiteList;
}
