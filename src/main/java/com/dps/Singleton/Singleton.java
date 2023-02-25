package com.dps.Singleton;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

public abstract class Singleton {

    private static Map<String, Singleton> singletonMap = new HashMap<>();

    protected Singleton() throws SingletonException {
        final String class_name = this.getClass().getName();
        if (singletonMap.containsKey(class_name))
        {
            throw new SingletonException("Cannot construct instance for class " + class_name + " since it already exists!");
        }
        else {
            synchronized(singletonMap) {
                if (singletonMap.containsKey(class_name))
                {
                    throw new SingletonException("Cannot construct instance for class " + class_name + " since it already exists!");
                }
                else {
                    singletonMap.put(class_name, this);
                }
            }
        }
    }

    @SuppressWarnings("unchecked")
    public static <T extends Singleton> T getInstance(Class<T> type) throws IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        final String class_name = type.getName();
        T instance = null;

        if (!singletonMap.containsKey(class_name))
        {
            synchronized(singletonMap) {
                instance = type.getConstructor().newInstance();
            }
        }
        else {
            instance = (T) singletonMap.get(class_name);
        }
        return instance;
    }

    public static Singleton getInstance(final String name) {
        return singletonMap.get(name);
    }
}

final class SingletonException extends Exception {

    public SingletonException(String msg) {
        super(msg);
    }
}
