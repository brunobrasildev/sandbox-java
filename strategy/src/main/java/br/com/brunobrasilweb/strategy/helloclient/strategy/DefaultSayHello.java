package br.com.brunobrasilweb.strategy.helloclient.strategy;

public class DefaultSayHello implements SayHelloStrategy {
    @Override
    public String sayHello() {
        return "hello client default";
    }

}
