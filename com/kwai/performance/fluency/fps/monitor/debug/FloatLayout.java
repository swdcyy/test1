package com.kwai.performance.fluency.fps.monitor.debug.FloatLayout;
import android.widget.LinearLayout;
import android.content.Context;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.util.AttributeSet;
import nsd.u;
import com.kwai.performance.fluency.fps.monitor.debug.DebugInfoView;
import android.view.View;
import re7.a;
import java.util.Objects;
import android.view.ViewTreeObserver;
import re7.b;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import android.app.Application;
import yf7.k;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import cw9.c;
import android.view.ViewConfiguration;
import android.view.WindowManager;
import android.view.WindowManager$LayoutParams;
import android.os.Build$VERSION;
import qrd.l1;
import android.view.ViewGroup;
import android.view.MotionEvent;
import java.lang.Math;
import android.view.ViewGroup$LayoutParams;
import java.lang.Boolean;
import yf7.h;

public final class FloatLayout extends LinearLayout	// class@00106d
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

    public void FloatLayout(Context p0){
       a.p(p0, "context");
       super(p0, null, 0, 6, null);
    }
    public void FloatLayout(Context p0,AttributeSet p1){
       a.p(p0, "context");
       super(p0, p1, 0, 4, null);
    }
    public void FloatLayout(Context p0,AttributeSet p1,int p2){
       Context context;
       a.p(p0, "context");
       super(p0, p1, p2);
       this.b();
       context = this.getContext();
       a.o(context, "context");
       DebugInfoView uDebugInfoVi = new DebugInfoView(context, null, 0, 6, null);
       this.addView(p0);
       Objects.requireNonNull(a.a);
       a.c = p0;
       this.getViewTreeObserver().addOnGlobalLayoutListener(new b(this));
       this.g = true;
    }
    public void FloatLayout(Context p0,AttributeSet p1,int p2,int p3,u p4){
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
       return ((p0 * c.c(k.b().getResources()).density) + 0x3f000000);
    }
    public final void b(){
       this.b = ViewConfiguration.get(k.b()).getScaledPagingTouchSlop();
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
    public final int getScreenHeight(){
       return c.c(k.b().getResources()).heightPixels;
    }
    public final int getScreenWidth(){
       return c.c(k.b().getResources()).widthPixels;
    }
    public void onDetachedFromWindow(){
       super.onDetachedFromWindow();
       this.k = false;
    }
    public boolean onTouchEvent(MotionEvent p0){
       FloatLayout to;
       a.p(p0, "event");
       int action = p0.getAction();
       float f = 0;
       if (action) {
          FloatLayout uFloatLayout = 2;
          if (action != 1) {
             if (action == uFloatLayout) {
                int i = (int)p0.getRawY();
                if (Math.abs((this.c - (int)p0.getRawX())) >= this.b || Math.abs((this.d - i)) >= this.b) {
                   this.l = true;
                   if (this.k != null) {
                      action = (int)p0.getRawX();
                      int i1 = (int)p0.getRawY();
                      FloatLayout tn = this.n;
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
          }else if(this.l == null || this.m == null){
             to = this.n;
             if (to != null) {
                int i2 = to.y + (this.i / uFloatLayout);
                FloatLayout uFloatLayout1 = ((to.x + (this.h / uFloatLayout)) <= (this.getScreenWidth() / uFloatLayout))? 1: null;
                if (i2 >= ((this.getScreenHeight() * 4) / 5)) {
                   f = Float.MIN_VALUE;
                }
                if (!f) {
                   to.x = (uFloatLayout1)? this.j: (this.getScreenWidth() - this.j) - this.h;
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
          this.e = f;
          this.f = f;
          this.e = (int)p0.getX();
          this.f = (int)p0.getY();
       }
    label_00e1 :
       return true;
    }
    public void onVisibilityChanged(View p0,int p1){
       a.p(p0, "changedView");
       super.onVisibilityChanged(p0, p1);
       boolean b = (!p1)? true: false;
       h.a("FloatLayout", a.C("shown change = ", Boolean.valueOf(b)));
       return;
    }
    public void onWindowVisibilityChanged(int p0){
       super.onWindowVisibilityChanged(p0);
       boolean b = true;
       boolean b1 = (!p0)? true: false;
       h.a("FloatLayout", a.C("window shown change = ", Boolean.valueOf(b1)));
       if (p0) {
          b = false;
       }
       this.k = b;
       return;
    }
}
