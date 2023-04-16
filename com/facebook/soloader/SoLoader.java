package com.facebook.soloader.SoLoader;
import java.lang.Object;
import android.content.Context;
import java.lang.RuntimeException;
import java.lang.Throwable;
import java.lang.String;
import rg.d;
import old.soloader.SoLoader;
import android.os.StrictMode$ThreadPolicy;
import android.os.StrictMode;
import android.content.pm.ApplicationInfo;
import eud.b;

public class SoLoader	// class@00144b
{
    public static Context a;
    public static boolean b;

    public void SoLoader(){
       super();
    }
    public static void a(Context p0,boolean p1){
       int i = (p1)? 1: 0;
       try{
          SoLoader.init(p0, i);
          return;
       }catch(java.io.IOException e0){
          throw new RuntimeException(e0);
       }
    }
    public static boolean b(String p0){
       try{
          if (SoLoader.b) {
             d.a(SoLoader.a, p0);
          }else {
             SoLoader.e(p0);
          }
          return true;
       }catch(java.lang.Exception e0){
          return false;
       }
    }
    public static void init(Context p0,int p1){
       SoLoader.a = p0;
       if (!SoLoader.b) {
          StrictMode$ThreadPolicy threadPolicy = StrictMode.allowThreadDiskWrites();
          boolean b = (p0 != null && (p0.getApplicationInfo().flags & 0x0081))? true: false;
          SoLoader.m = b;
          SoLoader.c(null);
          SoLoader.d(p0, p1, null);
          StrictMode.setThreadPolicy(threadPolicy);
       }
       return;
    }
}
