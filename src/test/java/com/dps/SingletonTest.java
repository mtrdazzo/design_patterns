package com.dps;

import org.junit.Assert;
import org.junit.Test;

public class SingletonTest {
    // @Test
    // public void testSingleInstance() {
    //     SingletonSubClass s1 = SingletonSubClass.getInstance();
    //     Assert.assertNotNull(s1);
    // }

    // @Test
    // public void testSameInstance() {
    //     SingletonSubClass s1 = SingletonSubClass.getInstance();
    //     SingletonSubClass s2 = SingletonSubClass.getInstance();
    //     Assert.assertEquals(s1, s2);
    // }

    // @Test
    // public void testDifferentSubclasses() {
    //     SingletonSubClass s1 = SingletonSubClass.getInstance();
    //     AnotherSingletonSubclass s2 = AnotherSingletonSubclass.getInstance();
    //     Assert.assertNotEquals(s1, s2);
    // }

    @Test
    public void testAttemptInstantiate() {
        try {
            SingletonSubClass s1 = new SingletonSubClass();
        }
        catch (Exception exp) {
            exp.printStackTrace();
            Assert.fail();
        }
    }
}
