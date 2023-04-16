package com.yxcorp.gifshow.message_camera.effect.prettify.IMPrettifyEffectPanel$d;
import android.animation.AnimatorListenerAdapter;
import msd.a;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;

public final class IMPrettifyEffectPanel$d extends AnimatorListenerAdapter	// class@001d9e
{
    public final boolean a;
    public final a b;

    public void IMPrettifyEffectPanel$d(boolean p0,a p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, IMPrettifyEffectPanel$d.class, "1")) {
          return;
       }
       a.p(p0, "animation");
       this.b.invoke();
       PatchProxy.onMethodExit(IMPrettifyEffectPanel$d.class, "1");
       return;
    }
}
