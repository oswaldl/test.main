package com.test.reactive.shop;


import com.test.reactive.common.Timeout;

import java.math.BigDecimal;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;

/**
 * Created by oswaldl(418336572@qq.com) on 20/03/2018.
 */
public class Shop {

    private static final Timeout nomorethen2 = Timeout.apply(2, TimeUnit.MINUTES);

    private final ActorRef bossRef;

    public Shop(ActorRef bossRef){
        this.bossRef = bossRef;
    }

    public CompletableFuture<VhPie> sellWonderfullVgPie(BigDecimal moneyInyuan){
        return ask(bossRef, new Command.makeOneVhPie(), nomorethen2)
                .toCompletableFuture()
                .thenApply(VhPie.class::cast);
    }
}
