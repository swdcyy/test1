package com.yxcorp.gifshow.v3.previewer.d1$b;
import android.animation.AnimatorListenerAdapter;
import com.yxcorp.gifshow.v3.previewer.d1;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import lwc.m3;
import java.lang.Runnable;
import ekd.k1;
import uxb.i;
import uxb.l;

public class d1$b extends AnimatorListenerAdapter	// class@001593
{
    public final boolean a;
    public final d1 b;

    public void d1$b(d1 p0,boolean p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d1$b.class, "2")) {
          return;
       }
       k1.r(new m3(this, this.a), 200);
       return;
    }
    public void onAnimationStart(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d1$b.class, "1")) {
          return;
       }
       l.e().fC();
       return;
    }
}
