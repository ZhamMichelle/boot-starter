package kz.zhami.bootstarter.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.concurrent.ThreadLocalRandom;

@Service
@Profile("winteriscoming")
public class NameBasedProphetService implements ProphetService{

    @Override
    public boolean willSurvive(String name) {
        return !name.contains("Stark") && ThreadLocalRandom.current().nextBoolean();
    }
}
