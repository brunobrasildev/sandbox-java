package br.com.brunobrasilweb.strategy.helloclient;

import br.com.brunobrasilweb.strategy.helloclient.strategy.SayHelloStrategy;
import lombok.Setter;
import org.springframework.stereotype.Service;

@Service
@Setter
public class HelloService {

    private SayHelloStrategy strategy;

    public String sayHello() {
        return strategy.sayHello();
    }

}
