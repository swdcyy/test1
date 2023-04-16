package com.kwai.component.tti.monitor.a;
import a76.a;
import com.google.gson.Gson;
import java.util.concurrent.atomic.AtomicBoolean;
import java.lang.Object;
import com.kwai.component.tti.monitor.TTIData;
import android.os.Handler;
import android.os.Looper;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import com.kwai.component.tti.TTIStrategy;
import o56.d;
import o56.a;
import oe6.a;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.kwai.sdk.switchconfig.a;
import km8.b;
import android.content.SharedPreferences;
import java.lang.StringBuilder;
import ph5.i;
import sh5.a;
import java.lang.Runnable;
import android.os.SystemClock;
import rh5.b;
import com.kwai.framework.activitycontext.ActivityContext;
import android.app.Activity;
import com.kwai.performance.fluency.fps.monitor.FpsMonitor;
import wkd.b;
import com.yxcorp.gifshow.OnlineSystraceManager;
import ekd.e0;
import android.content.Context;
import com.kwai.component.tti.monitor.a$a;
import fw8.r;
import fw8.r$a;
import com.kwai.component.tti.TTIStrategy$Scene;
import sh5.b;
import t45.c;

public abstract class a implements a	// class@000bcf
{
    public long b;
    public long c;
    public long d;
    public AtomicBoolean e;
    public AtomicBoolean f;
    public boolean g;
    public boolean h;
    public int i;
    public TTIData j;
    public final Handler k;
    public Activity l;
    public r$a m;
    public GestureDetector n;
    public static final Gson o;
    public static final AtomicBoolean p;

    static {
       a.o = new Gson();
       a.p = new AtomicBoolean(false);
    }
    public void a(){
       super();
       this.e = new AtomicBoolean(false);
       this.f = new AtomicBoolean(false);
       this.i = 1000;
       this.j = TTIData.getInstance();
       this.k = new Handler(Looper.myLooper());
       this.l = null;
    }
    public boolean a(){
       boolean b;
       boolean b1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       a uoa = a.class;
       Object[] objArray = null;
       String obj = PatchProxy.apply(objArray, this, uoa, "6");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       if (!TTIStrategy.d && (!TTIStrategy.c && !d.j)) {
          obj = PatchProxy.apply(objArray, this, uoa, "7");
          if (obj != patchProxyRe) {
             b = obj.booleanValue();
          }else if(this.f.compareAndSet(false, true)){
             obj = (("UNKNOWN").equals(a.n))? a.s(): a.n;
             b = (!TextUtils.equals(a.m, obj) && a.t().d("filtFirstStartUpOnUpgrade", true))? true: false;
             this.h = b;
          }
          b = this.h;
          if (b == null) {
             Object obj1 = PatchProxy.apply(objArray, this, uoa, "8");
             if (obj1 != patchProxyRe) {
                b1 = obj1.booleanValue();
             }else if(this.e.compareAndSet(false, true)){
                uoa = this.j;
                b1 = (b.b("DefaultPreferenceHelper").getInt(b.d("user")+"enableFeaturedDanmaku", false) == 2)? true: false;
                uoa.isDanmuopen = b1;
                b1 = (b1 && a.t().d("DisableFeaturedDanmakuUpload", true))? true: false;
                this.g = b1;
             }
             b1 = this.g;
             if (b1 == null) {
                return false;
             }
          }
       }
    label_00c4 :
       return true;
    }
    public void start(){
       if (PatchProxy.applyVoid(null, this, a.class, "2")) {
          return;
       }
       this.j.cleanData();
       this.k.postDelayed(new a(this), (long)(i.a.getInt("TTIMonitorTime", 30) * 1000));
       a tj = this.j;
       tj.cold = this.b;
       tj.begin = TTIStrategy.a;
       tj.beginUptimeMillis = TTIStrategy.b;
       tj.start = SystemClock.elapsedRealtime();
       b.b("FEATURED_PAGE").c(true);
       Activity uActivity = ActivityContext.g().e();
       this.l = uActivity;
       if (uActivity != null) {
          FpsMonitor.startSection("TTI_SCENE", uActivity);
       }
       b.a(-2022051331).e(e0.b, 2);
       this.m = new a$a(this);
       r.c().a(this.m);
       return;
    }
    public void stop(){
       a uoa = a.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoa, "3")) {
          return;
       }
       this.j.setTTITimeOver();
       b.b("FEATURED_PAGE").c(false);
       a tl = this.l;
       if (tl != null) {
          FpsMonitor.stopSection("TTI_SCENE", tl);
          this.l = objArray;
       }
       if (this.m != null) {
          r.c().g(this.m);
          this.m = objArray;
       }
       if (a.p.compareAndSet(true, false)) {
          if (TTIStrategy$Scene.f) {
             this.j.cleanData();
          }else if(TTIStrategy$Scene.c()){
             this.j.cleanData();
          }else if(PatchProxy.applyVoid(objArray, this, uoa, "4")){
             c.a(new b(this));
          }
       }
       TTIStrategy.h = objArray;
       b.a(-2022051331).h(2);
       return;
    }
}
