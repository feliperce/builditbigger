package com.udacity.gradle.builditbigger;

import android.support.test.runner.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

import static junit.framework.Assert.assertNotNull;
import static junit.framework.Assert.fail;

import java.util.concurrent.TimeUnit;


/**
 * Created by felipe on 24/05/17.
 */

@RunWith(AndroidJUnit4.class)
public class JokeTest {

    @Test
    public void testJoke(){
        String joke = null;
        try {
            EndpointsAsyncTask task = new EndpointsAsyncTask();
            task.execute();
            joke = task.get(10, TimeUnit.SECONDS);
        } catch (Exception e) {
            fail("TIME OUT BABY!");
        }

        assertNotNull(joke);

    }
}
