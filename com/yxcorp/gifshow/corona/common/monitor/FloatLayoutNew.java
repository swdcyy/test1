package com.yxcorp.gifshow.corona.common.monitor.FloatLayoutNew;
import android.widget.LinearLayout;
import android.content.Context;
import android.util.AttributeSet;
import nsd.u;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import android.app.Application;
import o56.a;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import cw9.c;
import android.view.ViewConfiguration;
import a2.j0;
import java.util.Objects;
import android.view.WindowManager;
import android.view.WindowManager$LayoutParams;
import android.os.Build$VERSION;
import qrd.l1;
import com.yxcorp.gifshow.corona.common.monitor.CostDebugView;
import android.view.View;
import lq9.c;
import android.view.ViewTreeObserver;
import com.yxcorp.gifshow.corona.common.monitor.FloatLayoutNew$a;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import android.view.ViewGroup;
import android.view.MotionEvent;
import java.lang.Boolean;
import java.lang.Math;
import android.view.ViewGroup$LayoutParams;
import java.lang.Integer;

public final class FloatLayoutNew extends LinearLayout	// class@00125d
{
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public boolean g;
    public int h;
    public int i;
    public int j;
    public boolean k;
    public boolean l;
    public final boolean m;
    public WindowManager$LayoutParams n;
    public WindowManager o;
    public HashMap p;

    public void FloatLayoutNew(Context p0){
       super(p0, null, 0, 6, null);
    }
    public void FloatLayoutNew(Context p0,AttributeSet p1){
       super(p0, p1, 0, 4, null);
    }
    public void FloatLayoutNew(Context p0,AttributeSet p1,int p2){
       a.p(p0, "context");
       super(p0, p1, p2);
       this.c();
    }
    public void FloatLayoutNew(Context p0,AttributeSet p1,int p2,int p3,u p4){
       if (p3 & 0x02) {
          p1 = null;
       }
       if (p3 & 0x04) {
          p2 = 0;
       }
       super(p0, p1, p2);
       return;
    }
    public final float a(float p0){
       Application obj;
       if (PatchProxy.isSupport(FloatLayoutNew.class)) {
          obj = PatchProxy.applyOneRefs(Float.valueOf(p0), this, FloatLayoutNew.class, "14");
          if (obj != PatchProxyResult.class) {
             return obj.floatValue();
          }
       }
       obj = a.b();
       a.o(obj, "AppEnv.getAppContext\(\)");
       Resources resources = obj.getResources();
       a.o(resources, "AppEnv.getAppContext\(\).resources");
       return ((p0 * c.c(resources).density) + 0x3f000000);
    }
    public final void b(){
       if (PatchProxy.applyVoid(null, this, FloatLayoutNew.class, "6")) {
          return;
       }
       this.b = j0.d(ViewConfiguration.get(a.b()));
       this.j = (int)this.a(10.00f);
       WindowManager$LayoutParams systemServic = this.getContext().getSystemService("window");
       Objects.requireNonNull(systemServic, "null cannot be cast to non-null type android.view.WindowManager");
       this.o = systemServic;
       systemServic = new WindowManager$LayoutParams();
       systemServic.flags = ((systemServic.flags | 0x40000) | 0x20) | 0x08;
       int i = (Build$VERSION.SDK_INT >= 26)? 2038: 2003;
       systemServic.type = i;
       systemServic.gravity = 51;
       systemServic.format = 1;
       systemServic.alpha = 0x3f800000;
       systemServic.x = 0;
       systemServic.y = 0;
       systemServic.height = -2;
       systemServic.width = -2;
       this.n = systemServic;
       return;
    }
    public final void c(){
       if (PatchProxy.applyVoid(null, this, FloatLayoutNew.class, "5")) {
          return;
       }
       this.b();
       Context context = this.getContext();
       a.o(context, "context");
       CostDebugView uCostDebugVi = new CostDebugView(context, null, 0, 6, null);
       this.addView(v0);
       Objects.requireNonNull(c.f);
       c.d = v0;
       this.getViewTreeObserver().addOnGlobalLayoutListener(new FloatLayoutNew$a(this));
       this.g = true;
       return;
    }
    public final int getScreenHeight(){
       Application obj = PatchProxy.apply(null, this, FloatLayoutNew.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = a.b();
       a.o(obj, "AppEnv.getAppContext\(\)");
       Resources resources = obj.getResources();
       a.o(resources, "AppEnv.getAppContext\(\).resources");
       return c.c(resources).heightPixels;
    }
    public final int getScreenWidth(){
       Application obj = PatchProxy.apply(null, this, FloatLayoutNew.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = a.b();
       a.o(obj, "AppEnv.getAppContext\(\)");
       Resources resources = obj.getResources();
       a.o(resources, "AppEnv.getAppContext\(\).resources");
       return c.c(resources).widthPixels;
    }
    public void onDetachedFromWindow(){
       if (PatchProxy.applyVoid(null, this, FloatLayoutNew.class, "3")) {
          return;
       }
       super.onDetachedFromWindow();
       this.k = false;
       return;
    }
    public boolean onTouchEvent(MotionEvent p0){
       FloatLayoutNew to;
       FloatLayoutNew obj = PatchProxy.applyOneRefs(p0, this, FloatLayoutNew.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "event");
       int action = p0.getAction();
       float f = 0;
       if (action) {
          FloatLayoutNew uFloatLayout = 2;
          if (action != 1) {
             if (action == uFloatLayout) {
                int i = (int)p0.getRawY();
                if (Math.abs((this.c - (int)p0.getRawX())) >= this.b && Math.abs((this.d - i)) >= this.b) {
                   this.l = true;
                   if (!PatchProxy.applyVoidOneRefs(p0, this, FloatLayoutNew.class, "11") && this.k != null) {
                      action = (int)p0.getRawX();
                      int i1 = (int)p0.getRawY();
                      FloatLayoutNew tn = this.n;
                      if (tn != null) {
                         tn.x = action - this.e;
                         tn.y = i1 - this.f;
                         to = this.o;
                         if (to != null) {
                            to.updateViewLayout(this, tn);
                         }
                      }
                   }
                }
             }
          }else if(this.l == null || (PatchProxy.applyVoid(null, this, FloatLayoutNew.class, "9") || this.m == null)){
             to = this.n;
             if (to != null) {
                int i2 = to.y + (this.i / uFloatLayout);
                obj = ((to.x + (this.h / uFloatLayout)) <= (this.getScreenWidth() / uFloatLayout))? 1: null;
                if (i2 >= ((this.getScreenHeight() * 4) / 5)) {
                   f = Float.MIN_VALUE;
                }
                if (!f) {
                   to.x = (obj)? this.j: (this.getScreenWidth() - this.j) - this.h;
                }else {
                   to.y = (this.getScreenHeight() - this.j) - this.i;
                }
                to = this.o;
                if (to != null) {
                   to.updateViewLayout(this, this.n);
                }
             }
          }
       }else {
          this.l = f;
          this.c = (int)p0.getRawX();
          this.d = (int)p0.getRawY();
          if (!PatchProxy.applyVoidOneRefs(p0, this, FloatLayoutNew.class, "10")) {
             this.e = f;
             this.f = f;
             this.e = (int)p0.getX();
             this.f = (int)p0.getY();
          }
       }
    label_0111 :
       return true;
    }
    public void onVisibilityChanged(View p0,int p1){
       if (PatchProxy.isSupport(FloatLayoutNew.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, FloatLayoutNew.class, "1")) {
          return;
       }
       a.p(p0, "changedView");
       super.onVisibilityChanged(p0, p1);
       return;
    }
    public void onWindowVisibilityChanged(int p0){
       if (PatchProxy.isSupport(FloatLayoutNew.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, FloatLayoutNew.class, "2")) {
          return;
       }
       super.onWindowVisibilityChanged(p0);
       boolean b = (!p0)? true: false;
       this.k = b;
       return;
    }
}
