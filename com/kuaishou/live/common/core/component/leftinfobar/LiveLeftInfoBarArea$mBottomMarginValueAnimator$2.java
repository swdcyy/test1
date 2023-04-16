package com.kuaishou.live.common.core.component.leftinfobar.LiveLeftInfoBarArea$mBottomMarginValueAnimator$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import android.animation.ValueAnimator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LiveLeftInfoBarArea$mBottomMarginValueAnimator$2 extends Lambda implements a	// class@00144e
{
    public static final LiveLeftInfoBarArea$mBottomMarginValueAnimator$2 INSTANCE;

    static {
       LiveLeftInfoBarArea$mBottomMarginValueAnimator$2.INSTANCE = new LiveLeftInfoBarArea$mBottomMarginValueAnimator$2();
    }
    public void LiveLeftInfoBarArea$mBottomMarginValueAnimator$2(){
       super(0);
    }
    public final ValueAnimator invoke(){
       Object obj = PatchProxy.apply(null, this, LiveLeftInfoBarArea$mBottomMarginValueAnimator$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return ValueAnimator.ofFloat(new float[2]{0,0x3f800000});
    }
    public Object invoke(){
       return this.invoke();
    }
}
