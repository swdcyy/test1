package com.kwai.component.tabs.panel.c;
import java.lang.Object;
import yg5.g;
import yg5.f;
import java.util.HashMap;
import yg5.e;
import android.view.animation.Interpolator;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import bh5.b;
import yg5.p0;
import android.widget.RelativeLayout;
import android.app.Activity;
import com.yxcorp.utility.n;
import java.lang.Math;
import yg5.e0;
import bh5.a;
import q87.c;
import java.lang.Integer;
import java.util.Map;
import java.lang.Runnable;
import com.kwai.component.tabs.panel.c$f;
import android.animation.ValueAnimator;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import com.kwai.component.tabs.panel.c$c;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import com.kwai.component.tabs.panel.c$d;
import android.animation.Animator$AnimatorListener;
import android.view.ViewGroup$LayoutParams;
import com.kwai.component.tabs.panel.widget.TabsPanelNestedParentRelativeLayout;
import com.kwai.component.tabs.panel.c$a;
import com.kwai.component.tabs.panel.c$b;
import com.kwai.component.tabs.panel.c$e;
import android.view.View;
import com.kwai.component.tabs.panel.b;
import java.util.Objects;
import android.widget.FrameLayout$LayoutParams;
import yg5.j0;
import android.os.Handler;
import android.os.Looper;
import rkd.b;
import yg5.m;
import java.lang.Exception;
import android.graphics.Rect;

public final class c	// class@000b7a
{
    public Activity a;
    public TabsPanelNestedParentRelativeLayout b;
    public c$f c;
    public Runnable d;
    public Runnable e;
    public Runnable f;
    public ValueAnimator g;
    public c$e h;
    public Map i;
    public int j;
    public boolean k;
    public boolean l;
    public e0 m;
    public j0 n;
    public Handler o;
    public int p;
    public final View$OnLayoutChangeListener q;

    public void c(){
       super();
       this.d = new g(this);
       this.e = new f(this);
       this.i = new HashMap();
       this.p = 0;
       this.q = new e(this);
    }
    public final Interpolator a(){
       b obj = PatchProxy.apply(null, this, c.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new b();
       b uob = obj;
       uob.a(0, 0, 0x3df1a9fc, 0.05f, 0.33f, 0.35f, 0.44f, 0x3f26a7f0);
       uob.a(0.44f, 0x3f26a7f0, 0x3f0ccccd, 0x3f743958, 0x3f2d9168, 0x3f7c6a7f, 0x3f800000, 0x3f800000);
       return obj;
    }
    public p0 b(){
       c obj = PatchProxy.apply(null, this, c.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.a != null) {
          obj = this.b;
          if (obj != null) {
             p0 op0 = new p0();
             op0.a = n.j(this.a);
             op0.b = this.m.a(this.a);
             op0.c = Math.min((int)((float)obj.getTop() + this.b.getTranslationY()), n.j(this.a));
             op0.d = 0x3f800000 - Math.max(0, Math.min(0x3f800000, (this.b.getTranslationY() / (float)this.b.getHeight())));
             return op0;
          }
       }
       Object[] objArray = new Object[0];
       a.C().t("DetailAndCommentDialogOperator", "activity is null", objArray);
       return new p0();
    }
    public boolean c(){
       return this.l;
    }
    public void d(int p0){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoc, "7")) {
          return;
       }
       Runnable runnable = this.i.get(Integer.valueOf(p0));
       this.j = p0;
       if (runnable != null) {
          runnable.run();
       }
       return;
    }
    public void e(c$f p0){
       this.c = p0;
    }
    public void f(){
       if (PatchProxy.applyVoid(null, this, c.class, "14")) {
          return;
       }
       this.g(400, this.a());
       return;
    }
    public void g(int p0,Interpolator p1){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uoc, "15")) {
          return;
       }
       if (this.a == null || this.b == null) {
          this.f = this.e;
          return;
       }else {
          uoc = this.g;
          if (uoc == null || (uoc.isStarted() || this.h != null)) {
             return;
          }
          uoc = this.b;
          float[] uofloatArray = new float[]{uoc.getTranslationY(),this.b.getTranslationY() + (float)this.m.a(this.a)};
          ObjectAnimator objectAnimat = ObjectAnimator.ofFloat(uoc, "translationY", uofloatArray);
          this.g = objectAnimat;
          objectAnimat.setDuration((long)p0);
          objectAnimat.setInterpolator(p1);
          objectAnimat.addUpdateListener(new c$c(this));
          objectAnimat.addListener(new c$d(this));
          this.b.setEnabled(0);
          this.l = false;
          objectAnimat.start();
          return;
       }
    }
    public void h(){
       if (PatchProxy.applyVoid(null, this, c.class, "12")) {
          return;
       }
       this.i(400, this.a());
       return;
    }
    public void i(int p0,Interpolator p1){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uoc, "13")) {
          return;
       }
       if (this.a == null || this.b == null) {
          this.f = this.d;
          return;
       }else {
          uoc = this.g;
          if (uoc == null || (uoc.isStarted() || this.h != null)) {
             return;
          }
          int i = this.m.a(this.a);
          if (this.b.getLayoutParams().height != i) {
             p0.height = i;
             this.b.setOffsetFromInitPosition(i);
             this.b.requestLayout();
             this.b.post(new g(this));
             return;
          }else {
             uoc = this.b;
             float[] uofloatArray = new float[]{uoc.getTranslationY(),this.b.getInitPosition()};
             ObjectAnimator objectAnimat = ObjectAnimator.ofFloat(uoc, "translationY", uofloatArray);
             this.g = objectAnimat;
             objectAnimat.setDuration((long)p0);
             objectAnimat.setInterpolator(p1);
             objectAnimat.addUpdateListener(new c$a(this));
             objectAnimat.addListener(new c$b(this));
             c$e uoe = new c$e(this.b, this.g, null);
             this.h = uoe;
             this.l = true;
             Objects.requireNonNull(uoe);
             if (!PatchProxy.applyVoid(null, uoe, c$e.class, "1")) {
                uoe.e = false;
                uoe.d.invalidate();
             }
             return;
          }
       }
    }
    public final void j(View p0,FrameLayout$LayoutParams p1,int p2){
       if (PatchProxy.isSupport(c.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), this, c.class, "5")) {
          return;
       }
       try{
          if (p0 == null || (p1 != null && p2 > 0)) {
             if (this.o == null) {
                int height = p0.getHeight();
                this.n.d(height);
                this.p = height;
                this.o = new Handler(Looper.getMainLooper());
             }
             if (this.p >= p2 || !b.e()) {
                this.p = -1;
                this.o = null;
                return;
             }else {
                this.o.postDelayed(new m(this, p1, p2, p0), 16);
             }
          }
       }catch(java.lang.Exception e8){
          e8.printStackTrace();
       }
       return;
    }
    public final void k(){
       if (PatchProxy.applyVoid(null, this, c.class, "3")) {
          return;
       }
       if (this.n != null) {
          c tb = this.b;
          if (tb != null && this.a != null) {
             tb.getLayoutParams().width = this.n.a(this.a);
             if (this.b.getLayoutParams() instanceof FrameLayout$LayoutParams) {
                FrameLayout$LayoutParams layoutParams = this.b.getLayoutParams();
                layoutParams.gravity = this.n.b();
                layoutParams.rightMargin = this.n.c().right;
             }
          }
       }
       return;
    }
    public void l(int p0){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoc, "9")) {
          return;
       }
       p0 op0 = this.b();
       c tc = this.c;
       if (tc != null) {
          tc.u(op0.a, op0.b, op0.c, op0.d, p0);
       }
       return;
    }
}
