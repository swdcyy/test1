package com.kwai.nearby.local.presenter.w$b;
import ekd.f$j;
import com.kwai.nearby.local.presenter.w;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.ImageView;
import lnc.a1;
import android.animation.ObjectAnimator;
import th0.e;
import android.animation.TimeInterpolator;

public class w$b extends f$j	// class@000fdb
{
    public final int a;
    public final w b;

    public void w$b(w p0,int p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, w$b.class, "1")) {
          return;
       }
       this.b.u.setVisibility(8);
       this.b.t.setVisibility(0);
       float[] uofloatArray = new float[]{(float)this.a,(float)a1.e(2.00f)};
       ObjectAnimator objectAnimat = ObjectAnimator.ofFloat(this.b.q, "translationX", uofloatArray);
       objectAnimat.setDuration(150);
       objectAnimat.setInterpolator(new e());
       objectAnimat.start();
       return;
    }
}
