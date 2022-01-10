package com.dimraktin.springlearning;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PlayerBeanTest {

    private ClassPathXmlApplicationContext context;
    
    @Before
    public void init() {
        context = new ClassPathXmlApplicationContext("applicationContext.xml");
    }


    @After
    public void close() {
        context.close();
    }
    
    @Test
    public void shouldEqualPlayer() {
        Player player1 = context.getBean("playerBean", Player.class);
        Player player2 = context.getBean("playerBean", Player.class);
        assertEquals(player1, player2);
    }
}