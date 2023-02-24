package com.dps;

public class SingletonSubClass extends Singleton {

    public SingletonSubClass() throws SingletonException {

    }

    public static SingletonSubClass getInstance() {
        SingletonSubClass instance = null;
        try {
            instance = Singleton.getInstance(SingletonSubClass.class);
        }
        catch (Exception exp) {

        }
        return instance;
    }
}
