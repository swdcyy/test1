package eua.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import yx.j0;
import com.yxcorp.gifshow.util.rx.RxBus;
import wl9.v;
import com.yxcorp.gifshow.util.rx.RxBus$ThreadMode;
import brd.t;
import eua.a;
import erd.g;
import crd.b;
import com.kwai.sdk.switchconfig.a;
import tra.b;
import q87.c;
import wkd.b;
import tjc.c;
import android.view.ViewGroup;
import com.kwai.robust.PatchProxyResult;
import im8.f;
import tkd.b;
import tkd.d;
import nl9.h0;
import android.app.Application;
import o56.a;
import android.content.Context;
import android.widget.FrameLayout;
import android.widget.FrameLayout$LayoutParams;
import android.app.Activity;
import com.yxcorp.gifshow.util.Edge2EdgeHelper;
import android.view.Window;
import android.view.View;
import lnc.i5;
import android.view.ViewGroup$LayoutParams;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.StringBuilder;
import x46.a;

public abstract class b extends PresenterV2	// class@002818
{
    public f p;
    public f q;
    public ViewGroup r;
    public ViewGroup s;
    public boolean t;
    public int u;
    public boolean v;
    public int w;
    public boolean x;
    public boolean y;

    public void b(){
       super();
       this.t = true;
       this.u = 0;
       this.v = false;
       this.x = false;
       this.y = false;
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, b.class, "3")) {
          return;
       }
       Object[] objArray = new Object[0];
       j0.f("BaseSplashPresenter", "onBind", objArray);
       this.X7(RxBus.f.g(v.class, RxBus$ThreadMode.MAIN).subscribe(new a(this)));
       return;
    }
    public void F8(){
       if (PatchProxy.applyVoid(null, this, b.class, "1")) {
          return;
       }
       this.x = a.t().d("splashGoneByDataFinish", false);
       this.y = a.t().d("splashGoneByNasaFeatureLaunchSelectEvent", false);
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, b.class, "11")) {
          return;
       }
       Object[] objArray = new Object[0];
       b.C().w("BaseSplashPresenter", "on unbind", objArray);
       this.v = false;
       this.u = 0;
       return;
    }
    public void P8(){
       boolean b;
       if (PatchProxy.applyVoid(null, this, b.class, "14")) {
          return;
       }
       b = false;
       this.t = b;
       b tu = this.u;
       if (tu == 1 || tu == 3) {
          this.b9(b);
       }
       b tu1 = this.u;
       if (tu1 == 2 || tu1 == 3) {
          this.Y8(this.w);
       }
       return;
    }
    public void R8(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "12")) {
          return;
       }
       if (b.a(-1608526086).S()) {
          Object[] objArray = new Object[0];
          j0.c("BaseSplashPresenter", p0, objArray);
       }
       return;
    }
    public ViewGroup S8(){
       b uob = b.class;
       Object[] objArray = null;
       FrameLayout$LayoutParams obj = PatchProxy.apply(objArray, this, uob, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.s == null && !PatchProxy.applyVoid(objArray, this, uob, "10")) {
          uob = this.p;
          ViewGroup viewGroup = (uob != null)? uob.get(): objArray;
          if (viewGroup != null) {
             this.s = viewGroup;
             this.Z8(viewGroup);
          }else {
             obj = new FrameLayout$LayoutParams(-1, -1);
             this.s = d.a(-536296199).ZP(a.b());
             Activity activity = this.getActivity();
             b tr = this.r;
             if (tr != null) {
                objArray = tr;
             }else if(activity != null){
                if (Edge2EdgeHelper.b()) {
                   objArray = activity.getWindow().getDecorView();
                   i5.j(activity.getWindow(), 0);
                }else {
                   objArray = activity.getWindow().getDecorView().findViewById(0x1020002);
                }
             }
             if (objArray != null) {
                objArray.addView(this.s, obj);
             }
             this.Z8(this.s);
             uob = this.p;
             if (uob != null) {
                uob.set(this.s);
             }
          }
       }
    label_0097 :
       return this.s;
    }
    public void V8(v p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "4")) {
          return;
       }
       v a = p0.a;
       if (a != true) {
          if (a != 2) {
             if (a != 3) {
                if (a == 4) {
                   this.v = true;
                }
             }else {
                this.a9();
             }
          }else {
             this.Y8(p0.b);
          }
       }else {
          this.P8();
       }
       return;
    }
    public boolean W8(){
       boolean b;
       b obj = PatchProxy.apply(null, this, b.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.s;
       b = false;
       if (obj != null && !obj.getVisibility()) {
          b = true;
       }
       return b;
    }
    public boolean X8(){
       return this.t;
    }
    public abstract void Y8(int p0);
    public abstract void Z8(ViewGroup p0);
    public void a9(){
       if (PatchProxy.applyVoid(null, this, b.class, "7")) {
          return;
       }
       this.P8();
       this.b9(false);
       return;
    }
    public void b9(boolean p0){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uob, "6")) {
          return;
       }
       uob = this.s;
       if (uob != null) {
          if (p0) {
             uob.setVisibility(0);
             this.s.setAlpha(0x3f800000);
          }else if(this.X8()){
             this.c9(1, 0);
          }else {
             this.s.setVisibility(8);
          }
       }else if(p0){
          this.S8().setVisibility(0);
       }
       return;
    }
    public void c9(int p0,int p1){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, uob, "5")) {
          return;
       }
       Object[] objArray = new Object[0];
       b.C().w("BaseSplashPresenter", "setPenddingEvent, event:"+p0+", hasSplashAd:"+p1, objArray);
       uob = this.u;
       if (uob == null) {
          this.u = p0;
       }else if(uob != p0){
          this.u = 3;
       }
       if (this.w != 1) {
          this.w = p1;
       }
       Object[] objArray1 = new Object[0];
       b.C().w("BaseSplashPresenter", "mPenddingEvent:"+this.u+", mAdSplashStatus:"+this.w, objArray1);
       return;
    }
    public void d9(){
       if (PatchProxy.applyVoid(null, this, b.class, "13")) {
          return;
       }
       Object[] objArray = new Object[0];
       b.C().w("BaseSplashPresenter", "showSplash", objArray);
       this.q.get().F2();
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, b.class, "2")) {
          return;
       }
       this.p = this.w8("SPLASH_FRAME");
       this.r = this.t8("SPLASH_PARENT_VIEW");
       this.q = this.x8("SPLASH_EVENT_LISTENER");
       return;
    }
}
