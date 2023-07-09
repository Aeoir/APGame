package com.mygdx.game;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;


public class Testing {

    @Test
    public void aimTest(){
        Tank test_tank= new Tank("a",0,0,10,10);
        float x=10;
        float y=20;
        double expected=(90/57.29577945897575)*Math.toDegrees(Math.tanh(3));
        double real=test_tank.aim(x,y);
        assertEquals(expected+10, real,2);

    }

    @Test
    public void weaponTest(){
        Tank test_tank= new Tank("a",0,0,10,10);
        Weapon test_weapon= new Weapon("b",0,0,10,10);
        int k=test_weapon.collided(test_tank);
        assertEquals(1,k,0);

    }

}

