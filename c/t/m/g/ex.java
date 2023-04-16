package c.t.m.g.ex;
import android.content.Context;
import java.lang.String;
import android.os.Process;
import java.lang.Object;
import android.app.ActivityManager;
import java.util.List;
import java.util.Iterator;
import android.app.ActivityManager$RunningAppProcessInfo;
import android.os.Build$VERSION;
import java.io.File;
import java.lang.StringBuilder;
import android.os.Environment;
import java.lang.Throwable;
import java.lang.StringBuffer;
import java.io.StringWriter;
import java.io.PrintWriter;
import java.io.Writer;
import c.t.m.g.ew;
import java.lang.Thread;
import java.lang.System;
import android.util.Log;

public class ex	// class@000c81
{
    public static boolean a = false;
    public static Context b;
    public static boolean c = false;
    public static String d;

    public static String a(Context p0){
       ActivityManager$RunningAppProcessInfo runningAppPr;
       try{
          int i = Process.myPid();
          Iterator iterator = p0.getSystemService("activity").getRunningAppProcesses().iterator();
          while (true) {
             if (!iterator.hasNext()) {
                return null;
             }
             runningAppPr = iterator.next();
             if (runningAppPr.pid == i) {
                break ;
             }
          }
          return runningAppPr.processName;
       }catch(java.lang.Exception e0){
       }
    }
    public static String a(Context p0,String p1){
       File uFile;
       try{
          uFile = (Build$VERSION.SDK_INT >= 29)? new File(p0.getExternalFilesDir("data").getAbsolutePath(), ex.d+File.separator+p1): new File(Environment.getExternalStorageDirectory().getAbsolutePath(), ex.d+File.separator+p1);
       }catch(java.lang.Exception e0){
          uFile = new File(p0.getFilesDir().getAbsolutePath(), ex.d+File.separator+p1);
       }
       if (!uFile.exists()) {
          uFile.mkdirs();
       }
       return uFile.getAbsolutePath();
    }
    public static String a(Throwable p0){
       StringBuffer str = "";
       StringWriter stringWriter = new StringWriter();
       PrintWriter printWriter = new PrintWriter(stringWriter);
       p0.printStackTrace(printWriter);
       for (p0 = p0.getCause(); p0 != null; p0 = p0.getCause()) {
          p0.printStackTrace(printWriter);
       }
       printWriter.close();
       return str+stringWriter.toString();
    }
    public static void a(Context p0,File p1){
       if (ex.c) {
          return;
       }
       ex.c = true;
       ex.b = p0;
       if (ex.a) {
          ew.a(p0, p1);
       }
       return;
    }
    public static void a(String p0,int p1,String p2){
       if (ex.a) {
          p2 = System.currentTimeMillis()+",进程:"+ex.a(ex.b)+",线程:"+Thread.currentThread().getName()+","+p2;
          ew uoew = ew.a();
          if (uoew != null) {
             uoew.a(p0, p1, p2);
          }
       }
       return;
    }
    public static void a(String p0,String p1){
       ex.a(p0, 4, p1);
    }
    public static void a(String p0,String p1,Throwable p2){
       ex.a(p0, 6, p1+" exception: "+Log.getStackTraceString(p2));
    }
    public static void a(String p0,Throwable p1){
       if (ex.a) {
          ex.a(p0, 6, ex.a(p1));
       }
       return;
    }
    public static void b(String p0,String p1){
       ex.a(p0, 6, p1);
    }
}
