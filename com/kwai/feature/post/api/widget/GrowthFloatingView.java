package com.kwai.feature.post.api.widget.GrowthFloatingView;
import s36.d;
import com.kwai.feature.post.api.widget.GrowthFloatingView$a;
import nsd.u;
import android.app.Activity;
import com.kwai.feature.post.api.model.GrowthGuideItemConfig;
import z36.c;
import java.util.Map;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kwai.feature.post.api.widget.GrowthFloatingView$lifeCycleObserver$1;
import com.kwai.feature.post.api.widget.GrowthFloatingView$b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import lnc.p3;
import q87.c;
import android.view.View;
import android.view.ViewGroup;
import s36.e;
import r46.e;
import com.kwai.robust.PatchProxyResult;
import android.view.ViewParent;
import com.kwai.feature.post.api.model.AnchorPosition;
import p36.a;
import r36.b;
import java.util.Objects;
import com.yxcorp.gifshow.activity.GifshowActivity;
import androidx.lifecycle.Lifecycle;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.LifecycleObserver;
import com.yxcorp.gifshow.util.rx.RxBus;
import w16.e;
import com.yxcorp.gifshow.util.rx.RxBus$ThreadMode;
import brd.t;
import com.kwai.feature.post.api.widget.GrowthFloatingView$d;
import erd.g;
import crd.b;
import java.lang.Runnable;
import java.lang.StringBuilder;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintLayout$LayoutParams;
import qrd.l1;
import android.view.ViewGroup$LayoutParams;
import sx4.e;
import com.kwai.feature.post.api.widget.GrowthFloatingView$e;
import tx4.h;
import x36.a;
import com.kwai.feature.post.api.widget.GrowthFloatingView$c;
import ekd.k1;

public final class GrowthFloatingView implements d	// class@00146e
{
    public ViewGroup a;
    public b b;
    public boolean c;
    public e d;
    public LifecycleObserver e;
    public final Runnable f;
    public b g;
    public final Activity h;
    public final GrowthGuideItemConfig i;
    public final c j;
    public final Map k;
    public static final GrowthFloatingView$a l;

    static {
       GrowthFloatingView.l = new GrowthFloatingView$a(null);
    }
    public void GrowthFloatingView(Activity p0,GrowthGuideItemConfig p1,c p2,Map p3){
       a.p(p0, "activity");
       a.p(p1, "guideInfoItem");
       a.p(p2, "guideViewItem");
       super();
       this.h = p0;
       this.i = p1;
       this.j = p2;
       this.k = p3;
       this.e = new GrowthFloatingView$lifeCycleObserver$1(this);
       this.f = new GrowthFloatingView$b(this);
    }
    public void a(boolean p0){
       GrowthFloatingView growthFloati = GrowthFloatingView.class;
       if (PatchProxy.isSupport(growthFloati) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, growthFloati, "3")) {
          return;
       }
       int i = 0;
       Object[] objArray = new Object[i];
       p3.D().w("PostGrowth", "GrowthFloatingView dismiss", objArray);
       if (this.c()) {
          Object[] objArray1 = new Object[i];
          p3.D().w("PostGrowth", "GrowthFloatingView dismiss remove view", objArray1);
          GrowthFloatingView ta = this.a;
          if (ta != null) {
             ta.removeView(this.j.c());
          }
          ta = this.d;
          if (ta != null) {
             ta.onDismiss();
          }
       }else {
          this.b("dismiss error");
       }
       this.g();
       return;
    }
    public void b(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, GrowthFloatingView.class, "5")) {
          return;
       }
       GrowthFloatingView td = this.d;
       if (td != null) {
          td.a(p0);
       }
       this.g();
       if (this.c == null) {
          e.d(this.i.getUiType(), 2, null, 4, null);
       }
       return;
    }
    public boolean c(){
       Object[] objArray = null;
       View obj = PatchProxy.apply(objArray, this, GrowthFloatingView.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.j.c();
       if (obj != null) {
          objArray = obj.getParent();
       }
       boolean b = (objArray != null)? true: false;
       return b;
    }
    public void d(e p0){
       String str2;
       Object[] objArray2;
       a uoa;
       GrowthFloatingView growthFloati = GrowthFloatingView.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, growthFloati, "2")) {
          return;
       }
       Object[] objArray = new Object[0];
       p3.D().w("PostGrowth", "GrowthFloatingView show", objArray);
       this.d = p0;
       if (this.c != null) {
          Object[] objArray1 = new Object[0];
          p3.D().w("PostGrowth", "GrowthFloatingView show, already discard", objArray1);
          return;
       }else {
          String str = this.i.getPosition().b();
          String str1 = this.i.getPosition().a();
          View view = this.j.c();
          View view1 = PatchProxy.applyTwoRefs(str, str1, this, growthFloati, "8");
          boolean b = true;
          Object obj = null;
          if (view1 != PatchProxyResult.class) {
          }else if(str1 == null || !str1.length()){
             uoa = 1;
          }else {
             uoa = null;
          }
          if (!uoa) {
             view1 = a.b.c(str1, obj, str);
             if (!view1 instanceof ViewGroup) {
                view1 = obj;
             }
             if (view1 == null) {
             label_00af :
                view1 = a.b.b(this.h, str);
                if (!view1 instanceof ViewGroup) {
                   view1 = obj;
                }
             }
          }else {
             growthFloati = this.k;
             if (growthFloati != null && a.g("LifeCycleTrigger", growthFloati.get("TriggerSource"))) {
                str2 = this.k.get("LIFE_CYCLE_PATH_KEY");
                str1 = this.k.get("LIFE_CYCLE_PATH_ID");
                if (str2 != null && str1 != null) {
                   view1 = a.b.c(str2, str1, str);
                   if (!view1 instanceof ViewGroup) {
                      view1 = obj;
                   }
                   if (view1 == null) {
                   }
                }else {
                   goto label_00af ;
                }
             }else {
                goto label_00af ;
             }
          }
          this.a = view1;
          if (view1 instanceof b) {
             str1 = "null cannot be cast to non-null type com.kwai.feature.post.api.flywheel.widget.protocol.IFlyWheelViewProtocol";
             Objects.requireNonNull(view1, str1);
             obj = view1;
             Objects.requireNonNull(view1, str1);
             this.a = view1.getTKViewContainer();
          }
          if (this.a == null || view == null) {
             p3 op3 = p3.D();
             str2 = "GrowthFloatingView show, guideView or container is null, container: ";
             if (this.a != null) {
                b = false;
             }
             objArray2 = new Object[0];
             op3.w("PostGrowth", str2+b, objArray2);
             this.b("targetView not found");
             return;
          }else {
             growthFloati = this.h;
             Objects.requireNonNull(growthFloati, "null cannot be cast to non-null type com.yxcorp.gifshow.activity.GifshowActivity");
             growthFloati.getLifecycle().addObserver(this.e);
             this.b = RxBus.f.g(e.class, RxBus$ThreadMode.MAIN).subscribe(new GrowthFloatingView$d(this));
             if (view instanceof ViewGroup) {
                view1 = view;
                view1.setClipChildren(0);
                view1.setClipToPadding(0);
             }
             if (obj != null) {
                obj.s(this.f);
             }else {
                objArray = new Object[0];
                p3.D().w("PostGrowth", "GrowthFloatingView view\("+str+" is not FlyWheelFrameLayout\)", objArray);
             }
             this.g = obj;
             if (this.a instanceof ConstraintLayout) {
                ConstraintLayout$LayoutParams layoutParams = new ConstraintLayout$LayoutParams(-1, -1);
                layoutParams.h = 0;
                layoutParams.d = 0;
                layoutParams.g = 0;
                layoutParams.k = 0;
                view.setLayoutParams(layoutParams);
             }
             growthFloati = this.a;
             a.m(growthFloati);
             try{
                growthFloati.addView(view);
                e uoe = this.j.d();
                if (uoe != null) {
                   uoe.b("onItemShowAction", "", GrowthFloatingView$e.a);
                }
             }catch(java.lang.Exception e0){
                objArray2 = new Object[0];
                p3.D().w("PostGrowth", "GrowthFloatingView invoke js onShow failed", objArray2);
             }
             if (p0 != null) {
                p0.onShow();
             }
             return;
          }
       }
    }
    public String e(){
       Object obj = PatchProxy.apply(null, this, GrowthFloatingView.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.i.getGuideItemId();
    }
    public void f(e p0){
       this.d = p0;
    }
    public final void g(){
       GrowthFloatingView growthFloati = GrowthFloatingView.class;
       if (PatchProxy.applyVoid(null, this, growthFloati, "6")) {
          return;
       }
       if (this.c != null) {
          return;
       }
       GrowthFloatingView tb = this.b;
       if (tb != null) {
          tb.dispose();
       }
       a uoa = this.j.b();
       if (uoa != null) {
          uoa.a();
       }
       k1.r(new GrowthFloatingView$c(this), 0);
       if (!PatchProxy.applyVoid(null, this, growthFloati, "4")) {
          growthFloati = this.h;
          Objects.requireNonNull(growthFloati, "null cannot be cast to non-null type com.yxcorp.gifshow.activity.GifshowActivity");
          growthFloati.getLifecycle().removeObserver(this.e);
       }
       growthFloati = this.g;
       if (growthFloati != null) {
          growthFloati.z(this.f);
       }
       this.c = true;
       this.g = null;
       return;
    }
}
