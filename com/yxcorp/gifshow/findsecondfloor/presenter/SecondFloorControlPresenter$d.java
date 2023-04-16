package com.yxcorp.gifshow.findsecondfloor.presenter.SecondFloorControlPresenter$d;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import com.yxcorp.gifshow.findsecondfloor.presenter.SecondFloorControlPresenter;
import java.lang.Object;
import android.animation.ValueAnimator;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.lang.Float;
import pfa.b;
import android.view.View;
import java.lang.NullPointerException;

public final class SecondFloorControlPresenter$d implements ValueAnimator$AnimatorUpdateListener	// class@001003
{
    public final SecondFloorControlPresenter a;
    public final long b;

    public void SecondFloorControlPresenter$d(SecondFloorControlPresenter p0,long p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public final void onAnimationUpdate(ValueAnimator p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, SecondFloorControlPresenter$d.class, "1")) {
          return;
       }
       a.o(p0, "animation");
       p0 = p0.getAnimatedValue();
       if (p0 != null) {
          float f = p0.floatValue();
          SecondFloorControlPresenter.S8(this.a).j(f);
          SecondFloorControlPresenter.V8(this.a).setTranslationY(f);
          PatchProxy.onMethodExit(SecondFloorControlPresenter$d.class, "1");
          return;
       }else {
          PatchProxy.onMethodExit(SecondFloorControlPresenter$d.class, "1");
          throw new NullPointerException("null cannot be cast to non-null type kotlin.Float");
       }
    }
}
