package com.bignerdranch.android.criminalintent;

import android.text.format.DateFormat;
import java.util.Date;
import java.util.UUID;

/**
 * Created by Данилов on 12.05.2017.
 */


public class Crime {
    private UUID mId;
    private String mTitle;
    private Date mDate;
    private boolean mSolved;


    {DateFormat.format("EEEE,dd-MM-yyyy", new java.util.Date());}

    public Crime(){
        //Генерирование уникального идентификатора
        mId=UUID.randomUUID();
        mDate=new Date();
    }

    public UUID getId() {
        return mId;
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

    public boolean isSolved() {
        return mSolved;
    }

    public void setSolved(boolean solved) {
        mSolved = solved;
    }
}
