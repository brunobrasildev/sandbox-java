package br.com.brunobrasilweb.strategy.helloclient.strategy;

public class Customer1SayHello implements SayHelloStrategy {
    @Override
    public String sayHello() {
        return "hello client: company_1";
    }

}
