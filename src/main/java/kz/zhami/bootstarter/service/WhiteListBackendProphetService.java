package kz.zhami.bootstarter.service;

import kz.zhami.bootstarter.ProfileConstants;
import kz.zhami.bootstarter.ProphetProperties;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("winterishere")
@RequiredArgsConstructor
public class WhiteListBackendProphetService implements ProphetService{
    private final ProphetProperties prophetProperties;
    @Override
    public boolean willSurvive(String name) {
        return prophetProperties.getWhiteList().contains(name);
    }
}
