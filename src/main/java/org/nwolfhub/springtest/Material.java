package org.nwolfhub.springtest;

import org.springframework.stereotype.Component;
public class Material {
    public String name;
    public Boolean liquid;

    public Material() {
    }

    public Material(String name, Boolean liquid) {
        this.name = name;
        this.liquid = liquid;
    }

    public String getName() {
        return name;
    }

    public Material setName(String name) {
        this.name = name;
        return this;
    }

    public Boolean getLiquid() {
        return liquid;
    }

    public Material setLiquid(Boolean liquid) {
        this.liquid = liquid;
        return this;
    }

    @Override
    public String toString() {
        return "name: " + this.name + ", is liquid: " + this.liquid;
    }
}
