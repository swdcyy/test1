package com.hpplay.sdk.source.process.c;
import android.content.ServiceConnection;
import android.content.Context;
import java.lang.String;
import com.hpplay.sdk.source.process.c$a;
import java.lang.Object;
import com.hpplay.sdk.source.process.c$1;
import com.hpplay.sdk.source.process.c$2;
import com.hpplay.sdk.source.process.c$3;
import com.hpplay.sdk.source.process.c$4;
import com.hpplay.sdk.source.process.c$5;
import com.hpplay.sdk.source.process.c$6;
import android.content.SharedPreferences;
import oe6.o;
import java.lang.Throwable;
import com.hpplay.sdk.source.a.a;
import com.hpplay.sdk.source.browse.api.IParceResultListener;
import com.hpplay.sdk.source.api.IConnectListener;
import com.hpplay.sdk.source.browse.api.IAPICallbackListener;
import com.hpplay.sdk.source.browse.api.AuthListener;
import com.hpplay.sdk.source.browse.api.IBrowseListener;
import com.hpplay.sdk.source.api.ILelinkPlayerListener;
import android.content.Intent;
import com.hpplay.sdk.source.process.LelinkSdkService;
import java.lang.Class;
import com.kwai.plugin.dva.feature.core.hook.a;
import com.hpplay.sdk.source.api.IBindSdkListener;
import android.os.Process;
import android.content.ComponentName;
import android.os.IBinder;
import com.hpplay.sdk.source.h;
import com.hpplay.sdk.source.h$a;
import com.hpplay.sdk.source.a;
import com.hpplay.sdk.source.c;
import com.hpplay.sdk.source.d;
import com.hpplay.sdk.source.f;
import com.hpplay.sdk.source.g;

public class c implements ServiceConnection	// class@00069e
{
    public f b;
    public c c;
    public e d;
    public g e;
    public a f;
    public d g;
    public String h;
    public String i;
    public String j;
    public String k;
    public String l;
    public String m;
    public Context n;
    public c$a o;
    public IConnectListener p;
    public IBrowseListener q;
    public ILelinkPlayerListener r;
    public IParceResultListener s;
    public IAPICallbackListener t;
    public AuthListener u;
    public IBindSdkListener v;
    public boolean w;
    public SharedPreferences x;

    public void c(Context p0,String p1,String p2,String p3,String p4,String p5,c$a p6){
       super();
       this.h = "MySConnection";
       this.w = false;
       this.b = new c$1(this);
       this.c = new c$2(this);
       this.d = new c$3(this);
       this.e = new c$4(this);
       this.f = new c$5(this);
       c$6 u6 = new c$6(this);
       try{
          this.g = u6;
          this.w = false;
          this.i = p1;
          this.j = p2;
          this.n = p0;
          this.k = p3;
          this.m = p4;
          this.l = p5;
          this.o = p6;
          this.x = o.c(p0, "pro_pid", 4);
       }catch(java.lang.Exception e3){
          a.b(this.h, e3);
       }
       return;
    }
    public static IParceResultListener a(c p0){
       return p0.s;
    }
    public static IConnectListener b(c p0){
       return p0.p;
    }
    public static IAPICallbackListener c(c p0){
       return p0.t;
    }
    public static String d(c p0){
       return p0.h;
    }
    public static boolean e(c p0){
       return p0.w;
    }
    public static AuthListener f(c p0){
       return p0.u;
    }
    public static IBrowseListener g(c p0){
       return p0.q;
    }
    public static ILelinkPlayerListener h(c p0){
       return p0.r;
    }
    public void a(){
       try{
          this.b();
          a.a(this.n, new Intent(this.n, LelinkSdkService.class), this, 1);
          a.f(this.h, "start bind");
       }catch(java.lang.Exception e0){
          a.b(this.h, e0);
       }
       return;
    }
    public void a(IBindSdkListener p0){
       this.v = p0;
    }
    public void a(IConnectListener p0){
       this.p = p0;
    }
    public void a(ILelinkPlayerListener p0){
       this.r = p0;
    }
    public void a(AuthListener p0){
       this.u = p0;
    }
    public void a(IAPICallbackListener p0){
       this.t = p0;
    }
    public void a(IBrowseListener p0){
       this.q = p0;
    }
    public void a(IParceResultListener p0){
       this.s = p0;
    }
    public void b(){
       c tn = this.n;
       if (tn != null) {
          try{
             tn.unbindService(this);
             a.f(this.h, "unbind");
          }catch(java.lang.Exception e0){
             a.b(this.h, e0);
          }
          try{
             int intx = this.x.getInt("pro_pid", 0);
             if (intx > 0 && intx != Process.myPid()) {
                Process.killProcess(intx);
             }
          }catch(java.lang.Exception e0){
             a.b(this.h, e0);
          }
       }
    }
    public void onServiceConnected(ComponentName p0,IBinder p1){
       a.f(this.h, "connected");
       h oh = h$a.asInterface(p1);
       if (oh != null) {
          try{
             c to = this.o;
             if (to != null) {
                to.onServiceConnected(oh);
             }
             oh.setLelinkServiceInfoListener(this.f);
             oh.setConnectStatusListener(this.c);
             oh.setLelinkPlayListenerListener(this.g);
             oh.setParceResultListener(this.b);
             oh.setAuthListener(this.e);
             a.e(this.n, new Intent(this.n, LelinkSdkService.class));
             c tv = this.v;
             if (tv != null) {
                tv.onBindCallback(true);
             }
          }catch(java.lang.Exception e2){
             a.b(this.h, e2);
          }
       }
    }
    public void onServiceDisconnected(ComponentName p0){
       boolean b = false;
       this.w = b;
       c to = this.o;
       if (to != null) {
          to.onServiceDisconnected();
       }
       to = this.v;
       if (to != null) {
          to.onBindCallback(b);
       }
       a.f(this.h, "disconnected");
       return;
    }
}
