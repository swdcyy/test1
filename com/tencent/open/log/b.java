package com.tencent.open.log.b;
import java.lang.String;
import java.text.SimpleDateFormat;
import com.tencent.open.log.d$d;
import java.io.File;
import java.lang.Object;
import java.util.Calendar;
import java.util.Date;
import java.lang.System;
import java.lang.StringBuilder;
import java.lang.Throwable;
import com.tencent.open.log.SLog;
import com.tencent.open.utils.k;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.tencent.open.log.c;

public class b	// class@000f62
{
    public String b;
    public int c;
    public int d;
    public int e;
    public long f;
    public File g;
    public int h;
    public String i;
    public long j;
    public static SimpleDateFormat a;

    static {
       b.a = d$d.a("yy.MM.dd.HH");
    }
    public void b(File p0,int p1,int p2,int p3,String p4,long p5,int p6,String p7,long p8){
       super();
       this.b = "Tracer.File";
       this.c = Integer.MAX_VALUE;
       this.d = Integer.MAX_VALUE;
       this.e = 4096;
       this.f = 0x2710;
       this.h = 10;
       this.i = ".log";
       this.j = Long.MAX_VALUE;
       this.a(p0);
       this.b(p1);
       this.a(p2);
       this.c(p3);
       this.a(p4);
       this.b(p5);
       this.d(p6);
       this.b(p7);
       this.c(p8);
    }
    public static String a(long p0){
       Calendar instance = Calendar.getInstance();
       instance.setTimeInMillis(p0);
       return new SimpleDateFormat("yy.MM.dd.HH").format(instance.getTime());
    }
    public void a(int p0){
       this.c = p0;
    }
    public void a(File p0){
       this.g = p0;
    }
    public void a(String p0){
       this.b = p0;
    }
    public File[] a(){
       return this.d(System.currentTimeMillis());
    }
    public File b(){
       File uFile = this.e();
       if (uFile != null) {
          uFile.mkdirs();
       }
       return uFile;
    }
    public void b(int p0){
       this.d = p0;
    }
    public void b(long p0){
       this.f = p0;
    }
    public void b(String p0){
       this.i = p0;
    }
    public String c(){
       return this.b;
    }
    public final String c(String p0){
       return "com.tencent.mobileqq_connectSdk."+p0+".log";
    }
    public void c(int p0){
       this.e = p0;
    }
    public void c(long p0){
       this.j = p0;
    }
    public int d(){
       return this.e;
    }
    public void d(int p0){
       this.h = p0;
    }
    public final File[] d(long p0){
       File[] uFileArray;
       String str = this.c(b.a(p0));
       File uFile = new File(this.b(), str);
       String str1 = k.b();
       object oobject = null;
       if (!TextUtils.isEmpty(str1) || str1 != null) {
          try{
             File uFile1 = new File(str1, c.o);
             if (!uFile1.exists()) {
                uFile1.mkdirs();
             }
             oobject = new File(uFile1, str);
          }catch(java.lang.Exception e6){
             SLog.e("openSDK_LOG", "getWorkFile,get app specific file exception:", e6);
          }
       }
    }
    public File e(){
       return this.g;
    }
    public int f(){
       return this.h;
    }
}
