package com.kwai.performance.stability.oom.monitor.OOMPreferenceManager;
import com.kwai.performance.stability.oom.monitor.OOMPreferenceManager$mPreferences$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.lang.Object;
import android.content.SharedPreferences;
import java.lang.StringBuilder;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.System;
import android.content.SharedPreferences$Editor;
import oe6.g;

public final class OOMPreferenceManager	// class@001255
{
    public static final p a;
    public static l b;
    public static String c;
    public static final OOMPreferenceManager d;

    static {
       OOMPreferenceManager.d = new OOMPreferenceManager();
       OOMPreferenceManager.a = s.c(OOMPreferenceManager$mPreferences$2.INSTANCE);
    }
    public void OOMPreferenceManager(){
       super();
    }
    public final int a(){
       SharedPreferences sharedPrefer = this.c();
       StringBuilder str = "";
       String c = OOMPreferenceManager.c;
       if (c == null) {
          a.S("mPrefix");
       }
       return sharedPrefer.getInt(str+c+"times", 0);
    }
    public final long b(){
       SharedPreferences sharedPrefer = this.c();
       StringBuilder str = "";
       String c = OOMPreferenceManager.c;
       if (c == null) {
          a.S("mPrefix");
       }
       c = "first_analysis_time";
       long l = 0;
       long longx = sharedPrefer.getLong(str+c+c, l);
       if (!longx - l) {
          longx = System.currentTimeMillis();
          SharedPreferences sharedPrefer1 = this.c();
          StringBuilder str1 = "";
          String c1 = OOMPreferenceManager.c;
          if (c1 == null) {
             a.S("mPrefix");
          }
          if (!sharedPrefer1.contains(str1+c1+c)) {
             SharedPreferences$Editor uEditor = this.c().edit();
             str1 = "";
             c1 = OOMPreferenceManager.c;
             if (c1 == null) {
                a.S("mPrefix");
             }
             g.a(uEditor.putLong(str1+c1+c, longx));
          }
       }
       return longx;
    }
    public final SharedPreferences c(){
       return OOMPreferenceManager.a.getValue();
    }
}
