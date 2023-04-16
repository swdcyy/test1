package com.kwai.library.push.display.Push;
import com.kwai.library.push.model.InAppNotification;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.util.Objects;
import android.view.View;
import java.lang.Runnable;
import ekd.k1;
import android.view.LayoutInflater;
import com.kwai.library.push.display.Push$a;
import jy6.b;
import android.view.View$OnTouchListener;
import android.view.ViewGroup;
import android.content.Context;
import android.app.Activity;
import com.kwai.library.widget.popup.common.f;
import android.view.ViewParent;
import java.lang.StringBuilder;
import ny6.a;
import java.lang.Exception;
import com.kwai.library.push.display.Push$startExitAnimation$1;
import com.kwai.library.push.display.Push$startExitAnimation$2;
import ekd.p1;
import usd.q;
import android.util.Property;
import android.animation.ObjectAnimator;
import android.view.animation.DecelerateInterpolator;
import android.animation.TimeInterpolator;
import iy6.l;
import msd.a;
import android.animation.Animator$AnimatorListener;

public abstract class Push	// class@0008b3
{
    public b a;
    public ViewGroup b;
    public View c;
    public int d;
    public int e;
    public Runnable f;
    public InAppNotification g;

    public void Push(InAppNotification p0){
       a.p(p0, "data");
       super();
       this.g = p0;
    }
    public static void e(Push p0,String p1,String p2,boolean p3,int p4,Object p5){
       if (p4 & 0x01) {
          p1 = "0";
       }
       if (p4 & 0x02) {
          p2 = "0";
       }
       if (p4 & 0x04) {
          p3 = true;
       }
       Objects.requireNonNull(p0);
       a.p(p1, "exitType");
       a.p(p2, "clickType");
       p0.b();
       if (p3) {
          p0.l(p1, p2);
       }else {
          p0.i(p1, p2);
       }
       return;
    }
    public static void j(Push p0,String p1,String p2,int p3,Object p4){
       p2 = (p3 & 0x02)? "0": null;
       p0.i(p1, p2);
       return;
    }
    public abstract void a(View p0,InAppNotification p1);
    public final void b(){
       Push tf = this.f;
       if (tf != null) {
          k1.m(tf);
       }
       return;
    }
    public abstract View c(LayoutInflater p0);
    public final void d(){
       if (this.c != null) {
          Push$a uoa = new Push$a(this);
          this.f = uoa;
          k1.r(uoa, (long)this.g.getDuration());
       }
       return;
    }
    public final InAppNotification f(){
       return this.g;
    }
    public final b g(){
       return this.a;
    }
    public void h(){
    }
    public final void i(String p0,String p1){
       Push ta = this.a;
       if (ta != null) {
          ta.h(this, p1);
       }
       this.h();
       this.e = 2;
       Push tb = this.b;
       if (tb != null) {
          tb.setOnTouchListener(null);
       }
       tb = this.b;
       if (tb != null) {
          Context context = tb.getContext();
          if (!context instanceof Activity) {
             context = null;
          }
          if (context == null || !f.C(context, tb)) {
             try{
                ViewParent parent = tb.getParent();
                if (!parent instanceof ViewGroup) {
                   parent = null;
                }
                if (parent != null) {
                   parent.removeView(tb);
                }
             }catch(java.lang.Exception e5){
                a.b("remove root view error-"+e5);
                e5.printStackTrace();
             }
          }
       }
    }
    public final void k(b p0){
       this.a = p0;
    }
    public final void l(String p0,String p1){
       this.e = 3;
       Push ta = this.a;
       if (ta != null) {
          ta.b(this);
       }
       ta = this.c;
       Push$startExitAnimation$1 ostartExitAn = new Push$startExitAnimation$1(this, p0, p1);
       Push$startExitAnimation$2 ostartExitAn1 = new Push$startExitAnimation$2(this, p0, p1);
       a.p(ostartExitAn, "exitAnimationEnd");
       a.p(ostartExitAn1, "onCancel");
       if (ta != null) {
          int i = ta.getMeasuredHeight() + p1.f(ta.getContext());
          float translationY = ta.getTranslationY();
          float f = (float)i;
          i = (int)((((double)q.t((f + translationY), f) * 0x3ff0000000000000) / (double)i) * (double)280);
          float[] uofloatArray = new float[]{translationY,- f};
          ObjectAnimator objectAnimat = ObjectAnimator.ofFloat(ta, View.TRANSLATION_Y, uofloatArray);
          objectAnimat.setDuration((long)q.n(i, 0));
          objectAnimat.setInterpolator(new DecelerateInterpolator());
          objectAnimat.addListener(new l(i, ostartExitAn, ostartExitAn1));
          objectAnimat.start();
       }
       return;
    }
    public final void m(Push p0){
       a.p(p0, "push");
       Push tc = this.c;
       if (tc != null) {
          this.b();
          Push g = p0.g;
          this.g = g;
          this.a(tc, g);
          tc = this.a;
          if (tc != null) {
             tc.g(p0, this);
          }
          tc = this.a;
          if (tc != null) {
             tc.e(p0);
          }
          this.d();
       }
       return;
    }
}
