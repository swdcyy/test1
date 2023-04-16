package com.yxcorp.gifshow.growth.widget.virtual.e;
import android.os.Handler;
import android.os.Looper;
import com.yxcorp.gifshow.growth.widget.virtual.c;
import android.os.Handler$Callback;
import java.lang.Object;
import java.util.ArrayList;
import crd.a;
import com.yxcorp.gifshow.growth.widget.virtual.e$a;
import android.view.WindowManager$LayoutParams;
import lnc.a1;
import com.kwai.framework.activitycontext.ActivityContext;
import android.app.Activity;
import java.lang.ref.WeakReference;
import java.util.List;
import android.app.Application;
import o56.a;
import android.app.Application$ActivityLifecycleCallbacks;
import com.yxcorp.gifshow.util.rx.RxBus;
import zca.j;
import com.yxcorp.gifshow.util.rx.RxBus$ThreadMode;
import java.lang.Class;
import brd.t;
import mra.i;
import erd.g;
import crd.b;
import eda.l;
import mra.j;
import eda.n;
import mra.b;
import com.yxcorp.gifshow.growth.widget.virtual.WidgetTheme;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import lnc.b9;
import mra.c;
import java.lang.Runnable;
import ekd.k1;
import java.lang.StringBuilder;
import com.yxcorp.utility.Log;
import mra.e;
import android.view.View;
import com.kwai.library.widget.popup.common.f$c;
import com.kwai.library.widget.popup.common.f;
import android.animation.ValueAnimator;
import mra.a;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import android.view.animation.LinearInterpolator;
import android.animation.TimeInterpolator;
import mra.m;
import android.animation.Animator$AnimatorListener;
import com.kwai.robust.PatchProxyResult;
import android.view.WindowManager;
import android.view.ViewParent;
import android.view.ViewGroup;
import com.kwai.android.common.utils.ActivityStack;
import a2.i0;
import android.os.Build$VERSION;
import android.view.inspector.WindowInspector;
import java.lang.Integer;
import android.content.res.Resources;
import java.lang.Exception;
import cra.w;
import q87.c;
import java.util.concurrent.atomic.AtomicInteger;
import java.lang.Boolean;
import java.util.concurrent.TimeUnit;
import brd.z;
import lrd.b;
import t45.d;
import com.yxcorp.gifshow.growth.widget.virtual.a;

public class e	// class@001613
{
    public final List a;
    public Activity b;
    public View c;
    public WindowManager$LayoutParams d;
    public boolean e;
    public boolean f;
    public boolean g;
    public a h;
    public final b i;
    public static final Handler j;
    public static int k;
    public static AtomicInteger l;
    public static b m;
    public static e n;

    static {
       e.j = new Handler(Looper.getMainLooper(), c.b);
    }
    public void e(){
       super();
       ArrayList uArrayList = new ArrayList();
       this.a = uArrayList;
       this.f = true;
       this.g = false;
       this.h = new a();
       e$a uoa = new e$a(this);
       this.i = uoa;
       WindowManager$LayoutParams layoutParams = new WindowManager$LayoutParams();
       this.d = layoutParams;
       layoutParams.format = 1;
       layoutParams.flags = 936;
       layoutParams.windowAnimations = 0;
       layoutParams.type = 2;
       layoutParams.width = -2;
       layoutParams.height = a1.e(28.00f);
       this.d.x = a1.e(11.00f);
       this.d.y = a1.e(0x42f00000);
       this.d.gravity = 0x800033;
       uArrayList.add(new WeakReference(ActivityContext.g().e()));
       a.b().registerActivityLifecycleCallbacks(uoa);
       RxBus f = RxBus.f;
       RxBus$ThreadMode mAIN = RxBus$ThreadMode.MAIN;
       this.h.c(f.g(j.class, mAIN).subscribe(new i(this)));
       this.h.c(f.g(l.class, mAIN).subscribe(new j(this)));
       this.h.c(f.g(n.class, mAIN).subscribe(new b(this)));
    }
    public static void i(WidgetTheme p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, e.class, "5")) {
          return;
       }
       b9.a(e.m);
       k1.o(new c(p0));
       return;
    }
    public void a(){
       e uoe = e.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoe, "14")) {
          return;
       }
       Activity uActivity = this.c();
       if (uActivity == null) {
          return;
       }
       this.b();
       Log.g("VirtualModeWidget", "sure attachView window  to "+uActivity);
       this.b = uActivity;
       e tc = this.c;
       if (tc != null && f.a(uActivity, tc, 0, new e(this))) {
          Log.g("VirtualModeWidget", "add window success form "+this.b);
          this.e = false;
          if (this.f != null) {
             if (!PatchProxy.applyVoid(objArray, this, uoe, "15")) {
                this.f = false;
                ValueAnimator valueAnimato = ValueAnimator.ofFloat(new float[2]{0,0x3f800000});
                valueAnimato.addUpdateListener(new a(this));
                valueAnimato.setInterpolator(new LinearInterpolator());
                valueAnimato.addListener(new m(this));
                valueAnimato.setDuration(250);
                valueAnimato.start();
             }
          }else {
             this.c.setVisibility(0);
          }
       }
       return;
    }
    public void b(){
       e uoe = e.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoe, "17")) {
          return;
       }
       if (this.b != null) {
          WindowManager windowManage = PatchProxy.apply(objArray, this, uoe, "10");
          if (windowManage != PatchProxyResult.class) {
          }else {
             uoe = this.b;
             windowManage = (uoe != null)? uoe.getWindowManager(): objArray;
          }
          if (this.g(windowManage)) {
             Log.g("VirtualModeWidget", "remove window success form "+this.b);
             this.b = objArray;
             return;
          }
       }
       Log.g("VirtualModeWidget", "remove window fail!!");
       this.b = objArray;
       uoe = this.c;
       if (uoe == null) {
          return;
       }else {
          ViewParent parent = uoe.getParent();
          if (parent instanceof ViewGroup) {
             parent.removeView(this.c);
          }
          return;
       }
    }
    public final Activity c(){
       Activity obj = PatchProxy.apply(null, this, e.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.d();
       Log.g("VirtualModeWidget", "find TopStackActivity "+obj);
       List list = ActivityContext.g().c();
       int i = list.size() - 1;
       while (i >= 0 && obj == null) {
          Activity uActivity1 = list.get(i).get();
          if (uActivity1 != null) {
             Log.g("VirtualModeWidget", "ActivityContext find preActivity "+uActivity1);
             obj = uActivity1;
          }
          i = i - 1;
       }
       int i1 = ActivityStack.size() - 1;
       while (i1 >= 0 && obj == null) {
          Activity uActivity = ActivityStack.takeInstance(i1);
          if (uActivity != null) {
             Log.g("VirtualModeWidget", "ActivityStack find preActivity "+uActivity);
             obj = uActivity;
          }
          i1 = i1 - 1;
       }
       if (obj == null) {
          return null;
       }else if(obj == this.b){
          e tc = this.c;
          if (tc != null && (i0.X(tc) || (Build$VERSION.SDK_INT >= 29 && WindowInspector.getGlobalWindowViews().contains(this.c)))) {
             Log.g("VirtualModeWidget", "added window  success form "+obj);
             return null;
          }
       }
       return obj;
    }
    public final Activity d(){
       WeakReference weakReferenc;
       Object obj = PatchProxy.apply(null, this, e.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       int i = this.a.size() - 1;
       while (true) {
          if (i < 0) {
             return null;
          }
          weakReferenc = this.a.get(i);
          if (weakReferenc.get() != null) {
             break ;
          }else {
             i = i - 1;
          }
       }
       return weakReferenc.get();
    }
    public final String e(int p0,String p1){
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, this, uoe, "21");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       try{
          uoe = this.b;
          if (uoe != null) {
             return uoe.getResources().getString(p0);
          }
       }catch(java.lang.Exception e4){
          e4.printStackTrace();
       }
       return p1;
    }
    public void f(){
       if (PatchProxy.applyVoid(null, this, e.class, "2")) {
          return;
       }
       Object[] objArray = new Object[0];
       w.C().w("GrowthSimulation", "recheckStatus", objArray);
       if (e.n != null) {
          e.i(WidgetTheme.PREPARE);
          e.l.set((e.k + 1));
          e.n.h();
       }
       return;
    }
    public final boolean g(WindowManager p0){
       e obj = PatchProxy.applyOneRefs(p0, this, e.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       try{
          obj = this.c;
          if (obj != null && (p0 == null || !i0.X(obj))) {
          }else if(Build$VERSION.SDK_INT >= 29 && !WindowInspector.getGlobalWindowViews().contains(this.c)){
             return false;
          }else {
             boolean b = true;
             p0.removeViewImmediate(this.c);
             this.e = b;
             return b;
          }
       }catch(java.lang.Exception e0){
          this.e = e0;
       }
    label_0043 :
       return false;
    }
    public final void h(){
       if (PatchProxy.applyVoid(null, this, e.class, "3")) {
          return;
       }
       Object[] objArray = new Object[0];
       w.C().w("GrowthSimulation", "startStatusCheck", objArray);
       try{
          int i = 2;
          e.m = t.interval(i, TimeUnit.SECONDS).subscribeOn(b.c()).observeOn(d.b).subscribe(new a(this));
       }catch(java.lang.Exception e0){
          e0.printStackTrace();
          b m = e.m;
          if (m != null) {
             b9.a(m);
          }
       }
       return;
    }
}
