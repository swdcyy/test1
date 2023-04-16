package com.kwai.nearby.local.tab.present.c;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import com.kwai.nearby.local.tab.present.HomeLocalTopTabDisplayPresenter;
import java.lang.Object;
import android.animation.ValueAnimator;
import on5.b;
import java.lang.Float;
import ro5.c0;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.String;
import ro5.c;
import pr6.d;
import com.kwai.kcube.TabIdentifier;
import z1.a;

public final class c implements ValueAnimator$AnimatorUpdateListener	// class@000ff2
{
    public final HomeLocalTopTabDisplayPresenter a;

    public void c(HomeLocalTopTabDisplayPresenter p0){
       this.a = p0;
    }
    public final void onAnimationUpdate(ValueAnimator p0){
       HomeLocalTopTabDisplayPresenter y = this.a.y;
       TabIdentifier d = b.d;
       float f = p0.getAnimatedValue().floatValue();
       if (!PatchProxy.isSupport(c0.class) || !PatchProxy.applyVoidThreeRefs(y, d, Float.valueOf(f), null, c0.class, "22")) {
          c0.c(y, d, new c(f));
       }
       return;
    }
}
