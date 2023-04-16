package com.xiaomi.push.service.u;
import ys8.i;
import android.content.Context;
import java.lang.Object;
import java.util.concurrent.ConcurrentHashMap;
import java.lang.String;
import android.content.SharedPreferences;
import oe6.o;
import java.lang.System;
import java.lang.Math;
import ws8.k;
import com.xiaomi.push.service.v;
import java.lang.Runnable;
import java.lang.StringBuilder;
import com.xiaomi.push.service.u$a;
import android.content.SharedPreferences$Editor;
import ws8.d7;

public final class u implements i	// class@001195
{
    public SharedPreferences a;
    public long b;
    public boolean c;
    public ConcurrentHashMap d;
    public Context e;
    public static u f;

    public void u(Context p0){
       super();
       this.c = false;
       this.d = new ConcurrentHashMap();
       this.e = p0.getApplicationContext();
       this.a = o.c(p0, "sync", false);
    }
    public static SharedPreferences a(u p0){
       return p0.a;
    }
    public static u b(){
       return u.f;
    }
    public static u c(Context p0){
       if (u.f == null) {
          _monitor_enter(u.class);
          if (u.f == null) {
             u.f = new u(p0);
          }
          _monitor_exit(u.class);
       }
       return u.f;
    }
    public static ConcurrentHashMap e(u p0){
       return p0.d;
    }
    public static boolean h(u p0,boolean p1){
       p0.c = p1;
       return p1;
    }
    public void a(){
       if (this.c != null) {
          return;
       }
       long l = System.currentTimeMillis();
       if ((l - this.b) - 0x36ee80 < 0) {
          return;
       }
       this.b = l;
       this.c = true;
       k.f(this.e).h(new v(this), (int)(Math.random() * 10.00f));
       return;
    }
    public String d(String p0,String p1){
       return this.a.getString(p0+":"+p1, "");
    }
    public void f(u$a p0){
       if (this.d.putIfAbsent(p0.b, p0) == null) {
          k.f(this.e).h(p0, ((int)(Math.random() * 30.00f) + 10));
       }
       return;
    }
    public void g(String p0,String p1,String p2){
       d7.a(u.f.a.edit().putString(p0+":"+p1, p2));
    }
}
