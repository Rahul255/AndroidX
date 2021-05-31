package com.example.welcomeapp;

import android.content.Context;
import android.content.SharedPreferences;

public class LuncherManager {
    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;

    private static String PREF_NAME = "LunchManager";
    private static String IS_FIRST_TIME = "IsFirst";

    public LuncherManager(Context context){
        sharedPreferences = context.getSharedPreferences(PREF_NAME,0);
        editor = sharedPreferences.edit();
    }

    public void setIsFirstLunch(boolean IsFirst){
        editor.putBoolean(IS_FIRST_TIME,IsFirst);
        editor.commit();
    }

    public boolean isFirstTime(){
        return sharedPreferences.getBoolean(IS_FIRST_TIME,true);
    }
}
