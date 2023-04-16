package com.yxcorp.gifshow.v3.previewer.ktv.i;
import java.lang.Runnable;
import com.yxcorp.gifshow.v3.previewer.ktv.j;
import java.lang.Object;
import java.util.Objects;
import com.yxcorp.gifshow.v3.previewer.ktv.l;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.TextView;
import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.AnimatorSet;
import mwc.y;
import android.widget.ImageView;

public final class i implements Runnable	// class@0015c4
{
    public final j b;

    public void i(j p0){
       this.b = p0;
    }
    public final void run(){
       float[] uofloatArray;
       i tb = this.b;
       j a = tb.a;
       Objects.requireNonNull(a);
       if (PatchProxy.applyVoid(null, a, l.class, "13")) {
       }else {
          l b = a.b;
          b.setPivotX((float)(b.getWidth() / 2));
          a.b.setPivotY(0);
          Animator[] uAnimatorArr = new Animator[]{ObjectAnimator.ofFloat(a.b, "scaleX", new float[2]{0x3f800000,0x3ecccccd}).setDuration((long)a.t),ObjectAnimator.ofFloat(a.b, "translationY", uofloatArray).setDuration((long)a.t),ObjectAnimator.ofFloat(a.b, "scaleY", new float[2]{0x3f800000,0x3ecccccd}).setDuration((long)a.t)};
          uofloatArray = new float[]{0,(float)a.k};
          a.q.playTogether(uAnimatorArr);
          a.q.start();
       }
       a = tb.a;
       a.e.postDelayed(new y(tb), (long)a.v);
       return;
    }
}
