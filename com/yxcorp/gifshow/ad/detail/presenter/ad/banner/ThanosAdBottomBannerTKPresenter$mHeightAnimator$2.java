package com.yxcorp.gifshow.ad.detail.presenter.ad.banner.ThanosAdBottomBannerTKPresenter$mHeightAnimator$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import android.animation.ValueAnimator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class ThanosAdBottomBannerTKPresenter$mHeightAnimator$2 extends Lambda implements a	// class@00159f
{
    public static final ThanosAdBottomBannerTKPresenter$mHeightAnimator$2 INSTANCE;

    static {
       ThanosAdBottomBannerTKPresenter$mHeightAnimator$2.INSTANCE = new ThanosAdBottomBannerTKPresenter$mHeightAnimator$2();
    }
    public void ThanosAdBottomBannerTKPresenter$mHeightAnimator$2(){
       super(0);
    }
    public final ValueAnimator invoke(){
       Object obj = PatchProxy.apply(null, this, ThanosAdBottomBannerTKPresenter$mHeightAnimator$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return ValueAnimator.ofFloat(new float[2]{0,0x3f800000});
    }
    public Object invoke(){
       return this.invoke();
    }
}
