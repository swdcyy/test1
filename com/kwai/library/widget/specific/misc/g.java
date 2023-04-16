package com.kwai.library.widget.specific.misc.g;
import java.lang.Runnable;
import com.kwai.library.widget.specific.misc.LoadingCircle;
import java.lang.Object;
import java.util.Objects;
import android.animation.ValueAnimator;
import android.view.animation.DecelerateInterpolator;
import android.animation.TimeInterpolator;
import com.kwai.library.widget.specific.misc.c;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import b27.e;

public final class g implements Runnable	// class@000a22
{
    public final LoadingCircle b;

    public void g(LoadingCircle p0){
       this.b = p0;
    }
    public final void run(){
       g tb = this.b;
       Objects.requireNonNull(tb);
       ValueAnimator valueAnimato = ValueAnimator.ofInt(new int[2]{270,0});
       valueAnimato.setRepeatCount(0);
       valueAnimato.setDuration(tb.g);
       valueAnimato.setInterpolator(new DecelerateInterpolator());
       valueAnimato.addUpdateListener(new c(tb, valueAnimato));
       valueAnimato.start();
       ValueAnimator valueAnimato1 = ValueAnimator.ofInt(new int[2]{0,450});
       valueAnimato1.setRepeatCount(0);
       valueAnimato1.setDuration(tb.g);
       valueAnimato1.setInterpolator(new DecelerateInterpolator());
       valueAnimato1.addUpdateListener(new e(tb));
       valueAnimato1.start();
    }
}
