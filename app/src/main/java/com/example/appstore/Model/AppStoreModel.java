package com.example.appstore.Model;

import android.os.Parcel;
import android.os.Parcelable;

public class AppStoreModel {

    int id;
    String title;
    String subTitle;
    double rate;
    int img;

    public AppStoreModel(int id, String title, String subTitle, double rate, int img) {
        this.id = id;
        this.title = title;
        this.subTitle = subTitle;
        this.rate = rate;
        this.img = img;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubTitle() {
        return subTitle;
    }

    public void setSubTitle(String subTitle) {
        this.subTitle = subTitle;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }
}
