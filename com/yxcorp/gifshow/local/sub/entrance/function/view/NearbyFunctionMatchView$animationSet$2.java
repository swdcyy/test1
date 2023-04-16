package com.yxcorp.gifshow.local.sub.entrance.function.view.NearbyFunctionMatchView$animationSet$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import android.animation.AnimatorSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.animation.TimeInterpolator;

public final class NearbyFunctionMatchView$animationSet$2 extends Lambda implements a	// class@001ab0
{
    public static final NearbyFunctionMatchView$animationSet$2 INSTANCE;

    static {
       NearbyFunctionMatchView$animationSet$2.INSTANCE = new NearbyFunctionMatchView$animationSet$2();
    }
    public void NearbyFunctionMatchView$animationSet$2(){
       super(0);
    }
    public final AnimatorSet invoke(){
       AnimatorSet obj = PatchProxy.apply(null, this, NearbyFunctionMatchView$animationSet$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new AnimatorSet();
       obj.setDuration(500);
       obj.setInterpolator(new AccelerateDecelerateInterpolator());
       return obj;
    }
    public Object invoke(){
       return this.invoke();
    }
}
