package kz.zhami.bootstarter.controller;

import kz.zhami.bootstarter.service.ProphetService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class SimpleController {

    private final ProphetService prophetService;

    @GetMapping("simple/{name}")
    public String getSimple(@PathVariable String name){
        return prophetService.willSurvive(name) ? "Accepted" : "Not accepted";
    }
}
