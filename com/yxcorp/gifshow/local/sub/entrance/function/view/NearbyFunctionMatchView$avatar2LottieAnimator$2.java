package com.yxcorp.gifshow.local.sub.entrance.function.view.NearbyFunctionMatchView$avatar2LottieAnimator$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.local.sub.entrance.function.view.NearbyFunctionMatchView;
import android.animation.ObjectAnimator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.view.View;
import android.util.Property;

public final class NearbyFunctionMatchView$avatar2LottieAnimator$2 extends Lambda implements a	// class@001ab4
{
    public final NearbyFunctionMatchView this$0;

    public void NearbyFunctionMatchView$avatar2LottieAnimator$2(NearbyFunctionMatchView p0){
       this.this$0 = p0;
       super(0);
    }
    public final ObjectAnimator invoke(){
       NearbyFunctionMatchView$avatar2LottieAnimator$2 obj = PatchProxy.apply(null, this, NearbyFunctionMatchView$avatar2LottieAnimator$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.this$0;
       float[] uofloatArray = new float[]{obj.I,0};
       return ObjectAnimator.ofFloat(obj.G, View.TRANSLATION_X, uofloatArray);
    }
    public Object invoke(){
       return this.invoke();
    }
}
