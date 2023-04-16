package com.kuaishou.weapon.ks.bm;
import java.lang.Object;
import android.content.Context;
import android.content.ContentResolver;
import java.lang.String;
import android.provider.Settings$System;
import java.lang.CharSequence;

public class bm	// class@0011e9
{

    public void bm(){
       super();
    }
    public static int a(Context p0){
       if ((Settings$System.getString(p0.getContentResolver(), "airplane_mode_on")).equals("0")) {
          return 0;
       }
       return 1;
    }
    public static String a(String p0){
       p0 = (((((p0.replace("      ", ";")).replace("     ", ";")).replace("    ", ";")).replace("   ", ";")).replace("  ", ";")).replace(" ", ";");
       return p0;
    }
}
