package com.kwai.library.widget.specific.misc.b;
import java.lang.Runnable;
import com.kwai.library.widget.specific.misc.LoadingCircle;
import java.lang.Object;
import java.util.Objects;
import android.animation.ValueAnimator;
import android.view.animation.DecelerateInterpolator;
import android.animation.TimeInterpolator;
import com.kwai.library.widget.specific.misc.e;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import b27.g;

public final class b implements Runnable	// class@000a1d
{
    public final LoadingCircle b;

    public void b(LoadingCircle p0){
       this.b = p0;
    }
    public final void run(){
       b tb = this.b;
       Objects.requireNonNull(tb);
       ValueAnimator valueAnimato = ValueAnimator.ofInt(new int[2]{270,0});
       valueAnimato.setDuration(tb.g);
       valueAnimato.setRepeatCount(0);
       valueAnimato.setInterpolator(new DecelerateInterpolator());
       valueAnimato.addUpdateListener(new e(tb, valueAnimato));
       valueAnimato.start();
       ValueAnimator valueAnimato1 = ValueAnimator.ofInt(new int[2]{135,630});
       valueAnimato1.setDuration(tb.g);
       valueAnimato1.setRepeatCount(0);
       valueAnimato1.setInterpolator(new DecelerateInterpolator());
       valueAnimato1.addUpdateListener(new g(tb));
       valueAnimato1.start();
    }
}
