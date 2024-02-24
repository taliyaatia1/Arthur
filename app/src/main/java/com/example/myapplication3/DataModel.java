package com.example.myapplication3;

public class DataModel {

    private String name;
    private String version;
    private int image;
    private int id_;



    public DataModel(String name, String version, Integer image, Integer id_) {
        this.name = name;
        this.version = version;
        this.image = image;
        this.id_ = id_;
    }
    public String getName() {
        return name;
    }

    public String getVersion() {
        return version;
    }

    public int getImage() {
        return image;
    }

    public int getId_() {
        return id_;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public void setImage(Integer image) {
        this.image = image;
    }

}
