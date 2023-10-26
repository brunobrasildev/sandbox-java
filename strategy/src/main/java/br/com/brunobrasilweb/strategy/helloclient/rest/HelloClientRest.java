package br.com.brunobrasilweb.strategy.helloclient.rest;

import br.com.brunobrasilweb.strategy.helloclient.HelloService;
import br.com.brunobrasilweb.strategy.helloclient.strategy.SayHelloStrategy;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static java.lang.Class.forName;

@RestController
@RequiredArgsConstructor
@RequestMapping("hello-clients")
public class HelloClientRest {

    private final HelloService helloService;

    @Value("${client.strategy.say-hello}")
    private String classSayHelloStrategy;

    @SneakyThrows
    @GetMapping
    public String hello() throws ClassNotFoundException {
        SayHelloStrategy sayHelloStrategy = (SayHelloStrategy) forName(classSayHelloStrategy).newInstance();
        helloService.setStrategy(sayHelloStrategy);
        return helloService.sayHello();
    }

}
