package com.tencent.open.log.SLog;
import com.tencent.open.log.TraceLevel;
import java.lang.Object;
import java.io.File;
import com.tencent.open.log.c;
import com.tencent.open.log.d$c;
import com.tencent.open.log.d$b;
import android.os.Environment;
import java.lang.String;
import com.tencent.open.utils.f;
import java.lang.Throwable;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.tencent.open.log.d;
import java.lang.StringBuilder;
import com.tencent.open.log.e;
import java.lang.Thread;
import java.lang.System;
import com.tencent.open.log.Tracer;
import com.tencent.open.log.d$a;
import com.tencent.open.log.a;
import com.tencent.open.log.b;

public class SLog implements TraceLevel	// class@000f5e
{
    public a a;
    public Tracer b;
    public static boolean c;
    public static SLog instance;

    public void SLog(){
       super();
    }
    public static File a(){
       String d = c.d;
       d$c uoc = d$b.b();
       File uFile = (uoc != null && uoc.c() - c.f > 0)? 1: null;
       uFile = (uFile)? new File(Environment.getExternalStorageDirectory(), d): new File(f.c(), d);
    label_0034 :
       return uFile;
    }
    public static final void d(String p0,String p1){
       SLog.getInstance().a(2, p0, p1, null);
    }
    public static final void d(String p0,String p1,Throwable p2){
       SLog.getInstance().a(2, p0, p1, p2);
    }
    public static final void e(String p0,String p1){
       SLog.getInstance().a(16, p0, p1, null);
    }
    public static final void e(String p0,String p1,Throwable p2){
       SLog.getInstance().a(16, p0, p1, p2);
    }
    public static void flushLogs(){
       SLog.getInstance().c();
    }
    public static SLog getInstance(){
       if (SLog.instance == null) {
          SLog sLog = SLog.class;
          _monitor_enter(sLog);
          if (SLog.instance == null) {
             SLog sLog1 = new SLog();
             SLog.instance = sLog1;
             sLog1.d();
             SLog.c = true;
          }
          _monitor_exit(sLog);
       }
       return SLog.instance;
    }
    public static final void i(String p0,String p1){
       SLog.getInstance().a(4, p0, p1, null);
    }
    public static final void i(String p0,String p1,Throwable p2){
       SLog.getInstance().a(4, p0, p1, p2);
    }
    public static void release(){
       _monitor_enter(SLog.class);
       SLog.getInstance().b();
       if (SLog.instance != null) {
          SLog.instance = null;
       }
       _monitor_exit(SLog.class);
       return;
    }
    public static final void u(String p0,String p1){
       SLog.getInstance().a(32, p0, p1, null);
    }
    public static final void u(String p0,String p1,Throwable p2){
       SLog.getInstance().a(32, p0, p1, p2);
    }
    public static final void v(String p0,String p1){
       SLog.getInstance().a(1, p0, p1, null);
    }
    public static final void v(String p0,String p1,Throwable p2){
       SLog.getInstance().a(1, p0, p1, p2);
    }
    public static final void w(String p0,String p1){
       SLog.getInstance().a(8, p0, p1, null);
    }
    public static final void w(String p0,String p1,Throwable p2){
       SLog.getInstance().a(8, p0, p1, p2);
    }
    public final String a(String p0){
       if (TextUtils.isEmpty(p0)) {
          return "";
       }
       if (d.a(p0)) {
          p0 = "xxxxxx";
       }
       return p0;
    }
    public void a(int p0,String p1,String p2,Throwable p3){
       SLog ta;
       if (SLog.c) {
          String str = f.b();
          if (!TextUtils.isEmpty(str)) {
             str = str+" SDK_VERSION:"+"3.5.4.lite";
             if (this.a == null) {
                return;
             }else {
                int i = 32;
                String str1 = str;
                e.a.a(i, Thread.currentThread(), System.currentTimeMillis(), "openSDK_LOG", str1, null);
                this.a.a(i, Thread.currentThread(), System.currentTimeMillis(), "openSDK_LOG", str1, null);
                SLog.c = false;
             }
          }
       }
       e.a.a(p0, Thread.currentThread(), System.currentTimeMillis(), p1, p2, p3);
       if (d$a.a(c.b, p0)) {
          ta = this.a;
          if (ta == null) {
             return;
          }else {
             ta.a(p0, Thread.currentThread(), System.currentTimeMillis(), p1, p2, p3);
          }
       }
       try{
          ta = this.b;
          if (ta != null) {
             ta.a(p0, Thread.currentThread(), System.currentTimeMillis(), p1, this.a(p2), p3);
          }
          return;
       }catch(java.lang.Exception e0){
       }
    }
    public void b(){
       SLog ta = this.a;
       if (ta != null) {
          ta.a();
          this.a.b();
          this.a = null;
       }
       return;
    }
    public void c(){
       SLog ta = this.a;
       if (ta != null) {
          ta.a();
       }
       return;
    }
    public final void d(){
       b uob = new b(SLog.a(), c.m, c.g, c.h, c.c, (long)c.i, 10, c.e, c.n);
       this.a = new a(v12);
    }
    public void setCustomLogger(Tracer p0){
       this.b = p0;
    }
}
