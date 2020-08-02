package com.konstantinmedvedev0.android.orderlist;

import java.util.Date;
import java.util.UUID;

public class Order {
    private UUID mUUID;
    private String mTitle;
    private Date mDate;
    private Boolean mDone;
    private Boolean mTemper;
    private Boolean mOxide;

    public Order() {
        mUUID = UUID.randomUUID();
        mDate = new Date();
    }

    public UUID getUUID() {
        return mUUID;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    public Date getDate() {
        return mDate;
    }

    public void setDate(Date date) {
        mDate = date;
    }

    public Boolean getDone() {
        return mDone;
    }

    public void setDone(Boolean done) {
        mDone = done;
    }

    public Boolean getTemper() {
        return mTemper;
    }

    public void setTemper(Boolean temper) {
        mTemper = temper;
    }

    public Boolean getOxide() {
        return mOxide;
    }

    public void setOxide(Boolean oxide) {
        mOxide = oxide;
    }
}

