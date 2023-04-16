package com.kuaishou.commercial.splash.presenter.f;
import im8.g;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kuaishou.commercial.splash.presenter.f$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.app.Activity;
import com.yxcorp.gifshow.activity.GifshowActivity;
import brd.t;
import com.trello.rxlifecycle3.components.support.RxFragmentActivity;
import gz.i;
import erd.g;
import crd.b;
import com.yxcorp.gifshow.util.rx.RxBus;
import bz.e;
import t45.d;
import brd.z;
import gz.h;
import wkd.b;
import tjc.c;
import tjc.b;
import yx.j0;
import java.lang.StringBuilder;
import iz.a;
import im8.f;
import java.lang.Boolean;
import com.kuaishou.commercial.splash.presenter.f$b;
import com.kwai.robust.PatchProxyResult;
import lnc.i3;
import java.lang.Integer;
import java.lang.Number;
import tl8.d;
import com.kuaishou.android.model.ads.PhotoAdvertisement;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AdData;
import com.kuaishou.android.model.ads.SplashInfo;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import tkd.b;
import tkd.d;
import nl9.h0;
import android.content.Context;
import com.kwai.framework.model.feed.BaseFeed;
import android.os.SystemClock;
import gz.m;
import java.util.Map;
import java.util.HashMap;

public class f extends PresenterV2 implements g	// class@0015ea
{
    public f A;
    public WeakReference B;
    public int C;
    public b D;
    public a3 E;
    public f p;
    public long q;
    public long r;
    public boolean s;
    public BaseFeed t;
    public f u;
    public boolean v;
    public double[] w;
    public float x;
    public int y;
    public int z;

    public void f(){
       super();
       this.v = false;
       this.y = 0;
       this.z = 0;
       this.E = new f$a(this);
    }
    public void E8(){
       b b;
       f uof = f.class;
       if (PatchProxy.applyVoid(null, this, uof, "2")) {
          return;
       }
       if (!this.getActivity() instanceof GifshowActivity) {
          return;
       }
       GifshowActivity activity = this.getActivity();
       if (!PatchProxy.applyVoidOneRefs(activity, this, uof, "7")) {
          this.X7(activity.m().subscribe(new i(this)));
       }
       this.X7(RxBus.f.f(e.class).observeOn(d.a).subscribe(new h(this)));
       b uob = b.a(-1608526086).a();
       String str = "SplashAdLogPresenter";
       int i = 0;
       if (uob == null) {
          Object[] objArray = new Object[i];
          j0.f(str, "log get data null", objArray);
          return;
       }else {
          this.D = uob;
          Object[] objArray1 = new Object[i];
          j0.f(str, "log get data "+a.a(uob), objArray1);
          b = uob.b;
          this.t = b;
          if (b == null) {
             return;
          }else {
             f tp = this.p;
             if (tp == null || !tp.get().booleanValue()) {
                this.v = i;
             }
             this.u.set(new f$b(this, uob));
             return;
          }
       }
    }
    public String P8(){
       Object[] objArray = null;
       f obj = PatchProxy.apply(objArray, this, f.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.w;
       if (obj != null) {
          int i = 2;
          if (obj.length > i) {
             i3 oi3 = i3.f();
             oi3.c("x", Integer.valueOf((int)this.w[0]));
             oi3.c("y", Integer.valueOf((int)this.w[1]));
             oi3.c("z", Integer.valueOf((int)this.w[i]));
             return oi3.e();
          }
       }
       return objArray;
    }
    public int R8(){
       f tz = this.z;
       if (tz != null) {
          f ty = this.y;
          if (ty != null) {
             return (int)(((float)ty / (float)tz) * 100.00f);
          }
       }
       return 0;
    }
    public int S8(b p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, f.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = 0;
       if (p0 != null) {
          b b = p0.b;
          if (b != null) {
             PhotoAdvertisement photoAdverti = b.get("AD");
             if (photoAdverti == null) {
                return i;
             }else {
                photoAdverti = photoAdverti.mAdData;
                if (photoAdverti != null) {
                   PhotoAdvertisement$AdData mSplashInfo = photoAdverti.mSplashInfo;
                   if (mSplashInfo != null) {
                      if (!TextUtils.x(mSplashInfo.mLiveStreamIds)) {
                         return 1;
                      }else if(d.a(-536296199).uc(p0.b, this.getContext())){
                         return 3;
                      }else {
                         return 13;
                      }
                   }
                }
             }
          }
       }
       return i;
    }
    public int V8(){
       Object obj = PatchProxy.apply(null, this, f.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = (this.Y8())? 1: 2;
       return i;
    }
    public long W8(){
       Object obj = PatchProxy.apply(null, this, f.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       if (this.r - null > 0) {
          return ((SystemClock.elapsedRealtime() - this.r) + this.q);
       }
       return this.q;
    }
    public boolean X8(){
       Object obj = PatchProxy.apply(null, this, f.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = this.A.get().booleanValue();
       Object[] objArray = new Object[0];
       j0.f("SplashAdLogPresenter", "hasSplashLeft hasToken: "+b, objArray);
       return b;
    }
    public final boolean Y8(){
       f obj = PatchProxy.apply(null, this, f.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.p;
       boolean b = (obj != null && obj.get().booleanValue())? true: false;
       return b;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, f.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new m();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, f.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(f.class, new m());
       }else {
          obj.put(f.class, null);
       }
       return obj;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, f.class, "1")) {
          return;
       }
       this.p = this.w8("SPLASH_EYEMAX");
       this.u = this.x8("SPLASH_AD_LOG");
       this.A = this.x8("HAS_TOKEN");
       return;
    }
}
