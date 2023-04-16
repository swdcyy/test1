package com.hpplay.sdk.source.process.LelinkSdkService;
import android.app.Service;
import com.hpplay.sdk.source.process.LelinkSdkService$1;
import com.hpplay.sdk.source.process.LelinkSdkService$2;
import com.hpplay.sdk.source.process.LelinkSdkService$3;
import com.hpplay.sdk.source.process.LelinkSdkService$4;
import com.hpplay.sdk.source.process.LelinkSdkService$5;
import com.hpplay.sdk.source.a;
import com.hpplay.sdk.source.c;
import com.hpplay.sdk.source.d;
import com.hpplay.sdk.source.f;
import com.hpplay.sdk.source.process.a;
import java.lang.System;
import java.lang.Thread;
import java.lang.StringBuilder;
import java.lang.String;
import com.hpplay.sdk.source.a.a;
import android.content.Intent;
import android.os.IBinder;
import android.content.Context;
import android.content.SharedPreferences;
import oe6.o;
import android.content.SharedPreferences$Editor;
import android.os.Process;
import oe6.g;
import android.app.Application;
import com.hpplay.sdk.source.permission.d;
import android.os.Build$VERSION;
import com.hpplay.sdk.source.process.b;

public class LelinkSdkService extends Service	// class@000689
{
    public long b;
    public h$a c;
    public IParceResultListener d;
    public IConnectListener e;
    public IBrowseListener f;
    public ILelinkPlayerListener g;
    public a i;
    public c j;
    public d k;
    public f l;
    public a m;

    public void LelinkSdkService(){
       super();
       this.c = new LelinkSdkService$1(this);
       this.d = new LelinkSdkService$2(this);
       this.e = new LelinkSdkService$3(this);
       this.f = new LelinkSdkService$4(this);
       this.g = new LelinkSdkService$5(this);
    }
    public static a a(LelinkSdkService p0,a p1){
       p0.i = p1;
       return p1;
    }
    public static c a(LelinkSdkService p0,c p1){
       p0.j = p1;
       return p1;
    }
    public static d a(LelinkSdkService p0,d p1){
       p0.k = p1;
       return p1;
    }
    public static f a(LelinkSdkService p0,f p1){
       p0.l = p1;
       return p1;
    }
    public static a a(LelinkSdkService p0){
       return p0.m;
    }
    public static f b(LelinkSdkService p0){
       return p0.l;
    }
    public static c c(LelinkSdkService p0){
       return p0.j;
    }
    public static a d(LelinkSdkService p0){
       return p0.i;
    }
    public static d e(LelinkSdkService p0){
       return p0.k;
    }
    public void a(boolean p0,boolean p1){
       if ((System.currentTimeMillis() - this.b) - 200 < 0) {
          return;
       }
       LelinkSdkService tm = this.m;
       if (tm == null || !tm.isAlive()) {
          a uoa = new a(p0, p1);
          this.m = uoa;
          uoa.start();
       }
       a.f("threadTs", " "+this.m.isAlive());
       this.m.a();
       this.b = System.currentTimeMillis();
       return;
    }
    public IBinder onBind(Intent p0){
       return this.c;
    }
    public void onCreate(){
       super.onCreate();
       g.a(o.c(this, "pro_pid", 4).edit().putInt("pro_pid", Process.myPid()));
       if (d.a(this.getApplication(), "android.permission.READ_PHONE_STATE") == -1 && Build$VERSION.SDK_INT <= 28) {
          b.b().a(this);
       }
       return;
    }
    public int onStartCommand(Intent p0,int p1,int p2){
       return super.onStartCommand(p0, p1, p2);
    }
}
