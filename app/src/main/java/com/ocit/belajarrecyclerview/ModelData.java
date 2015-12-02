package com.ocit.belajarrecyclerview;

/**
 * Created by ar-android on 02/12/2015.
 */
public class ModelData {
    private String name, decs, img;

    public ModelData(String name, String decs, String img) {
        this.name = name;
        this.decs = decs;
        this.img = img;
    }

    public String getName() {
        return name;
    }

    public String getDecs() {
        return decs;
    }

    public String getImg() {
        return img;
    }
}
