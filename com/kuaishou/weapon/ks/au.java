package com.kuaishou.weapon.ks.au;
import java.lang.String;
import android.content.Context;
import java.lang.Object;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Collection;
import java.lang.System;
import java.lang.StringBuilder;
import com.kuaishou.weapon.ks.bh;

public class au	// class@0011d2
{
    public Context c;
    public static final String[] b;

    static {
       String[] stringArray = new String[]{"/data/local/","/data/local/bin/","/data/local/xbin/","/sbin/","/su/bin/","/system/bin/","/system/bin/failsafe/","/system/xbin/"};
       au.b = stringArray;
    }
    public void au(Context p0){
       this.c = p0;
    }
    public int a(){
       int i = 0;
       try{
          String[] stringArray = this.a(au.b);
          int len = stringArray.length;
          int i1 = 0;
          while (i1 < len) {
             if (new File(stringArray[i1], "su").exists()) {
                i = 1;
                break ;
             }else {
                i1 = i1 + 1;
             }
          }
          return e0;
       }catch(java.lang.Exception e0){
       }
    }
    public final String[] a(String[] p0){
       String[] stringArray;
       ArrayList uArrayList = new ArrayList(Arrays.asList(p0));
       try{
          int i = 0;
          String env = System.getenv("PATH");
          if (env == null || ("").equals(env)) {
             stringArray = new String[i];
             return uArrayList.toArray(stringArray);
          }else {
             stringArray = env.split(":");
             int len = stringArray.length;
             int i1 = 0;
             while (i1 < len) {
                object oobject = stringArray[i1];
                if (!oobject.endsWith("/")) {
                   oobject = oobject+'/';
                }
                if (!uArrayList.contains(oobject)) {
                   uArrayList.add(oobject);
                }
                i1 = i1 + 1;
             }
             i = new String[i];
             return e0.toArray(i);
          }
       }catch(java.lang.Exception e0){
       }
    }
    public int b(){
       String str = bh.a("ro.secure");
       int i = 1;
       if (str == null) {
       }else if(("0").equals(str)){
          i = 0;
       }
       return i;
    }
    public int c(){
       String str = bh.a("ro.debuggable");
       int i = 1;
       if (str == null) {
       }else if(("0").equals(str)){
          i = 0;
       }
       return i;
    }
    public int d(){
       String str = bh.a("ro.adb.secure");
       int i = 1;
       if (str == null) {
       }else if(("0").equals(str)){
          i = 0;
       }
       return i;
    }
}
