package com.kuaishou.live.widget.a;
import java.lang.Runnable;
import com.kuaishou.live.widget.LivePkShimmerLayout;
import java.lang.Object;
import android.widget.LinearLayout;
import android.animation.ValueAnimator;
import android.animation.TimeInterpolator;
import qq3.d;
import android.animation.ValueAnimator$AnimatorUpdateListener;

public final class a implements Runnable	// class@001026
{
    public final LivePkShimmerLayout b;
    public final long c;

    public void a(LivePkShimmerLayout p0,long p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       a tb = this.b;
       a tc = this.c;
       if (tb.l == null) {
          float[] uofloatArray = new float[]{(float)(- tb.getWidth()),(float)tb.getWidth()};
          ValueAnimator valueAnimato = ValueAnimator.ofFloat(uofloatArray);
          tb.l = valueAnimato;
          valueAnimato.setDuration(tc);
          LivePkShimmerLayout p = tb.p;
          if (p != null) {
             tb.l.setInterpolator(p);
          }
          tb.l.addUpdateListener(new d(tb));
       }
       if (tb.l.isRunning()) {
          tb.l.cancel();
       }
       tb.l.start();
       return;
    }
}
