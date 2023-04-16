package com.kwai.live.gzone.widget.e;
import com.kwai.library.widget.popup.common.PopupInterface$f;
import ml8.d;
import com.kwai.library.widget.popup.common.c;
import lnc.a1;
import android.app.Activity;
import com.kwai.live.gzone.widget.e$a;
import com.kwai.library.widget.popup.common.c$b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.live.gzone.widget.c;
import com.kwai.library.widget.popup.common.PopupInterface$c;
import com.kwai.live.gzone.widget.d;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import com.kwai.library.widget.popup.common.f;
import lnc.l1;
import android.os.Bundle;
import java.util.WeakHashMap;
import java.util.List;
import java.util.ArrayList;
import android.view.View;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.kwai.robust.PatchProxyResult;
import i2b.a;
import o07.n;
import java.lang.Number;
import com.yxcorp.utility.n;
import android.animation.Animator$AnimatorListener;
import android.animation.Animator;
import java.lang.Long;
import android.animation.AnimatorSet;
import android.view.animation.DecelerateInterpolator;
import android.animation.TimeInterpolator;
import android.view.ViewGroup$LayoutParams;
import android.widget.FrameLayout$LayoutParams;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.kuaishou.live.audience.component.chat.apply.k;
import m67.g;

public abstract class e extends c implements PopupInterface$f, d	// class@000e8f
{
    public e$a p;
    public View q;
    public boolean r;
    public ViewGroup s;
    public static WeakHashMap t;
    public static final int u;
    public static final int v;
    public static final int w;

    static {
       e.u = a1.e(16.00f);
       e.v = a1.e(300.00f);
       e.w = a1.e(354.00f);
    }
    public void e(Activity p0){
       super(new e$a(p0));
    }
    public void e(e$a p0){
       super(p0);
       this.p = p0;
       p0.P(false);
       p0.z(true);
       p0.A(true);
       p0.L(this);
       if (this.k0() && !PatchProxy.applyVoidOneRefs(p0, this, e.class, "1")) {
          p0.F(new c(this));
          p0.N(new d(this));
       }
       Drawable uDrawable = this.b0();
       if (uDrawable != null) {
          p0.w(uDrawable);
          this.d.setBackground(uDrawable);
       }
       p0.H(f.r(this.u()));
       this.r = l1.a();
       return;
    }
    public void N(Bundle p0){
       e uoe = e.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uoe, "5")) {
          return;
       }
       if (!PatchProxy.applyVoidOneRefs(this, null, uoe, "11")) {
          WeakHashMap t = e.t;
          if (t != null) {
             List list = t.get(this.u());
             if (list != null) {
                list.remove(this);
                if (list.isEmpty()) {
                   e.t.remove(this.u());
                }
             }
             if (e.t.isEmpty()) {
                e.t = null;
             }
          }
       }
       return;
    }
    public void O(Bundle p0){
       e uoe = e.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uoe, "4")) {
          return;
       }
       Object obj = null;
       if (!PatchProxy.applyVoidOneRefs(this, obj, uoe, "10")) {
          WeakHashMap t = e.t;
          if (t == null) {
             e.t = new WeakHashMap();
          }else {
             obj = t.get(this.u());
          }
          if (obj == null) {
             obj = new ArrayList();
             e.t.put(this.u(), obj);
          }
          obj.add(this);
       }
       this.doBindView(this.s);
       if (this.j0()) {
          this.h0(this.f);
       }
       this.f0(this.s, p0);
       return;
    }
    public View a(c p0,LayoutInflater p1,ViewGroup p2,Bundle p3){
       p0 = PatchProxy.applyFourRefs(p0, p1, p2, p3, this, e.class, "3");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       View view = a.g(p1, this.d0(), p2, false);
       this.q = view;
       this.s = p2;
       return view;
    }
    public void b(c p0){
       n.a(this, p0);
    }
    public Drawable b0(){
       return null;
    }
    public int c0(){
       e obj = PatchProxy.apply(null, this, e.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.p;
       if (obj.H != null && this.r != null) {
          obj.G = n.j(this.u());
       }
       e$a g = this.p.G;
       if (g != null) {
          return g;
       }else {
          return e.v;
       }
    }
    public abstract int d0();
    public void doBindView(View p0){
    }
    public int e0(){
       return e.w;
    }
    public void f0(View p0,Bundle p1){
    }
    public void g0(long p0,Animator$AnimatorListener p1,Animator[] p2){
       if (PatchProxy.isSupport(e.class) && PatchProxy.applyVoidThreeRefs(Long.valueOf(p0), p1, p2, this, e.class, "2")) {
          return;
       }
       AnimatorSet uAnimatorSet = new AnimatorSet();
       uAnimatorSet.playTogether(p2);
       uAnimatorSet.setDuration(p0);
       uAnimatorSet.setInterpolator(new DecelerateInterpolator(0x3fc00000));
       if (p1 != null) {
          uAnimatorSet.addListener(p1);
       }
       uAnimatorSet.start();
       return;
    }
    public void h0(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "6")) {
          return;
       }
       ViewGroup$LayoutParams layoutParams = p0.getLayoutParams();
       if (layoutParams == null) {
          layoutParams = new FrameLayout$LayoutParams(-2, -2);
       }
       if (this.r != null) {
          layoutParams.height = -1;
          layoutParams.width = this.c0();
       }else {
          layoutParams.height = this.e0();
          layoutParams.width = -1;
       }
       return;
    }
    public e i0(PopupInterface$h p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, e.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.p.M(p0);
       return this;
    }
    public boolean j0(){
       return this instanceof k;
    }
    public boolean k0(){
       return (this instanceof g ^ 0x01);
    }
}
