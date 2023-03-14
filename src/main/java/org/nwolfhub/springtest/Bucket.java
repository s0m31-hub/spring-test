package org.nwolfhub.springtest;


import org.springframework.beans.factory.annotation.Autowired;

public class Bucket {
    public Integer id;

    @Autowired
    public Material infill; //this will be automatically set by Spring

    public Bucket() {

    }

    public Bucket(Integer id, Material infill) {
        this.id = id;
        this.infill = infill;
    }

    public Integer getId() {
        return id;
    }

    public Bucket setId(Integer id) {
        this.id = id;
        return this;
    }

    public Material getInfill() {
        return infill;
    }

    public Bucket setInfill(Material infill) {
        this.infill = infill;
        return this;
    }

    @Override
    public String toString() {
        return "Hello. I am bucket #" + this.id + ", filled with following material: " + this.infill;
    }
}
