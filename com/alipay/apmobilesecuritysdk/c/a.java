package com.alipay.apmobilesecuritysdk.c.a;
import android.content.Context;
import java.lang.String;
import a7.a;
import java.lang.StringBuilder;
import java.io.File;
import java.util.Calendar;
import java.util.Date;
import java.text.SimpleDateFormat;
import a7.d;
import java.util.ArrayList;
import java.lang.Object;
import java.util.List;
import java.lang.Throwable;
import android.os.Build;

public final class a	// class@000e63
{

    public static synchronized void a(Context p0,String p1,String p2,String p3){
       _monitor_enter(a.class);
       _monitor_enter(d.class);
       d.a = p0.getFilesDir().getAbsolutePath()+"/log/ap";
       d.b = new SimpleDateFormat("yyyyMMdd").format(Calendar.getInstance().getTime())+".log";
       d.c = a.b(p0, p1, p2, p3).toString();
       _monitor_exit(d.class);
       _monitor_exit(a.class);
    }
    public static synchronized void a(String p0){
       _monitor_enter(a.class);
       _monitor_enter(d.class);
       ArrayList uArrayList = new ArrayList();
       uArrayList.add(p0);
       d.b(uArrayList);
       _monitor_exit(d.class);
       _monitor_exit(a.class);
    }
    public static synchronized void a(Throwable p0){
       _monitor_enter(a.class);
       d.a(p0);
       _monitor_exit(a.class);
    }
    public static a b(Context p0,String p1,String p2,String p3){
       String packageName = p0.getPackageName();
       String str = packageName;
       a uoa = new a(Build.MODEL, str, "APPSecuritySDK-ALIPAYSDK", "3.4.0.202109291244", p1, p2, p3);
       return packageName;
    }
}
