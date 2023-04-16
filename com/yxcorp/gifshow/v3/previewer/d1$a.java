package com.yxcorp.gifshow.v3.previewer.d1$a;
import android.animation.AnimatorListenerAdapter;
import com.yxcorp.gifshow.v3.previewer.d1;
import java.lang.Runnable;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import lwc.l3;
import ekd.k1;
import uxb.i;
import uxb.l;

public class d1$a extends AnimatorListenerAdapter	// class@001592
{
    public final boolean a;
    public final Runnable b;
    public final d1 c;

    public void d1$a(d1 p0,boolean p1,Runnable p2){
       this.c = p0;
       this.a = p1;
       this.b = p2;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d1$a.class, "2")) {
          return;
       }
       k1.r(new l3(this, this.a, this.b), 200);
       return;
    }
    public void onAnimationStart(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d1$a.class, "1")) {
          return;
       }
       l.e().fC();
       return;
    }
}
