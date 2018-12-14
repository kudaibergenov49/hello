package ru.kkudaibergen;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ServiceTest {

    @Test
    public void testGreeting() {
        Service service = new Service();
        Assert.assertEquals("Hello name", service.greeting("name"));
        Assert.assertNotEquals("name", service.greeting("name"));
        Assert.assertEquals("Hello ", service.greeting(""));
    }
}