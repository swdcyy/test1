package com.yxcorp.gifshow.ad.widget.a;
import android.view.View;
import java.lang.Object;
import java.lang.String;
import android.animation.ObjectAnimator;
import com.yxcorp.gifshow.ad.widget.a$a;
import android.animation.Animator$AnimatorListener;
import android.animation.AnimatorSet;
import android.animation.Animator;
import android.animation.AnimatorSet$Builder;
import w59.e;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import java.lang.Runnable;
import ekd.k1;

public class a	// class@001927
{
    public final View a;
    public final View b;
    public View c;
    public View d;
    public final ObjectAnimator e;
    public final ObjectAnimator f;
    public final ObjectAnimator g;
    public final AnimatorSet h;
    public final Runnable i;

    public void a(View p0,View p1,long p2,long p3,long p4){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p0;
       this.d = p1;
       ObjectAnimator objectAnimat = ObjectAnimator.ofFloat(p0, "alpha", new float[3]{0x3f800000,0x3f333333,0});
       this.g = objectAnimat;
       objectAnimat.setDuration(p2);
       ObjectAnimator objectAnimat1 = ObjectAnimator.ofFloat(this.d, "scaleX", new float[3]{0,0x3f19999a,0x3f800000});
       this.e = objectAnimat1;
       ObjectAnimator objectAnimat2 = ObjectAnimator.ofFloat(this.d, "scaleY", new float[3]{0,0x3f19999a,0x3f800000});
       this.f = objectAnimat2;
       objectAnimat1.setDuration(p3);
       objectAnimat2.setDuration(p3);
       objectAnimat1.addListener(new a$a(this, p4));
       AnimatorSet uAnimatorSet = new AnimatorSet();
       this.h = uAnimatorSet;
       uAnimatorSet.play(objectAnimat2).with(objectAnimat1).after(objectAnimat);
       this.i = new e(uAnimatorSet);
    }
    public void a(long p0){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, uoa, "1")) {
          return;
       }
       k1.m(this.i);
       k1.r(this.i, p0);
       return;
    }
}
