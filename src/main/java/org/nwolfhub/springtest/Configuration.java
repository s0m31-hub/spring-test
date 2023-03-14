package org.nwolfhub.springtest;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Primary;

import java.util.Random;

@org.springframework.context.annotation.Configuration
@ComponentScan("org.nwolfhub.springtest.Material")
public class Configuration {

    private static Material[] materials = {new Material("water", true), new Material("lava", true), new Material("stone", false)};

    /**
     * This bean gets a random material from an array and returns it
     * @return material - randomly chosen material
     */
    @Primary
    @Bean(name = "materialBean")
    public Material getMaterial() {
        Random r = new Random();
        return materials[r.nextInt(3)];
    }

    /**
     * Just a bean so we can use it in SpringTestApplication.java
     * @return a bucket
     */

    @Bean(name = "bucket")
    public Bucket getBucket() {
        return new Bucket();
    }
}