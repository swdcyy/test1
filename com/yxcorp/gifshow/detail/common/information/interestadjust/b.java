package com.yxcorp.gifshow.detail.common.information.interestadjust.b;
import androidx.lifecycle.Observer;
import com.yxcorp.gifshow.detail.common.information.interestadjust.d;
import java.lang.Object;
import java.lang.Boolean;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.animation.Animator;
import android.view.View;
import android.animation.ValueAnimator;
import hy9.d;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import hy9.j;
import android.animation.Animator$AnimatorListener;

public final class b implements Observer	// class@001426
{
    public final d b;

    public void b(d p0){
       this.b = p0;
    }
    public final void onChanged(Object p0){
       b tb = this.b;
       Objects.requireNonNull(tb);
       p0 = PatchProxy.apply(null, tb, d.class, "3");
       if (p0 != PatchProxyResult.class) {
       }else {
          ValueAnimator valueAnimato = ValueAnimator.ofFloat(new float[2]{0,0x3f800000});
          valueAnimato.addUpdateListener(new d(tb, tb.o.getHeight()));
          valueAnimato.setDuration(250);
          valueAnimato.addListener(new j(tb));
          p0 = valueAnimato;
       }
       tb.p = p0;
       if (p0.isRunning()) {
          tb.p.cancel();
       }
       tb.p.start();
       return;
    }
}
