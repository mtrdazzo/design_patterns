package com.dps.Singleton;

public class AnotherSingletonSubclass extends Singleton {

    public AnotherSingletonSubclass() throws SingletonException {
    }

    public static AnotherSingletonSubclass getInstance() {
        AnotherSingletonSubclass instance = null;
        try {
            instance = Singleton.getInstance(AnotherSingletonSubclass.class);
        }
        catch (Exception exp) {

        }
        return instance;
    }
}
