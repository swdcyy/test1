package lnc.d2;
import android.app.Activity;
import android.view.Display;
import com.kwai.performance.fluency.ipcproxy.lib.b;
import android.util.DisplayMetrics;
import cw9.c;
import java.lang.Math;
import android.content.res.Configuration;
import android.os.Build;
import java.lang.CharSequence;
import java.lang.String;
import java.lang.System;

public class d2	// class@001dbe
{
    public static int a;
    public static int b;
    public static boolean c;
    public static int d;
    public static long e;

    public static int a(Activity p0){
       return b.f().getHeight();
    }
    public static int b(Activity p0){
       int width = b.f().getWidth();
       d2.d = width;
       return width;
    }
    public static DisplayMetrics c(){
       try{
          DisplayMetrics uDisplayMetr = new DisplayMetrics();
          c.d(b.f(), uDisplayMetr);
          return uDisplayMetr;
       }catch(java.lang.Exception e0){
          return null;
       }
    }
    public static int d(){
       return d2.f();
    }
    public static int e(){
       DisplayMetrics uDisplayMetr = d2.c();
       if (uDisplayMetr == null) {
          return 0;
       }
       int i = Math.max(uDisplayMetr.widthPixels, uDisplayMetr.heightPixels);
       d2.a = i;
       return i;
    }
    public static int f(){
       DisplayMetrics uDisplayMetr = d2.c();
       if (uDisplayMetr == null) {
          return 0;
       }
       int i = Math.min(uDisplayMetr.widthPixels, uDisplayMetr.heightPixels);
       d2.b = i;
       return i;
    }
    public static boolean g(){
       if (d2.c) {
          return true;
       }
       d2.c = (d2.j())? true: d2.k();
       return d2.c;
    }
    public static boolean h(int p0,int p1){
       if (d2.c) {
          return true;
       }
       d2.c = (d2.j())? true: d2.l(p0, p1);
       return d2.c;
    }
    public static boolean i(Configuration p0){
       return d2.h(p0.screenWidthDp, p0.screenHeightDp);
    }
    public static boolean j(){
       String mODEL = Build.MODEL;
       boolean b = (!mODEL.contains("RLI-AN00") && (!mODEL.contains("RLI-N29") && (!mODEL.contains("TAH-N29") && (!mODEL.contains("TAH-AN00") && (!mODEL.contains("DHF-AL00") && (!mODEL.contains("PAL-AL00") && (!mODEL.contains("PAL-LX9") && (!mODEL.contains("DHF-LX9") && (!mODEL.contains("VER-AN00") && (!mODEL.contains("VES-AN00") && (!mODEL.contains("HUR-AN00") && (mODEL.contains("VER-AN10") || mODEL.contains("CAR-AN10")))))))))))))? true: false;
       return b;
    }
    public static boolean k(){
       if (!d2.a || !d2.b) {
          d2.n();
       }
       int b = d2.b;
       if (!b) {
          return false;
       }else {
          return d2.l(b, d2.a);
       }
    }
    public static boolean l(int p0,int p1){
       float f = ((float)p0 * 0x3f800000) / (float)p1;
       boolean b = (f - 0x3f100000 >= 0 && f - 0x3faaaaab <= 0)? true: false;
       return b;
    }
    public static boolean m(Configuration p0){
       return d2.l(p0.screenWidthDp, p0.screenHeightDp);
    }
    public static void n(){
       long l = System.currentTimeMillis();
       if ((l - d2.e) - 200 < 0) {
          return;
       }
       d2.e = l;
       DisplayMetrics uDisplayMetr = new DisplayMetrics();
       c.d(b.f(), uDisplayMetr);
       d2.a = Math.max(uDisplayMetr.widthPixels, uDisplayMetr.heightPixels);
       d2.b = Math.min(uDisplayMetr.widthPixels, uDisplayMetr.heightPixels);
       d2.d = uDisplayMetr.widthPixels;
       return;
    }
}
