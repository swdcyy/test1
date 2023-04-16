package com.kuaishou.commercial.splash.SplashV2Activity;
import com.yxcorp.gifshow.activity.GifshowActivity;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.app.Activity;
import wkd.b;
import gb5.a;
import android.content.res.Resources;
import com.kwai.robust.PatchProxyResult;
import android.view.ContextThemeWrapper;
import com.kwai.plugin.dva.feature.core.loader.AssetManagerHook;
import android.os.Bundle;
import android.content.Intent;
import com.kuaishou.commercial.perf.tracker.CommercialSplashTracker;
import java.lang.StringBuilder;
import android.os.SystemClock;
import yx.j0;
import java.lang.Boolean;
import tjc.c;
import com.yxcorp.gifshow.util.rx.RxBus;
import ujc.e;
import brd.t;
import t45.d;
import brd.z;
import yy.r2;
import erd.g;
import crd.b;
import android.view.Window;
import android.view.View;
import zf6.k;
import com.kuaishou.commercial.splash.presenter.h;
import gz.s;
import yy.q2;
import tjc.c$a;
import mrd.c;
import yy.s2;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kuaishou.commercial.splash.presenter.e;
import gz.e3;
import com.kuaishou.commercial.splash.presenter.n;
import az.a;
import gz.e;
import gz.u2;
import com.kuaishou.commercial.splash.presenter.f;
import gz.b3;
import com.kuaishou.commercial.splash.presenter.j;
import com.kuaishou.commercial.splash.presenter.b;
import com.kuaishou.commercial.splash.presenter.h0;
import com.kuaishou.commercial.splash.presenter.u;
import com.kuaishou.commercial.splash.presenter.b0;
import gz.u;
import gz.f2;
import gz.i1;
import com.kuaishou.commercial.splash.presenter.z;
import com.kuaishou.commercial.splash.presenter.w0;
import com.kuaishou.commercial.splash.presenter.q0;
import com.kuaishou.commercial.splash.presenter.y0;
import com.kuaishou.commercial.splash.presenter.c1;
import com.kuaishou.commercial.splash.presenter.r0;
import com.kuaishou.commercial.splash.presenter.k0;
import android.view.ViewGroup;
import android.content.Context;
import i2b.a;
import com.kuaishou.commercial.drawloggerwidget.DispatchDrawFrameLayout;
import lnc.b9;
import io.reactivex.subjects.PublishSubject;
import org.greenrobot.eventbus.a;
import com.yxcorp.gifshow.event.PlayerVolumeEvent;
import com.yxcorp.gifshow.event.PlayerVolumeEvent$Status;
import com.kuaishou.commercial.splash.e0;
import java.lang.Runnable;
import t45.c;
import com.kuaishou.commercial.splash.SplashUtils;
import java.lang.Integer;
import gz.v3;
import gz.m2;
import gz.y3;
import gz.g3;
import gz.p3;
import com.kuaishou.commercial.splash.presenter.SplashShakePresenter;
import gz.l3;
import com.kwai.sdk.switchconfig.a;
import gz.k3;
import android.view.WindowManager$LayoutParams;
import android.os.Build$VERSION;

public class SplashV2Activity extends GifshowActivity	// class@00159c
{
    public b A;
    public boolean B;
    public b C;
    public PresenterV2 y;
    public h z;
    public static int D;

    public void SplashV2Activity(){
       super();
       this.B = false;
       this.C = null;
    }
    public int M(){
       return 7;
    }
    public void finish(){
       if (PatchProxy.applyVoid(null, this, SplashV2Activity.class, "8")) {
          return;
       }
       super.finish();
       this.overridePendingTransition(0, 0);
       b.a(0x8708467).i();
       return;
    }
    public int getPage(){
       return 0x7d8f;
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, SplashV2Activity.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       AssetManagerHook.loadSplitResourcesIfResourceOpening(this, super.getResources());
       return super.getResources();
    }
    public String getUrl(){
       return "ks://splash";
    }
    public void onCreate(Bundle p0){
       int b;
       Object[] objArray2;
       SplashV2Activity tz;
       h k;
       h j;
       SplashV2Activity splashV2Acti = SplashV2Activity.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, splashV2Acti, "1")) {
          return;
       }
       super.onCreate(p0);
       CommercialSplashTracker.E().O(1);
       CommercialSplashTracker.E().L(this.getIntent().getLongExtra("startActivityTimeStamp", -1));
       Object[] objArray = new Object[0];
       j0.f("SplashV2Activity", "delay fragment splash at "+SystemClock.elapsedRealtime(), objArray);
       CommercialSplashTracker.E().N(SystemClock.elapsedRealtime());
       b.a(0x8708467).j();
       SplashV2Activity.D = SplashV2Activity.D + 1;
       objArray = new Object[0];
       j0.f("SplashV2Activity", "create "+this, objArray);
       Object[] objArray1 = null;
       View obj = PatchProxy.apply(objArray1, this, splashV2Acti, "10");
       long l = -1608526086;
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else if(b.a(l).S() && b.a(l).X()){
          b = true;
       }else {
          b = false;
       }
       if (!b) {
          objArray2 = new Object[0];
          j0.l("SplashV2Activity", "no splash data! "+this, objArray2);
          CommercialSplashTracker.E().U(1);
          this.finish();
          return;
       }else {
          this.A = RxBus.f.f(e.class).observeOn(d.a).subscribe(new r2(this));
          this.getWindow().addFlags(128);
          this.w3(this);
          this.setContentView(R.layout.arg_RES_7f0d0037);
          b = 0x7f0a0a7a;
          View view = this.findViewById(b);
          if (view == null) {
             objArray1 = new Object[0];
             j0.c("SplashV2Activity", "rootView is null ", objArray1);
             this.finish();
             return;
          }else if(PatchProxy.applyVoidOneRefs(view, this, splashV2Acti, "11")){
             obj = view.findViewById(b);
             if (k.f()) {
                obj.setBackgroundResource(R.color.arg_RES_7f061d74);
             }else {
                obj.setBackgroundResource(R.color.arg_RES_7f061e52);
             }
          }
          this.z = new h(this, 1);
          if (!PatchProxy.applyVoid(objArray1, this, splashV2Acti, "2")) {
             h k1 = this.z.k;
             if (k1 != null && k1.I != null) {
                b.a(l).H(new q2(this));
             }
          }
          this.C = this.z.a().subscribe(new s2(this));
          if (!PatchProxy.applyVoid(objArray1, this, splashV2Acti, "13")) {
             obj = this.findViewById(0x1020002);
             CommercialSplashTracker.E().R(SystemClock.elapsedRealtime());
             if (!PatchProxy.applyVoid(objArray1, this, splashV2Acti, "15")) {
                PresenterV2 presenterV2 = new PresenterV2();
                this.y = presenterV2;
                tz = this.z;
                k = tz.k;
                j = tz.j;
                presenterV2.U7(new e());
                this.y.U7(new e3());
                this.y.U7(new n());
                if (k != null && k.a != null) {
                   if (a.a()) {
                      this.y.U7(new e());
                   }else if(k.X != null){
                      this.y.U7(new f());
                      this.y.U7(new b3());
                   }else {
                      this.y.U7(new j());
                   }
                   this.y.U7(new b());
                   this.y.U7(new h0());
                   if (k.W == 2) {
                      this.y.U7(new u());
                      this.y.U7(new b0());
                      this.y.U7(new u());
                      if (k.G != null) {
                         this.y.U7(new f2());
                      }
                      this.u3(k.k);
                      this.y.U7(new i1());
                   }else {
                      this.y.U7(new z());
                      this.y.U7(new b0());
                   }
                }else if(j != null && j.a != null){
                   if (a.a()) {
                      this.y.U7(new e());
                   }else {
                      this.y.U7(new f());
                      this.y.U7(new b3());
                   }
                   this.y.U7(new w0());
                   this.y.U7(new q0());
                   this.y.U7(new y0());
                   this.y.U7(new c1());
                   if (j.W != null) {
                      this.y.U7(new k0());
                   }
                   this.y.U7(new u());
                   if (j.G != null) {
                      this.y.U7(new f2());
                   }
                   this.u3(j.k);
                   this.y.U7(new i1());
                }else {
                   Object[] objArray3 = new Object[0];
                   j0.f("SplashV2Activity", "invalid param, finish", objArray3);
                   this.finish();
                }
             }
             if (!PatchProxy.applyVoid(objArray1, this, splashV2Acti, "14")) {
                ViewGroup viewGroup = this.findViewById(R.id.splash_content);
                tz = this.z;
                k = tz.k;
                j = tz.j;
                if (k != null) {
                   objArray1 = (k.W == 2)? a.d(this, R.layout.arg_RES_7f0d08b8, viewGroup, 1): a.d(this, R.layout.arg_RES_7f0d08b9, viewGroup, 1);
                }else if(j != null){
                   objArray1 = a.d(this, R.layout.arg_RES_7f0d08bc, viewGroup, 1);
                }
                objArray2 = new Object[0];
                j0.f("SplashV2Activity", "init view return:"+objArray1, objArray2);
             }
             this.y.f(obj);
             objArray2 = new Object[]{this.z,this};
             this.y.i(objArray2);
             CommercialSplashTracker.E().H(this.findViewById(R.id.splash_content));
          }
          CommercialSplashTracker.E().M(SystemClock.elapsedRealtime());
          return;
       }
    }
    public void onDestroy(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, SplashV2Activity.class, "9")) {
          return;
       }
       int i = -1608526086;
       b.a(i).H(objArray);
       SplashV2Activity.D = SplashV2Activity.D - 1;
       Object[] objArray1 = new Object[0];
       j0.f("SplashV2Activity", "onDestroy "+this+" "+SplashV2Activity.D, objArray1);
       SplashV2Activity ty = this.y;
       if (ty != null) {
          ty.destroy();
       }
       b9.a(this.A);
       c uoc = b.a(i);
       if (SplashV2Activity.D <= 0 && uoc.getState() == 3) {
          uoc.a0();
       }
       SplashV2Activity tC = this.C;
       if (tC != null) {
          tC.dispose();
       }
       super.onDestroy();
       return;
    }
    public void onEventMainThread(e p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SplashV2Activity.class, "7")) {
          return;
       }
       if (p0.a == 4 && !this.isFinishing()) {
          this.finish();
       }
       return;
    }
    public void onPause(){
       if (PatchProxy.applyVoid(null, this, SplashV2Activity.class, "6")) {
          return;
       }
       super.onPause();
       Object[] objArray = new Object[0];
       j0.f("SplashV2Activity", "onPause "+this, objArray);
       SplashV2Activity tz = this.z;
       if (tz != null) {
          h d = tz.d;
          if (d != null) {
             d.onNext(Boolean.FALSE);
          }
       }
       CommercialSplashTracker.E().W(this);
       a.d().k(new PlayerVolumeEvent(PlayerVolumeEvent$Status.UN_MUTE));
       return;
    }
    public void onResume(){
       SplashV2Activity splashV2Acti = SplashV2Activity.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, splashV2Acti, "3")) {
          return;
       }
       super.onResume();
       if (!PatchProxy.applyVoid(objArray, this, splashV2Acti, "4")) {
          c.a(new e0(this));
       }
       if (SplashUtils.f()) {
          SplashUtils.A(this.getWindow());
       }
       objArray = new Object[0];
       j0.f("SplashV2Activity", "onResume "+this, objArray);
       splashV2Acti = this.z;
       if (splashV2Acti != null) {
          h d = splashV2Acti.d;
          if (d != null) {
             d.onNext(Boolean.TRUE);
          }
       }
       CommercialSplashTracker.E().V(this.z, this);
       a.d().k(new PlayerVolumeEvent(PlayerVolumeEvent$Status.MUTE));
       return;
    }
    public final void u3(int p0){
       SplashV2Activity splashV2Acti = SplashV2Activity.class;
       if (PatchProxy.isSupport(splashV2Acti) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, splashV2Acti, "16")) {
          return;
       }
       switch (p0){
           case 1:
             this.v3();
             this.y.U7(new l3());
             break;
           case 2:
             this.y.U7(new SplashShakePresenter());
             break;
           case 3:
             this.y.U7(new p3());
             break;
           case 5:
             this.v3();
             this.y.U7(new g3());
             break;
           case 6:
             this.v3();
             this.y.U7(new y3());
             break;
           case 7:
             this.v3();
             this.y.U7(new m2());
             break;
           case 8:
             this.y.U7(new v3());
             break;
           default:
          label_0018 :
             Object[] objArray = new Object[0];
             j0.f("SplashV2Activity", "not interactiveStyle", objArray);
       }
       return;
    }
    public final void v3(){
       if (PatchProxy.applyVoid(null, this, SplashV2Activity.class, "17")) {
          return;
       }
       if (a.t().d("splashInteractionDebugLog", false)) {
          this.y.U7(new k3());
       }
       return;
    }
    public final void w3(Activity p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SplashV2Activity.class, "12")) {
          return;
       }
       p0.getWindow().addFlags(1024);
       p0.getWindow().clearFlags(Integer.MIN_VALUE);
       p0.getWindow().addFlags(0x4000000);
       WindowManager$LayoutParams attributes = this.getWindow().getAttributes();
       if (Build$VERSION.SDK_INT >= 28) {
          attributes.layoutInDisplayCutoutMode = 1;
          this.getWindow().setAttributes(attributes);
       }
       return;
    }
}
