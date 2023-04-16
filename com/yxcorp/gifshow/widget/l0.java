package com.yxcorp.gifshow.widget.l0;
import java.lang.Runnable;
import com.yxcorp.gifshow.widget.TabTripleImageRotateView;
import java.lang.Object;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.animation.ValueAnimator;
import tyc.e5;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import tyc.f5;
import android.animation.Animator$AnimatorListener;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.animation.TimeInterpolator;

public final class l0 implements Runnable	// class@001991
{
    public final TabTripleImageRotateView b;

    public void l0(TabTripleImageRotateView p0){
       this.b = p0;
    }
    public final void run(){
       l0 tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoid(null, tb, TabTripleImageRotateView.class, "5")) {
       }else {
          float[] uofloatArray = new float[]{0x43fa0000};
          ValueAnimator valueAnimato = ValueAnimator.ofFloat(uofloatArray);
          valueAnimato.setDuration(500);
          valueAnimato.addUpdateListener(new e5(tb));
          valueAnimato.addListener(new f5(tb));
          valueAnimato.setInterpolator(new AccelerateDecelerateInterpolator());
          valueAnimato.start();
          tb.h = valueAnimato;
       }
       return;
    }
}
