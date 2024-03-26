package kz.zhami.bootstarter;

import com.iron.RavenProperties;
import jdk.jfr.StackTrace;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class BootStarterApplication {

    public static void main(String[] args) {
        try {
            SpringApplication.run(BootStarterApplication.class, args);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
