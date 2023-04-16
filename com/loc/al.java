package com.loc.al;
import java.util.Vector;
import android.content.Context;
import java.lang.String;
import android.content.SharedPreferences;
import oe6.o;
import java.util.List;
import android.os.Looper;
import java.lang.Throwable;
import java.lang.System;
import com.loc.cj;
import com.loc.al$1;
import com.loc.ck;
import com.loc.cl;
import com.loc.an;
import android.content.SharedPreferences$Editor;
import oe6.g;
import com.loc.w;
import java.lang.Object;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.StringBuilder;
import java.io.File;

public final class al	// class@00136c
{
    public static final String a = "/a/";
    public static final String b = "b";
    public static final String c = "c";
    public static final String d = "d";
    public static String e = "s";
    public static final String f = "g";
    public static final String g = "h";
    public static final String h = "e";
    public static final String i = "f";
    public static final String j = "j";
    public static final String k = "k";
    public static long l;
    public static Vector m;

    static {
       al.m = new Vector();
    }
    public static String a(Context p0,String p1){
       return o.c(p0, "AMSKLG_CFG", 0).getString(p1, "");
    }
    public static List a(){
       Looper mainLooper = Looper.getMainLooper();
       _monitor_enter(mainLooper);
       _monitor_exit(mainLooper);
       return al.m;
    }
    public static void a(Context p0){
       if ((System.currentTimeMillis() - al.l) - 0xea60 < 0) {
          return;
       }
       al.l = System.currentTimeMillis();
       cj.a().b(new al$1(p0));
       return;
    }
    public static void a(Context p0,String p1,String p2){
       SharedPreferences$Editor uEditor = o.c(p0, "AMSKLG_CFG", 0).edit();
       uEditor.putString(p1, p2);
       g.a(uEditor);
    }
    public static void a(w p0){
       Looper mainLooper = Looper.getMainLooper();
       _monitor_enter(mainLooper);
       if (p0 == null) {
          _monitor_exit(mainLooper);
          return;
       }else if(al.m.contains(p0)){
          _monitor_exit(mainLooper);
          return;
       }else {
          al.m.add(p0);
          _monitor_exit(mainLooper);
          return;
       }
    }
    public static boolean a(String[] p0,String p1){
       if (p0 != null && p1 != null) {
          String[] stringArray = p1.split("\n");
          int len = stringArray.length;
          int i = 0;
          while (true) {
             boolean b = true;
             if (i < len) {
                String str = (stringArray[i]).trim();
                if (TextUtils.isEmpty(str) || (!str.startsWith("at ") || !str.contains("uncaughtException"))) {
                   b = false;
                }
                if (b) {
                   return false;
                }else {
                   i = i + 1;
                }
             }else {
                len = stringArray.length;
                i = 0;
                while (i < len) {
                   if (al.b(p0, (stringArray[i]).trim())) {
                      return b;
                   }
                   i = i + 1;
                }
             }
          }
       }
       return false;
    }
    public static void b(Context p0,String p1){
       SharedPreferences$Editor uEditor = o.c(p0, "AMSKLG_CFG", 0).edit();
       uEditor.remove(p1);
       g.a(uEditor);
    }
    public static boolean b(String[] p0,String p1){
       if (p0 != null && p1 != null) {
          int len = p0.length;
          int i = 0;
          while (i < len) {
             object oobject = p0[i];
             p1 = p1.trim();
             if ((p1.startsWith("at ") && (p1.contains(oobject+".") && (p1.endsWith("\)") && !p1.contains("uncaughtException"))))) {
                return true;
             }
             i = i + 1;
          }
       }
       return false;
    }
    public static String c(Context p0,String p1){
       return p0.getFilesDir().getAbsolutePath()+al.a+p1;
    }
}
