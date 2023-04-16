package com.kuaishou.live.common.core.component.comments.c;
import dp3.e;
import n91.b;
import java.lang.Object;
import android.view.ViewGroup;
import dp3.g;
import fp3.e;
import com.kuaishou.live.common.core.component.comments.c$a;
import fp3.a;
import android.view.LayoutInflater;
import android.animation.Animator;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import ec1.a;
import android.view.ViewGroup$LayoutParams;
import android.view.View;
import android.view.ViewGroup$MarginLayoutParams;
import ne1.m;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import android.animation.ValueAnimator;
import bq5.b;
import ne1.n;
import lnc.a1;
import ne1.l;
import com.kwai.feature.api.live.service.show.comments.view.LayoutParamsType;
import com.kuaishou.live.common.core.component.comments.LiveCommentsBizInScene;
import android.animation.TimeInterpolator;
import dp3.d;

public class c implements e	// class@001061
{
    public final ViewGroup b;
    public final b c;
    public int d;
    public ValueAnimator e;
    public boolean f;
    public boolean g;

    public void c(b p0){
       super();
       this.c = p0;
       this.b = p0.a2();
    }
    public void G(g p0,e p1){
    }
    public void H(a p0,LayoutInflater p1){
       this.g = true;
    }
    public boolean I(g p0){
       return false;
    }
    public void J(e p0,int p1,int p2,int p3,int p4,Animator p5){
       if (PatchProxy.isSupport(c.class)) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4),p5};
          if (PatchProxy.applyVoid(objArray, this, c.class, "4")) {
             return;
          }
       }
       if (p0 instanceof a && p5 != null) {
          this.b(p5);
          this.e.addUpdateListener(new m(this, (p2 - p4), this.getView().getLayoutParams().bottomMargin));
          this.e.start();
       }
       return;
    }
    public void K(e p0,g p1,Animator p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, c.class, "2")) {
          return;
       }
       if (p0 instanceof a && (p1 instanceof b && p2 != null)) {
          this.b(p2);
          int[] ointArray = new int[]{0};
          ViewGroup$MarginLayoutParams layoutParams = this.getView().getLayoutParams();
          if (this.d == null) {
             this.d = layoutParams.bottomMargin;
          }
          this.e.addUpdateListener(new n(this, ointArray, p1));
          this.e.start();
          this.f = true;
       }
    label_0047 :
       return;
    }
    public void L(e p0,g p1,Animator p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, c.class, "3")) {
          return;
       }
       if (p0 instanceof a && p2 != null) {
          this.b(p2);
          this.e.addUpdateListener(new l(this, (p1.getView().getHeight() + a1.e((float)p1.b()))));
          this.e.start();
          this.f = false;
       }
       return;
    }
    public final void a(int p0){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoc, "6")) {
          return;
       }
       if (this.g != null) {
          this.c.K0(LayoutParamsType.BOTTOM_MARGIN, LiveCommentsBizInScene.COMMENT_NOTICE.getValue(), p0);
       }
       return;
    }
    public final void b(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "5")) {
          return;
       }
       c te = this.e;
       if (te != null && te.isRunning()) {
          this.e.end();
       }
       ValueAnimator valueAnimato = ValueAnimator.ofFloat(new float[2]{0,0x3f800000});
       this.e = valueAnimato;
       valueAnimato.setDuration(p0.getDuration());
       this.e.setInterpolator(p0.getInterpolator());
       this.e.setStartDelay(p0.getStartDelay());
       this.e.removeAllUpdateListeners();
       return;
    }
    public ViewGroup getView(){
       return this.b;
    }
    public void r(int p0){
       d.b(this, p0);
    }
    public void unbind(){
       if (PatchProxy.applyVoid(null, this, c.class, "1")) {
          return;
       }
       c te = this.e;
       if (te != null) {
          te.cancel();
       }
       if (this.f != null) {
          this.a(this.d);
          this.f = false;
       }
       this.g = false;
       return;
    }
    public void w(g p0,e p1){
    }
}
