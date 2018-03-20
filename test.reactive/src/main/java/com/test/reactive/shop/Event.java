package com.test.reactive.shop;

/**
 * Created by oswaldl(418336572@qq.com) on 3/18/18.
 */
public interface Event extends Message {
    public static class DonePie implements Event {

    }

    public static class DoneEage implements Event {

    }

    public static class DoneVegatable implements Event {

    }

    public static class DoneHotDog implements Event {

    }

    public static class DonePackage implements Event {

    }

}
