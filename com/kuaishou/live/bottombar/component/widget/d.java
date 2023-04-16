package com.kuaishou.live.bottombar.component.widget.d;
import o61.b;
import java.lang.Object;
import o61.f;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import android.content.Context;
import android.view.View;
import android.content.res.Resources;
import cw9.c;
import android.view.ViewGroup;
import z61.b;
import android.animation.ValueAnimator;
import com.kuaishou.live.bottombar.component.widget.d$a;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import androidx.lifecycle.Observer;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import o61.a;
import qp.b;
import j61.c;
import androidx.lifecycle.LifecycleOwner;

public abstract class d implements b	// class@000d49
{
    public final float b;
    public final float c;
    public final long d;
    public ValueAnimator e;
    public MutableLiveData f;
    public final Observer g;
    public View h;
    public c i;
    public LifecycleOwner j;

    public void d(){
       super();
       this.b = 0x3f99999a;
       this.c = 0x3f800000;
       this.d = 1000;
       this.g = new f(this);
    }
    public int A(int p0){
       d uod = d.class;
       if (PatchProxy.isSupport(uod)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uod, "2");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       uod = this.h;
       if (uod == null) {
          return 0;
       }else {
          return c.a(uod.getContext().getResources(), p0);
       }
    }
    public View B(){
       return null;
    }
    public abstract View C(Context p0,ViewGroup p1);
    public abstract void D(View p0);
    public void E(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "3")) {
          return;
       }
       View view = this.B();
       if (view != null) {
          if (p0.mEnableBreathAnimator != null) {
             ValueAnimator valueAnimato = ValueAnimator.ofFloat(new float[3]{0x3f99999a,0x3f800000,0x3f99999a});
             this.e = valueAnimato;
             valueAnimato.setRepeatCount(-1);
             this.e.setDuration(1000);
             this.e.addUpdateListener(new d$a(this, view));
             this.e.start();
          }else if(this.e != null){
             view.setScaleX(0x3f800000);
             view.setScaleY(0x3f800000);
             view.clearAnimation();
             this.e.cancel();
             this.e.removeAllUpdateListeners();
             this.e = null;
          }
       }
       return;
    }
    public abstract void F(b p0);
    public void a(){
       if (PatchProxy.applyVoid(null, this, d.class, "5")) {
          return;
       }
       d tf = this.f;
       if (tf != null) {
          tf.removeObserver(this.g);
       }
       tf = this.e;
       if (tf != null) {
          tf.cancel();
          this.e.removeAllUpdateListeners();
          this.e = null;
       }
       return;
    }
    public final View f(){
       return this.h;
    }
    public final MutableLiveData n(){
       return this.f;
    }
    public void q(int p0){
       a.a(this, p0);
    }
    public void r(Context p0,ViewGroup p1){
       View view;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, d.class, "1")) {
          return;
       }
       if (this.h != null) {
          b.d("LiveBottomBarBaseViewItem", "root view has been initialize ");
          return;
       }else {
          view = this.C(p0, p1);
          this.h = view;
          this.D(view);
          return;
       }
    }
    public final void u(c p0){
       this.i = p0;
    }
    public final void w(){
       if (PatchProxy.applyVoid(null, this, d.class, "4")) {
          return;
       }
       d tf = this.f;
       if (tf == null) {
          return;
       }
       tf.removeObserver(this.g);
       tf = this.j;
       if (tf == null) {
          return;
       }
       this.f.observe(tf, this.g);
       return;
    }
    public void y(LifecycleOwner p0,MutableLiveData p1){
       this.f = p1;
       this.j = p0;
    }
}
