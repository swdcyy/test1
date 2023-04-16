package com.kuaishou.live.basic.widget.b;
import java.lang.Runnable;
import com.kuaishou.live.basic.widget.LiveTransitionAvatarView;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import android.animation.ValueAnimator;
import g61.b;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import g61.c;
import android.animation.Animator$AnimatorListener;
import ekd.k1;

public class b implements Runnable	// class@000d36
{
    public final LiveTransitionAvatarView b;

    public void b(LiveTransitionAvatarView p0){
       this.b = p0;
       super();
    }
    public void run(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, b.class, "1")) {
          return;
       }
       b tb = this.b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoid(objArray, tb, LiveTransitionAvatarView.class, "4")) {
          if (tb.E == null) {
             ValueAnimator valueAnimato = ValueAnimator.ofFloat(new float[2]{0x3f800000,0});
             tb.E = valueAnimato;
             valueAnimato.setDuration(300);
             tb.E.addUpdateListener(new b(tb));
             tb.E.addListener(new c(tb));
          }
          tb.E.start();
       }
       k1.s(this, this.b, 2000);
       return;
    }
}
