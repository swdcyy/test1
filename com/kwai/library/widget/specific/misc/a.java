package com.kwai.library.widget.specific.misc.a;
import java.lang.Runnable;
import com.kwai.library.widget.specific.misc.LoadingCircle;
import java.lang.Object;
import java.util.Objects;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateInterpolator;
import android.animation.TimeInterpolator;
import com.kwai.library.widget.specific.misc.d;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import b27.f;

public final class a implements Runnable	// class@000a1c
{
    public final LoadingCircle b;

    public void a(LoadingCircle p0){
       this.b = p0;
    }
    public final void run(){
       a tb = this.b;
       Objects.requireNonNull(tb);
       ValueAnimator valueAnimato = ValueAnimator.ofInt(new int[2]{0,270});
       valueAnimato.setRepeatCount(0);
       valueAnimato.setInterpolator(new AccelerateInterpolator());
       valueAnimato.setDuration(tb.f);
       valueAnimato.addUpdateListener(new d(tb, valueAnimato));
       valueAnimato.start();
       ValueAnimator valueAnimato1 = ValueAnimator.ofInt(new int[2]{0,'-'});
       valueAnimato1.setRepeatCount(0);
       valueAnimato1.setDuration(tb.f);
       valueAnimato1.addUpdateListener(new f(tb));
       valueAnimato1.start();
    }
}
