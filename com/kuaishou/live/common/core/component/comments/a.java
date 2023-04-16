package com.kuaishou.live.common.core.component.comments.a;
import dp3.e;
import android.view.ViewGroup;
import java.lang.Object;
import java.lang.Boolean;
import mrd.a;
import dp3.g;
import fp3.e;
import com.kuaishou.live.common.core.component.comments.a$b;
import fp3.a;
import android.view.LayoutInflater;
import android.animation.Animator;
import dp3.d;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import fo1.a;
import java.lang.Integer;
import java.lang.Float;
import android.animation.ValueAnimator;
import android.animation.TimeInterpolator;
import ne1.f;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import com.kuaishou.live.common.core.component.comments.a$a;
import android.animation.Animator$AnimatorListener;
import va1.b0;

public class a implements e	// class@00105b
{
    public final ViewGroup b;
    public ValueAnimator c;
    public boolean d;
    public final boolean e;
    public final a f;

    public void a(ViewGroup p0,boolean p1){
       super();
       this.f = a.h(Boolean.TRUE);
       this.b = p0;
       this.e = p1;
    }
    public void G(g p0,e p1){
    }
    public void H(a p0,LayoutInflater p1){
    }
    public boolean I(g p0){
       return false;
    }
    public void J(e p0,int p1,int p2,int p3,int p4,Animator p5){
       d.a(this, p0, p1, p2, p3, p4, p5);
    }
    public void K(e p0,g p1,Animator p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, a.class, "3")) {
          return;
       }
       if (p0 instanceof a) {
          this.b(p2, 0x3f800000, 0);
          this.d = true;
       }
       return;
    }
    public void L(e p0,g p1,Animator p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, a.class, "4")) {
          return;
       }
       if (p0 instanceof a) {
          this.b(p2, 0, 0x3f800000);
          this.d = false;
       }
       return;
    }
    public void a(int p0){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "1")) {
          return;
       }
       if (this.e != null) {
          uoa = this.f;
          boolean b = (!p0)? true: false;
          uoa.onNext(Boolean.valueOf(b));
       }else {
          this.b.setVisibility(p0);
       }
       return;
    }
    public final void b(Animator p0,float p1,float p2){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidThreeRefs(p0, Float.valueOf(p1), Float.valueOf(p2), this, a.class, "5")) {
          return;
       }
       if (p0 != null) {
          if (!PatchProxy.applyVoidOneRefs(p0, this, uoa, "6")) {
             uoa = this.c;
             if (uoa != null && uoa.isRunning()) {
                this.c.end();
             }
             ValueAnimator valueAnimato = ValueAnimator.ofFloat(new float[2]{0,0x3f800000});
             this.c = valueAnimato;
             valueAnimato.setDuration(p0.getDuration());
             this.c.setInterpolator(p0.getInterpolator());
             this.c.setStartDelay(p0.getStartDelay());
             this.c.removeAllUpdateListeners();
             this.c.removeAllListeners();
          }
          this.c.addUpdateListener(new f(this, p1, p2));
          this.c.addListener(new a$a(this, p2, p1));
          this.c.start();
       }else {
          this.b.setAlpha(p2);
          int i = (p2 - p1 >= 0 && !b0.a())? 0: 4;
          this.a(i);
       }
       return;
    }
    public ViewGroup getView(){
       return this.b;
    }
    public void r(int p0){
       d.b(this, p0);
    }
    public void unbind(){
       if (PatchProxy.applyVoid(null, this, a.class, "2")) {
          return;
       }
       if (this.d != null) {
          this.b.setAlpha(0x3f800000);
          this.a(0);
          this.d = false;
       }
       return;
    }
    public void w(g p0,e p1){
    }
}
