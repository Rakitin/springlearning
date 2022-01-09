package com.dimraktin.springlearning;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Player player = context.getBean("playerBean", Player.class);
        player.play();
        context.close();


 
    }
}
