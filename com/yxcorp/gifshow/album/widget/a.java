package com.yxcorp.gifshow.album.widget.a;
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
import com.yxcorp.gifshow.album.widget.c;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import s79.c;

public final class a implements Runnable	// class@001b18
{
    public final LoadingCircle b;

    public void a(LoadingCircle p0){
       this.b = p0;
    }
    public final void run(){
       a tb = this.b;
       Objects.requireNonNull(tb);
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, tb, LoadingCircle.class, "5")) {
       }else {
          int i = 2;
          ValueAnimator valueAnimato = ValueAnimator.ofInt(new int[i]{270,0});
          valueAnimato.setRepeatCount(0);
          valueAnimato.setDuration(tb.g);
          valueAnimato.setInterpolator(new DecelerateInterpolator());
          valueAnimato.addUpdateListener(new c(tb, valueAnimato));
          valueAnimato.start();
          if (!PatchProxy.applyVoid(objArray, tb, LoadingCircle.class, "6")) {
             ValueAnimator valueAnimato1 = ValueAnimator.ofInt(new int[i]{0,450});
             valueAnimato1.setRepeatCount(0);
             valueAnimato1.setDuration(tb.g);
             valueAnimato1.setInterpolator(new DecelerateInterpolator());
             valueAnimato1.addUpdateListener(new c(tb));
             valueAnimato1.start();
          }
       }
       return;
    }
}
