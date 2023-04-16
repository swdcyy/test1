package com.yxcorp.gifshow.camera.record.frame.k;
import android.animation.AnimatorListenerAdapter;
import com.yxcorp.gifshow.camera.record.frame.l;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kd9.k0;
import java.lang.Runnable;
import ekd.k1;

public class k extends AnimatorListenerAdapter	// class@000de9
{
    public final boolean a;
    public final l b;

    public void k(l p0,boolean p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void onAnimationStart(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, k.class, "1")) {
          return;
       }
       super.onAnimationStart(p0);
       k ta = this.a;
       k0 ok0 = new k0(this, ta);
       long l = (ta != null)? 0: 50;
       k1.r(ok0, l);
       return;
    }
}
