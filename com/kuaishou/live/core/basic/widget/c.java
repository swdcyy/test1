package com.kuaishou.live.core.basic.widget.c;
import java.lang.Runnable;
import com.kuaishou.live.core.basic.widget.LiveHourlyRankAvatarRotateView;
import java.lang.Object;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.animation.ValueAnimator;
import d22.f;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import d22.g;
import android.animation.Animator$AnimatorListener;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.animation.TimeInterpolator;

public final class c implements Runnable	// class@000917
{
    public final LiveHourlyRankAvatarRotateView b;

    public void c(LiveHourlyRankAvatarRotateView p0){
       this.b = p0;
    }
    public final void run(){
       c tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoid(null, tb, LiveHourlyRankAvatarRotateView.class, "5")) {
       }else {
          ValueAnimator valueAnimato = ValueAnimator.ofFloat(new float[2]{0,0x3f800000});
          valueAnimato.setDuration(500);
          valueAnimato.addUpdateListener(new f(tb));
          valueAnimato.addListener(new g(tb));
          valueAnimato.setInterpolator(new AccelerateDecelerateInterpolator());
          valueAnimato.start();
          tb.j = valueAnimato;
       }
       return;
    }
}
