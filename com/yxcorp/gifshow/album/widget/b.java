package com.yxcorp.gifshow.album.widget.b;
import java.lang.Runnable;
import com.yxcorp.gifshow.album.widget.LoadingCircle;
import java.lang.Object;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateInterpolator;
import android.animation.TimeInterpolator;
import com.yxcorp.gifshow.album.widget.d;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import s79.d;

public final class b implements Runnable	// class@001b19
{
    public final LoadingCircle b;

    public void b(LoadingCircle p0){
       this.b = p0;
    }
    public final void run(){
       b tb = this.b;
       Objects.requireNonNull(tb);
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, tb, LoadingCircle.class, "7")) {
       }else {
          int i = 2;
          ValueAnimator valueAnimato = ValueAnimator.ofInt(new int[i]{0,270});
          valueAnimato.setRepeatCount(0);
          valueAnimato.setInterpolator(new AccelerateInterpolator());
          valueAnimato.setDuration(tb.f);
          valueAnimato.addUpdateListener(new d(tb, valueAnimato));
          valueAnimato.start();
          if (!PatchProxy.applyVoid(objArray, tb, LoadingCircle.class, "8")) {
             ValueAnimator valueAnimato1 = ValueAnimator.ofInt(new int[i]{0,'-'});
             valueAnimato1.setRepeatCount(0);
             valueAnimato1.setDuration(tb.f);
             valueAnimato1.addUpdateListener(new d(tb));
             valueAnimato1.start();
          }
       }
       return;
    }
}
