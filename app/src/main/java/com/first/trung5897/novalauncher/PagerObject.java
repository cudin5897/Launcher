package com.first.trung5897.novalauncher;

import java.util.ArrayList;

public class PagerObject {
    private ArrayList<AppObject> appList;

    public PagerObject(ArrayList<AppObject> appList){
        this.appList=appList;
    }
    public ArrayList<AppObject> getAppList(){ return appList;}
}
