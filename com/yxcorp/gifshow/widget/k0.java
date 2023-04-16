package com.yxcorp.gifshow.widget.k0;
import java.lang.Runnable;
import com.yxcorp.gifshow.widget.TabDoubleImageRotateView;
import java.lang.Object;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.animation.ValueAnimator;
import tyc.c5;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import tyc.d5;
import android.animation.Animator$AnimatorListener;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.animation.TimeInterpolator;

public final class k0 implements Runnable	// class@00198f
{
    public final TabDoubleImageRotateView b;

    public void k0(TabDoubleImageRotateView p0){
       this.b = p0;
    }
    public final void run(){
       k0 tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoid(null, tb, TabDoubleImageRotateView.class, "5")) {
       }else {
          float[] uofloatArray = new float[]{0x43fa0000};
          ValueAnimator valueAnimato = ValueAnimator.ofFloat(uofloatArray);
          valueAnimato.setDuration(500);
          valueAnimato.addUpdateListener(new c5(tb));
          valueAnimato.addListener(new d5(tb));
          valueAnimato.setInterpolator(new AccelerateDecelerateInterpolator());
          valueAnimato.start();
          tb.g = valueAnimato;
       }
       return;
    }
}
