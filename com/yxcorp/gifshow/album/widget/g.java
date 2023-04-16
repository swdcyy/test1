package com.yxcorp.gifshow.album.widget.g;
import java.lang.Runnable;
import com.yxcorp.gifshow.album.widget.LoadingCircle;
import java.lang.Object;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.animation.ValueAnimator;
import android.view.animation.DecelerateInterpolator;
import android.animation.TimeInterpolator;
import com.yxcorp.gifshow.album.widget.e;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import s79.e;

public final class g implements Runnable	// class@001b1e
{
    public final LoadingCircle b;

    public void g(LoadingCircle p0){
       this.b = p0;
    }
    public final void run(){
       g tb = this.b;
       Objects.requireNonNull(tb);
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, tb, LoadingCircle.class, "9")) {
       }else {
          int i = 2;
          ValueAnimator valueAnimato = ValueAnimator.ofInt(new int[i]{270,0});
          valueAnimato.setDuration(tb.g);
          valueAnimato.setRepeatCount(0);
          valueAnimato.setInterpolator(new DecelerateInterpolator());
          valueAnimato.addUpdateListener(new e(tb, valueAnimato));
          valueAnimato.start();
          if (!PatchProxy.applyVoid(objArray, tb, LoadingCircle.class, "10")) {
             ValueAnimator valueAnimato1 = ValueAnimator.ofInt(new int[i]{135,630});
             valueAnimato1.setDuration(tb.g);
             valueAnimato1.setRepeatCount(0);
             valueAnimato1.setInterpolator(new DecelerateInterpolator());
             valueAnimato1.addUpdateListener(new e(tb));
             valueAnimato1.start();
          }
       }
       return;
    }
}
