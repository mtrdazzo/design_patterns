package com.dps;

import org.junit.Assert;
import org.junit.Test;

import com.dps.Singleton.*;

public class SingletonTest {

    @Test
    public void testAttemptGetByClassName() {
        AnotherSingletonSubclass.getInstance();
        Assert.assertNotNull(Singleton.getInstance(AnotherSingletonSubclass.class.getName()));
    }

    @Test
    public void testSingleInstance() {
        SingletonSubClass s1 = SingletonSubClass.getInstance();
        Assert.assertNotNull(s1);
    }

    @Test
    public void testSameInstance() {
        SingletonSubClass s1 = SingletonSubClass.getInstance();
        SingletonSubClass s2 = SingletonSubClass.getInstance();
        Assert.assertEquals(s1, s2);
    }

    @Test
    public void testDifferentSubclasses() {
        SingletonSubClass s1 = SingletonSubClass.getInstance();
        AnotherSingletonSubclass s2 = AnotherSingletonSubclass.getInstance();
        Assert.assertNotEquals(s1, s2);
    }

}
