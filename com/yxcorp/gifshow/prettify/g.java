package com.yxcorp.gifshow.prettify.g;
import n0c.b;
import java.lang.Object;
import com.yxcorp.gifshow.widget.q;
import l0c.g0;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import java.lang.Boolean;
import xyb.a;
import java.lang.StringBuilder;
import q87.c;
import java.lang.CharSequence;
import android.widget.TextView;
import lnc.a1;
import java.lang.Float;
import java.lang.Runnable;
import ekd.k1;
import android.view.ViewPropertyAnimator;
import android.animation.Animator$AnimatorListener;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.prettify.g$a;
import android.view.ViewParent;
import android.view.ViewGroup;
import android.view.View;
import android.app.Activity;
import android.content.Context;
import android.widget.FrameLayout$LayoutParams;
import android.view.Window;
import android.widget.FrameLayout;
import android.view.ViewGroup$LayoutParams;

public class g implements b	// class@001156
{
    public final q a;
    public Activity b;
    public TextView c;
    public View d;
    public int e;
    public final Runnable f;

    public void g(){
       super();
       this.a = new q();
       this.e = 0;
       this.f = new g0(this);
    }
    public void a(int p0){
       if (PatchProxy.isSupport(g.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, g.class, "11")) {
          return;
       }
       this.g(true);
       return;
    }
    public void b(int p0,boolean p1){
       g og = g.class;
       if (PatchProxy.isSupport(og) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Boolean.valueOf(p1), this, og, "4")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("PrettifyRecoAnimHandler", "onRecoStart: "+p0+"--"+this.e, objArray);
       if (this.e == null) {
          this.a.c(0);
       }
       if (this.e != p0) {
          this.e = p0;
          if (this.c == null) {
             this.k(true, p0);
             og = this.c;
             if (og != null) {
                if (!p1) {
                   og.setText(this.f(p0));
                }else {
                   og.setText(a1.p(R.string.arg_RES_7f100161)+"0%");
                }
             }
          }
       }
       return;
    }
    public void c(int p0){
       g og = g.class;
       if (PatchProxy.isSupport(og) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, og, "5")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("PrettifyRecoAnimHandler", "onRecoEnd: "+p0+"--"+this.e, objArray);
       if (!p0 || this.e == p0) {
          this.a.d(true);
          this.e = 0;
          this.g(true);
       }
       return;
    }
    public void d(float p0){
       g og = g.class;
       if (PatchProxy.isSupport(og) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, og, "9")) {
          return;
       }
       og = this.c;
       if (og == null) {
          return;
       }
       if (p0 - 0x3f800000 < 0) {
          og.setText(a1.p(R.string.arg_RES_7f100161)+(int)(p0 * 100.00f)+"%");
       }else {
          og.setText(this.f(this.e));
       }
       return;
    }
    public void e(int p0){
       g og = g.class;
       if (PatchProxy.isSupport(og) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, og, "10")) {
          return;
       }
       k1.m(this.f);
       og = this.c;
       if (og != null && !og.getVisibility()) {
          this.c.animate().setListener(null).cancel();
          this.c.setAlpha(0x3f800000);
          this.c.setVisibility(0);
       }else {
          this.k(true, p0);
       }
       g tc = this.c;
       if (tc != null) {
          tc.setText(a1.p(R.string.arg_RES_7f104127));
       }
       k1.r(this.f, 2000);
       return;
    }
    public final String f(int p0){
       g og = g.class;
       if (PatchProxy.isSupport(og)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, og, "12");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (p0 == 2) {
          return a1.p(0x7f100160);
       }else if(p0 == 1){
          return a1.p(0x7f10015f);
       }else {
          return a1.p(0x7f10412a);
       }
    }
    public final void g(boolean p0){
       g og = g.class;
       if (PatchProxy.isSupport(og) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, og, "7")) {
          return;
       }
       og = this.c;
       if (og == null) {
          return;
       }
       og.animate().setListener(null).cancel();
       if (p0) {
          this.c.animate().alpha(0).setDuration(200).setListener(new g$a(this));
       }else {
          this.h();
       }
       return;
    }
    public void h(){
       if (PatchProxy.applyVoid(null, this, g.class, "8")) {
          return;
       }
       g tc = this.c;
       if (tc != null && tc.getParent() != null) {
          this.c.animate().setListener(null).cancel();
          this.c.getParent().removeView(this.c);
          this.c = null;
       }
       return;
    }
    public void i(Activity p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "1")) {
          return;
       }
       this.b = p0;
       this.a.a(p0);
       return;
    }
    public void j(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "2")) {
          return;
       }
       this.d = p0;
       this.a.b(p0);
       return;
    }
    public final void k(boolean p0,int p1){
       FrameLayout$LayoutParams layoutParams;
       g og = g.class;
       if (PatchProxy.isSupport(og) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Integer.valueOf(p1), this, og, "6")) {
          return;
       }
       k1.m(this.f);
       this.h();
       if (!PatchProxy.isSupport(og) || (!PatchProxy.applyVoidOneRefs(Integer.valueOf(p1), this, og, "3") && this.b != null)) {
          og = this.d;
          if (og != null && og instanceof ViewGroup) {
             TextView textView = new TextView(this.b);
             this.c = textView;
             textView.setTextSize(2, 18.00f);
             this.c.setTextColor(a1.a(R.color.arg_RES_7f061c95));
             this.c.setShadowLayer(4.00f, 0, 0, a1.a(R.color.arg_RES_7f061c96));
             if (p1 == 3) {
                layoutParams = new FrameLayout$LayoutParams(-2, -2);
                layoutParams.gravity = 49;
                layoutParams.topMargin = a1.d(0x7f070265);
                this.b.getWindow().getDecorView().addView(this.c, layoutParams);
             }else {
                this.c.setGravity(17);
                layoutParams = new FrameLayout$LayoutParams(-1, -1);
                layoutParams.gravity = 17;
                this.d.addView(this.c, layoutParams);
             }
             this.c.setVisibility(8);
          }
       }
       g tc = this.c;
       if (tc != null) {
          tc.setVisibility(0);
          if (p0) {
             this.c.setAlpha(0);
             this.c.animate().setDuration(100).setListener(null).alpha(0x3f800000).start();
          }
       }
       return;
    }
}
